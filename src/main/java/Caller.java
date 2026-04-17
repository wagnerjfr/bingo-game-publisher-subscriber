import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class Caller implements Publisher, Runnable {
    private static final long DEFAULT_DRAW_DELAY_MS = 50L;

    private final List<Listener> subscribers;
    private final Roulette roulette;
    private final AtomicReference<Listener> winner;
    private final GameEventListener gameEventListener;
    private final long drawDelayMs;

    public Caller() {
        this(GameEventListener.NONE, DEFAULT_DRAW_DELAY_MS);
    }

    public Caller(GameEventListener gameEventListener) {
        this(gameEventListener, DEFAULT_DRAW_DELAY_MS);
    }

    public Caller(GameEventListener gameEventListener, long drawDelayMs) {
        subscribers = new CopyOnWriteArrayList<>();
        roulette = new Roulette();
        winner = new AtomicReference<>();
        this.gameEventListener = gameEventListener;
        this.drawDelayMs = Math.max(0L, drawDelayMs);
    }

    public void subscribe(Listener listener) {
        this.subscribers.add(listener);
    }

    public void unsubscribe(Listener listener) {
        this.subscribers.remove(listener);
    }

    public void inform(Listener winner) {
        if (this.winner.compareAndSet(null, winner)) {
            for (Listener subscriber : subscribers) {
                subscriber.stop();
            }
        }
    }

    public void run() {
        int number;
        try {
            while (winner.get() == null && roulette.hasNumbers()) {
                number = roulette.getNumber();
                GameLogger.callerNumber(number);
                gameEventListener.onNumberDrawn(number, roulette.getRemainingNumbersSnapshot());
                sendNumber(number);
                Thread.sleep(drawDelayMs);
            }
            Listener currentWinner = winner.get();
            if (currentWinner != null) {
                GameLogger.winner(currentWinner.getListenerName());
                gameEventListener.onWinner(currentWinner.getListenerName());
            } else {
                GameLogger.noWinner();
                gameEventListener.onNoWinner();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void sendNumber(int number) {
        for (Listener subscriber : subscribers) {
            subscriber.onEvent(number);
        }
    }
}
