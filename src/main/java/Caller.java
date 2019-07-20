import java.util.ArrayList;
import java.util.List;

public class Caller implements Publisher, Runnable {
    private List<Listener> subscribers;
    private List<Integer> numbers;
    private Listener winner = null;

    public Caller() {
        subscribers = new ArrayList<Listener>();
        numbers = new ArrayList<Integer>(50);
        for (int i = 1; i <= 50; i++) {
            numbers.add(i);
        }
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
                number = callNumber();
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

    private int callNumber() {
        int random = (int)(Math.random() * numbers.size());
        int number = numbers.get(random);
        numbers.remove(random);
        System.out.println("Available numbers: " + numbers);
        return number;
    }
}
