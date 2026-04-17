public final class GameLogger {

    private static volatile boolean verboseRouletteLogging = true;

    private GameLogger() {
    }

    public static void setVerboseRouletteLogging(boolean verbose) {
        verboseRouletteLogging = verbose;
    }

    public static void callerNumber(int number) {
        System.out.println("[CALLER] Number drawn: " + number);
    }

    public static void playerHit(String playerName, Card card) {
        System.out.println("[PLAYER] " + playerName + " HIT | card=" + card);
    }

    public static void playerMiss(String playerName, Card card) {
        System.out.println("[PLAYER] " + playerName + " MISS | card=" + card);
    }

    public static void playerBingo(String playerName) {
        System.out.println("[PLAYER] " + playerName + " BINGO!");
    }

    public static void winner(String playerName) {
        System.out.println("[GAME] WINNER: " + playerName.toUpperCase());
    }

    public static void noWinner() {
        System.out.println("[GAME] No winner this round.");
    }

    public static void numbersRemaining(int count) {
        System.out.println("[ROULETTE] Remaining numbers: " + count);
    }

    public static void numbersRemaining(java.util.List<Integer> numbers) {
        if (verboseRouletteLogging) {
            System.out.println("Available numbers: " + numbers);
        } else {
            numbersRemaining(numbers.size());
        }
    }
}