import java.util.ArrayList;
import java.util.List;

public class Roulette {

    private List<Integer> numbers;

    public Roulette() {
        numbers = new ArrayList<>(50);
        for (int i = 1; i <= 50; i++) {
            numbers.add(i);
        }
    }

    public int getNumber() {
        int random = (int)(Math.random() * numbers.size());
        int number = numbers.get(random);
        numbers.remove(random);
        System.out.println("Available numbers: " + numbers);
        return number;
    }

}
