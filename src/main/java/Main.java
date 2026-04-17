import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String args[]) {
        GameLogger.setVerboseRouletteLogging(true);

        Caller caller = new Caller();

        ExecutorService executor = Executors.newFixedThreadPool(6);
        executor.submit(new Player("Mary", caller));
        executor.submit(new Player("John", caller));
        executor.submit(new Player("Mark", caller));
        executor.submit(new Player("Ana", caller));
        executor.submit(new Player("Paul", caller));
        executor.submit(caller);

        executor.shutdown();

        try {
            if (!executor.awaitTermination(30, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
