import java.util.List;
import java.util.Map;

public interface GameEventListener {

    GameEventListener NONE = new GameEventListener() { };

    default void onNumberDrawn(int number, List<Integer> remainingNumbers) {
    }

    default void onPlayerUpdate(String playerName, Map<Integer, Boolean> cardState, boolean hit) {
    }

    default void onWinner(String winnerName) {
    }

    default void onNoWinner() {
    }
}