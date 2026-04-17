import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.LinkedHashMap;
import java.util.Map;

public class PlayerPanel extends JPanel {

    private final String playerName;
    private final Map<Integer, JLabel> labelsByNumber = new LinkedHashMap<>();

    public PlayerPanel(String playerName) {
        this.playerName = playerName;
        setLayout(new GridLayout(3, 3, 6, 6));
        setBorder(BorderFactory.createTitledBorder(playerName));
        setBackground(Color.WHITE);
    }

    public void updateCard(Map<Integer, Boolean> cardState) {
        removeAll();
        labelsByNumber.clear();

        for (Map.Entry<Integer, Boolean> entry : cardState.entrySet()) {
            JLabel label = new JLabel(String.valueOf(entry.getKey()), JLabel.CENTER);
            label.setOpaque(true);
            label.setBackground(entry.getValue() ? new Color(175, 255, 180) : new Color(245, 245, 245));
            label.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            labelsByNumber.put(entry.getKey(), label);
            add(label);
        }

        revalidate();
        repaint();
    }

    public void setWinner(boolean winner) {
        if (winner) {
            setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 140, 0), 2), playerName + " 🏆"));
        } else {
            setBorder(BorderFactory.createTitledBorder(playerName));
        }
    }
}