import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Card {

    private final Map<Integer, Boolean> numbers;
    private final Random random;

    public Card() {
        this(new Random());
    }

    public Card(Random random) {
        this.random = random;
        numbers = new TreeMap<>();
        int i = 0;
        while (i < 8) {
            int nextNumber = random.nextInt(50) + 1;
            if (!numbers.containsKey(nextNumber)) {
                numbers.put(nextNumber, false);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
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
