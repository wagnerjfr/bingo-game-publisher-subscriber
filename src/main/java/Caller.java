import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class Caller implements Publisher, Runnable {
    private final List<Listener> subscribers;
    private final Roulette roulette;
    private final AtomicReference<Listener> winner;

    public Caller() {
        subscribers = new CopyOnWriteArrayList<>();
        roulette = new Roulette();
        winner = new AtomicReference<>();
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
                sendNumber(number);
                Thread.sleep(50);
            }
            Listener currentWinner = winner.get();
            if (currentWinner != null) {
                GameLogger.winner(currentWinner.getListenerName());
            } else {
                GameLogger.noWinner();
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
