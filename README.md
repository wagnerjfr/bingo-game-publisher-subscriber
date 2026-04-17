# :busts_in_silhouette: `bingo-game-publisher-subscriber`

It's a *publisher/subscriber* multi-thread **Bingo simulation game** with 5 players.

`Mary`, `John`, `Mark`, `Ana` and `Paul` try their luck in a Bingo. Who is going to win?

Each player has one card with 8 numbers (randomly selected from **1 to 50**).

Who first fills all the numbers in the card `BINGO!`, wins!

## Full Article:
### [Java Multi-Threading in Action: Implementing a Competitive Bingo Game](https://medium.com/itnext/java-multi-threading-in-action-implementing-a-competitive-bingo-game-023429a5c6cc)
_Publish-Subscribe Showdown: Five Players Vie for Bingo Supremacy_

## Concurrency and Design Notes

Recent improvements applied to the project:

- Replaced player busy-wait with `wait()/notifyAll()` to avoid CPU spinning.
- Made winner election thread-safe with `AtomicReference` in `Caller`.
- Switched subscribers storage to `CopyOnWriteArrayList` for safer iteration during concurrent operations.
- Removed forced `System.exit(0)` shutdown and let threads terminate naturally.
- Added roulette exhaustion check (`hasNumbers`) to stop safely when no numbers remain.
- Decoupled winner reporting from concrete `Player` type by extending `Listener` with `getListenerName()`.
- Improved naming clarity in `Card` (`containsNumber` instead of `containsKey`).
- Increased testability by supporting injectable `Random` in `Card` and `Roulette` constructors.

## Execution Model (Latest)

The application now uses `ExecutorService` in `Main` instead of manual thread creation:

- fixed thread pool with 6 workers (5 players + 1 caller)
- task submission via `executor.submit(...)`
- graceful shutdown with `shutdown()` and `awaitTermination(...)`
- interruption-safe fallback with `shutdownNow()`

This makes lifecycle handling clearer and easier to maintain.

## Logging Strategy (Latest)

A centralized `GameLogger` was introduced to standardize output formatting across the app.

Current log categories include:

- caller number draw events
- player hit/miss/bingo events
- winner / no-winner game result
- roulette remaining numbers

Roulette logging is configurable:

- **Verbose mode**: prints full remaining list (e.g. `Available numbers: [2, 3, 6, ...]`)
- **Compact mode**: prints only count (e.g. `[ROULETTE] Remaining numbers: 14`)

Default behavior is configured in `Main`:

```java
GameLogger.setVerboseRouletteLogging(true);
```

## Build and Run

Compile:

```bash
mvn -q -DskipTests compile
```

Run:

```bash
mvn -q exec:java -Dexec.mainClass=Main
```

Or build a jar and run it:

```bash
mvn -q package
java -jar target/bingo-1.0-SNAPSHOT.jar
```
