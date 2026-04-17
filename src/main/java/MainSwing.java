import javax.swing.SwingUtilities;

public class MainSwing {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BingoFrame frame = new BingoFrame();
            frame.setVisible(true);
        });
    }
}