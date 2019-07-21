import java.util.Map;
import java.util.TreeMap;

public class Card {

    private Map<Integer, Boolean> numbers;

    public Card() {
        numbers = new TreeMap<>();
        int i = 0;
        while (i < 8) {
            int random = (int)(Math.random() * 50 + 1);
            if (!numbers.containsKey(random)) {
                numbers.put(random, false);
                i++;
            }
        }
    }

    public boolean containsKey(int number) {
        return numbers.containsKey(number);
    }

    public void markNumber(int number) {
        numbers.put(number, true);
    }

    public boolean checkCard() {
        boolean result = true;
        for (Map.Entry<Integer, Boolean> c : numbers.entrySet()) {
            if (!c.getValue()) {
                result = false;
                break;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return numbers.toString();
    }
}
