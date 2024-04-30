package ksp;

/** Game luokka käynnistää pelin ja hallinnoi pelin kulkua. */
public class Game {

  private static final int WINS_REQUIRED = 3;
  private final Player p1;
  private final Player p2;
  private final OutputManager outputManager;

  public static void main(String[] args) {
    Game game = new Game();
    game.run();
  }
  /**
   * Konstruktori luo kaksi pelaajaa ja OutputManagerin.
   */
  public Game() {
    this.p1 = new Player();
    this.p2 = new Player();
    this.outputManager = new ConsoleOutputManager();
  }

    /**
     * Käynnistää pelin ja hallinnoi pelin kulkua.
     */
  public void run() {
    int playedGames = 0;
    boolean gameEnd;

    do {
      playedGames++;
      outputManager.printRound(playedGames);

      playRound();

      gameEnd = checkGameEndCondition();

    } while (!gameEnd);

    outputManager.printGameEnd();
  }

    /**
     * Pelaa yhden kierroksen peliä.
     */
  private void playRound() {
    Selections p1Selection = p1.playerChoice();
    Selections p2Selection = p2.playerChoice();

    outputManager.printPlayerChoice(1, p1Selection, p1.getWins());
    outputManager.printPlayerChoice(2, p2Selection, p2.getWins());

    Result result = p1Selection.getResultAgainst(p2Selection);
    handleAndPrintResult(result);
  }

  /**
   * Tarkistaa pelin loppumisehdon
   *
   * @return true, jos jompikumpi pelaajista on saavuttanut voittomäärän
   */

  private boolean checkGameEndCondition() {
    return p1.getWins() >= WINS_REQUIRED || p2.getWins() >= WINS_REQUIRED;
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
