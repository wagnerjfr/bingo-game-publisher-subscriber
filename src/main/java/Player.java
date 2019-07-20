import java.util.*;

public class Player implements Listener, Runnable {

    private String name;
    private Publisher caller;
    private Card card;
    private boolean hasWinner = false;

    public Player(String name, Publisher caller) {
        this.name = name;
        this.caller = caller;
        caller.subscribe(this);
        card = new Card();
    }

    public void run() {
        while (!hasWinner) {  }
    }

    public void onEvent(Integer number) {
        if (card.containsKey(number)) {
            card.markNumber(number);
            System.out.println(name + ": :) YES!");
        }
        else {
            System.out.println(name + ": :( Noo..");
        }
        System.out.println(name + ": " + card);
        if (card.checkCard()) {
            caller.inform(this);
        }
    }

    public String getName() {
        return this.name;
    }

    public void stop() {
        hasWinner = true;
    }
}
