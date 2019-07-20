import java.util.*;

public class Player implements Listener, Runnable {

    private String name;
    private Publisher caller;
    private boolean hasWinner = false;
    private Map<Integer, Boolean> card;

    public Player(String name, Publisher caller) {
        this.name = name;
        this.caller = caller;
        caller.subscribe(this);

        card = new TreeMap<Integer, Boolean>();
        int i = 0;
        while (i < 9) {
            int random = (int)(Math.random() * 50 + 1);
            if (!card.containsKey(random)) {
                card.put(random, false);
                i++;
            }
        }
    }

    public void run() {
        while (!hasWinner) {  }
    }

    public void onEvent(Integer number) {
        if (card.containsKey(number)) {
            card.put(number, true);
            System.out.println(name + ": :) YES!");
        }
        else {
            System.out.println(name + ": :( Noo..");
        }
        System.out.println(name + ": " + card);
        if (checkCard()) {
            caller.inform(this);
        }
    }

    private boolean checkCard() {
        boolean result = true;
        for (Map.Entry<Integer, Boolean> c : card.entrySet()) {
            if (!c.getValue()) {
                result = false;
                break;
            }
        }
        return result;
    }

    public String getName() {
        return this.name;
    }

    public void stop() {
        hasWinner = true;
    }
}
