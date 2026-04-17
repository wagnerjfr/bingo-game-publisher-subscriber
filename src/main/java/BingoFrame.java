import javax.swing.*;
import java.awt.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BingoFrame extends JFrame {

    private static final List<String> PLAYERS = java.util.Arrays.asList("Mary", "John", "Mark", "Ana", "Paul");

    private final JLabel currentNumberLabel;
    private final JTextArea logArea;
    private final JButton startButton;
    private final JButton stopButton;
    private final JSpinner delaySpinner;
    private final Map<String, PlayerPanel> playerPanels = new LinkedHashMap<>();

    private ExecutorService executor;

    public BingoFrame() {
        super("Bingo - Publisher/Subscriber");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);

        JPanel root = new JPanel(new BorderLayout(10, 10));
        root.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        currentNumberLabel = new JLabel("Current number: -", JLabel.CENTER);
        currentNumberLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22));
        root.add(currentNumberLabel, BorderLayout.NORTH);

        JPanel center = new JPanel(new GridLayout(2, 3, 10, 10));
        for (String player : PLAYERS) {
            PlayerPanel panel = new PlayerPanel(player);
            playerPanels.put(player, panel);
            center.add(panel);
        }
        root.add(center, BorderLayout.CENTER);

        JPanel right = new JPanel(new BorderLayout(8, 8));
        logArea = new JTextArea();
        logArea.setEditable(false);
        right.add(new JScrollPane(logArea), BorderLayout.CENTER);

        JPanel controls = new JPanel(new GridLayout(2, 2, 8, 8));
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        delaySpinner = new JSpinner(new SpinnerNumberModel(50, 0, 5000, 10));
        stopButton.setEnabled(false);
        controls.add(new JLabel("Delay (ms):"));
        controls.add(delaySpinner);
        controls.add(startButton);
        controls.add(stopButton);
        right.add(controls, BorderLayout.SOUTH);

        root.add(right, BorderLayout.EAST);
        add(root);

        startButton.addActionListener(e -> startGame());
        stopButton.addActionListener(e -> stopGame());
    }

    private void startGame() {
        startButton.setEnabled(false);
        stopButton.setEnabled(true);
        logArea.setText("");
        currentNumberLabel.setText("Current number: -");
        for (PlayerPanel panel : playerPanels.values()) {
            panel.setWinner(false);
        }

        GameEventListener uiListener = new GameEventListener() {
            @Override
            public void onNumberDrawn(int number, List<Integer> remainingNumbers) {
                SwingUtilities.invokeLater(() -> {
                    currentNumberLabel.setText("Current number: " + number);
                    log("Number drawn: " + number + " (remaining=" + remainingNumbers.size() + ")");
                });
            }

            @Override
            public void onPlayerUpdate(String playerName, Map<Integer, Boolean> cardState, boolean hit) {
                SwingUtilities.invokeLater(() -> {
                    PlayerPanel panel = playerPanels.get(playerName);
                    if (panel != null) {
                        panel.updateCard(cardState);
                    }
                    log(playerName + (hit ? " hit!" : " miss."));
                });
            }

            @Override
            public void onWinner(String winnerName) {
                SwingUtilities.invokeLater(() -> {
                    log("WINNER: " + winnerName);
                    PlayerPanel panel = playerPanels.get(winnerName);
                    if (panel != null) {
                        panel.setWinner(true);
                    }
                    startButton.setEnabled(true);
                    stopButton.setEnabled(false);
                });
            }

            @Override
            public void onNoWinner() {
                SwingUtilities.invokeLater(() -> {
                    log("No winner this round.");
                    startButton.setEnabled(true);
                    stopButton.setEnabled(false);
                });
            }
        };

        long drawDelayMs = ((Number) delaySpinner.getValue()).longValue();
        Caller caller = new Caller(uiListener, drawDelayMs);
        executor = Executors.newFixedThreadPool(6);
        executor.submit(new Player("Mary", caller, uiListener));
        executor.submit(new Player("John", caller, uiListener));
        executor.submit(new Player("Mark", caller, uiListener));
        executor.submit(new Player("Ana", caller, uiListener));
        executor.submit(new Player("Paul", caller, uiListener));
        executor.submit(caller);
        executor.shutdown();
    }

    private void stopGame() {
        if (executor != null && !executor.isTerminated()) {
            executor.shutdownNow();
            try {
                executor.awaitTermination(2, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        log("Game stopped.");
        startButton.setEnabled(true);
        stopButton.setEnabled(false);
    }

    private void log(String message) {
        logArea.append(message + System.lineSeparator());
        logArea.setCaretPosition(logArea.getDocument().getLength());
    }
}