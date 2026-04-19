# :busts_in_silhouette: `bingo-game-publisher-subscriber`

It's a *publisher/subscriber* multi-thread **Bingo simulation game** with 5 players.

`Mary`, `John`, `Mark`, `Ana` and `Paul` try their luck in a Bingo. Who is going to win?

Each player has one card with 8 numbers (randomly selected from **1 to 50**).

Who first fills all the numbers in the card `BINGO!`, wins!

## Full Articles:
### ⭐ [Java Multi-Threading in Action: Implementing a Competitive Bingo Game](https://medium.com/itnext/java-multi-threading-in-action-implementing-a-competitive-bingo-game-023429a5c6cc)
_Publish-Subscribe Showdown: Five Players Vie for Bingo Supremacy_

### ⭐ [Java Multi-Threading in Action (Update): Building a Competitive Bingo Game with Publisher/Subscriber + Swing UI](https://medium.com/itnext/java-multi-threading-in-action-update-building-a-competitive-bingo-game-with-5790c23cb277)
_From console simulation to event-driven architecture, safer concurrency, and live UI visualization_

## What's New

- Added a **Swing UI mode** (`MainSwing`) with live game visualization.
- Added configurable caller draw delay (**sleep option**) in both console and UI modes.
- Added `GameEventListener` to bridge engine events to UI updates.
- Migrated orchestration to `ExecutorService` for cleaner thread lifecycle management.

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

## Swing UI (Latest)

The project now includes a Swing-based interface:

- `MainSwing`: UI entry point
- `BingoFrame`: main window with controls and game state
- `PlayerPanel`: visual card component for each player

### UI Features

- **Start/Stop** game controls
- **Current number** display
- **5 live player panels** (Mary, John, Mark, Ana, Paul)
- **Card updates in real time** (hit/miss feedback)
- **Winner highlight** on winning player panel
- **Event log** panel
- **Delay (ms)** spinner to control draw speed before starting

All Swing updates are executed safely on the EDT via `SwingUtilities.invokeLater(...)`.

## Execution Model (Latest)

The application now uses `ExecutorService` in `Main` instead of manual thread creation:

- fixed thread pool with 6 workers (5 players + 1 caller)
- task submission via `executor.submit(...)`
- graceful shutdown with `shutdown()` and `awaitTermination(...)`
- interruption-safe fallback with `shutdownNow()`

This makes lifecycle handling clearer and easier to maintain.

## Engine ↔ UI Event Bridge

`GameEventListener` was introduced so game logic can notify external listeners (like the Swing UI) without coupling core engine classes to UI components.

Events include:

- number drawn
- player card update (with hit/miss)
- winner found
- no-winner outcome

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

Run with custom delay (ms) using CLI args (example: `150`):

```bash
mvn -q exec:java -Dexec.mainClass=Main -Dexec.args="150"
```

Run with custom caller delay in milliseconds (example: 150ms):

```bash
mvn -q exec:java -Dexec.mainClass=Main -Dexec.args="150"
```

Or build a jar and run it:

```bash
mvn -q package
java -jar target/bingo-1.0-SNAPSHOT.jar
```

Swing UI mode:

```bash
mvn -q exec:java -Dexec.mainClass=MainSwing
```

In Swing mode, delay is configurable via the **Delay (ms)** control before pressing Start.

## Key Classes

- `Caller`: publisher + game loop, winner control, configurable draw delay
- `Player`: listener/subscriber with card marking logic
- `Card`: 8-number card model with mark/check helpers
- `Roulette`: random draw source from 1..50 without repetition
- `GameEventListener`: engine event callback contract
- `GameLogger`: centralized logging with verbose/compact roulette modes
- `BingoFrame` / `PlayerPanel`: Swing UI layer
