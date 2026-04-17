import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Player implements Listener, Runnable {

    private final String name;
    private final Publisher caller;
    private final Card card;
    private final GameEventListener gameEventListener;
    private final AtomicBoolean hasWinner = new AtomicBoolean(false);

    public Player(String name, Publisher caller) {
        this(name, caller, GameEventListener.NONE);
    }

    public Player(String name, Publisher caller, GameEventListener gameEventListener) {
        this.name = name;
        this.caller = caller;
        this.gameEventListener = gameEventListener;
        caller.subscribe(this);
        card = new Card();
    }

    public void run() {
        synchronized (this) {
            while (!hasWinner.get()) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    public void onEvent(Integer number) {
        if (hasWinner.get()) {
            return;
        }
        if (card.containsNumber(number)) {
            card.markNumber(number);
            GameLogger.playerHit(name, card);
            gameEventListener.onPlayerUpdate(name, card.getNumbersSnapshot(), true);
        } else {
            GameLogger.playerMiss(name, card);
            gameEventListener.onPlayerUpdate(name, card.getNumbersSnapshot(), false);
        }
        if (card.checkCard()) {
            GameLogger.playerBingo(name);
            caller.inform(this);
        }
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String getListenerName() {
        return name;
    }

    public void stop() {
        hasWinner.set(true);
        synchronized (this) {
            notifyAll();
        }
    }
}
