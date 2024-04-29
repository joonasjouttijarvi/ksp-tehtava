package ksp;

public class Game {

  private static final int WINS_REQUIRED = 3;

  public static void main(final String[] args) {
    final Player p1 = new Player();
    final Player p2 = new Player();
    final OutputManager outputManager = new ConsoleOutputManager();

    runGame(p1, p2, outputManager);
  }

  /**
 * @param p1
 * @param p2
 * @param outputManager
 * Käynnistää pelin ja tulostaa sen etenemisen.
 */
private static void runGame(Player p1, Player p2, OutputManager outputManager) {
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
      handleAndPrintResult(result, p1, p2, outputManager);

      if (p1.getWins() >= WINS_REQUIRED || p2.getWins() >= WINS_REQUIRED) {
        gameEnd = true;
        outputManager.printGameEnd();
      }
    } while (!gameEnd);
  }

  /**
 * @param result
 * @param p1
 * @param p2
 * @param outputManager
 * Käsittelee ja tulostaa pelin tuloksen. OutputManagerin avulla tulostetaan voittaja.
 */
private static void handleAndPrintResult(
      Result result, Player p1, Player p2, OutputManager outputManager) {
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
