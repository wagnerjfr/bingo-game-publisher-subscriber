import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    private static final long DEFAULT_DELAY_MS = 50L;

    public static void main(String args[]) {
        GameLogger.setVerboseRouletteLogging(true);

        long drawDelayMs = parseDelay(args);

        Caller caller = new Caller(GameEventListener.NONE, drawDelayMs);

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

    private static long parseDelay(String[] args) {
        if (args == null || args.length == 0) {
            return DEFAULT_DELAY_MS;
        }

        try {
            return Math.max(0L, Long.parseLong(args[0]));
        } catch (NumberFormatException e) {
            return DEFAULT_DELAY_MS;
        }
    }
}
