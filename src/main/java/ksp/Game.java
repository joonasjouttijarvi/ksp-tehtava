package ksp;

/** Game luokka käynnistää pelin ja hallinnoi pelin kulkua. */
public class Game {

  private static final int WINS_REQUIRED = 3;
  private final Player p1;
  private final Player p2;
  private final OutputManager outputManager;

  public Game(Player p1, Player p2, OutputManager outputManager) {
    this.p1 = p1;
    this.p2 = p2;
    this.outputManager = outputManager;
  }

  public static void main(String[] args) {
    final Player p1 = new Player();
    final Player p2 = new Player();
    final OutputManager outputManager = new ConsoleOutputManager();

    Game game = new Game(p1, p2, outputManager);
    game.run();
  }

  /** Käynnistää pelin */
  public void run() {
    int playedGames = 0;
    boolean gameEnd = false;

    do {
      playedGames++;
      outputManager.printRound(playedGames);

      Selections p1Selection = p1.playerChoice();
      Selections p2Selection = p2.playerChoice();

      outputManager.printPlayerChoice(1, p1Selection, p1.getWins());
      outputManager.printPlayerChoice(2, p2Selection, p2.getWins());

      Result result = p1Selection.getResultAgainst(p2Selection);
      handleAndPrintResult(result);

      if (p1.getWins() >= WINS_REQUIRED || p2.getWins() >= WINS_REQUIRED) {
        gameEnd = true;
        outputManager.printGameEnd();
      }
    } while (!gameEnd);
  }

  /**
   * Käsittelee ja tulostaa pelin tuloksen
   *
   * @param result pelin tulos
   */
  private void handleAndPrintResult(Result result) {
    if (result == Result.WIN) {
      p1.increaseWins();
      outputManager.printWinner(1);
    } else if (result == Result.LOSE) {
      p2.increaseWins();
      outputManager.printWinner(2);
    } else if (result == Result.DRAW) {
      outputManager.printDraw();
    }
  }
}
