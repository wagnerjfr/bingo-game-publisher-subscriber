import java.util.ArrayList;
import java.util.List;

public class Caller implements Publisher, Runnable {
    private List<Listener> subscribers;
    private Roulette roulette;
    private Listener winner = null;

    public Caller() {
        subscribers = new ArrayList<Listener>();
        roulette = new Roulette();
    }

    public void subscribe(Listener listener) {
        this.subscribers.add(listener);
    }

    public void unsubscribe(Listener listener) {
        this.subscribers.remove(listener);
    }

    public void inform(Listener winner) {
        this.winner = winner;
        for (Listener subscriber : subscribers) {
            subscriber.stop();
        }
    }

    public void run() {
        int number;
        try {
            while (winner == null) {
                number = roulette.getNumber();
                System.out.println("## Caller: the number is.. " + number);
                sendNumber(number);
                Thread.sleep(50);
            }
            System.out.println("## Caller: THE WINNER IS " + ((Player)winner).getName().toUpperCase() + " !!!");
            System.exit(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void sendNumber(int number) {
        for (Listener subscriber : subscribers) {
            subscriber.onEvent(number);
        }
    }
}
