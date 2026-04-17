import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Roulette {

    private final List<Integer> numbers;
    private final Random random;

    public Roulette() {
        this(new Random());
    }

    public Roulette(Random random) {
        this.random = random;
        numbers = new ArrayList<>(50);
        for (int i = 1; i <= 50; i++) {
            numbers.add(i);
        }
    }

    public int getNumber() {
        int randomIndex = random.nextInt(numbers.size());
        int number = numbers.get(randomIndex);
        numbers.remove(randomIndex);
        GameLogger.numbersRemaining(numbers);
        return number;
    }

    public boolean hasNumbers() {
        return !numbers.isEmpty();
    }

    public List<Integer> getRemainingNumbersSnapshot() {
        return new ArrayList<>(numbers);
    }

}
