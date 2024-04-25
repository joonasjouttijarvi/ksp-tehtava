package ksp;

import java.util.HashMap;
import java.util.Map;

/** Luokka Game määrittelee pelin kulun. */
public class Game {

  private static final Map<Selections, Selections> WINNING_COMBINATIONS = new HashMap<>();

  static {
    WINNING_COMBINATIONS.put(Selections.ROCK, Selections.SCISSORS);
    WINNING_COMBINATIONS.put(Selections.SCISSORS, Selections.PAPER);
    WINNING_COMBINATIONS.put(Selections.PAPER, Selections.ROCK);
  }

  /**
   * @param args Pääohjelma, joka käynnistää pelin.
   */
  public static void main(final String args[]) {
    final Player p1 = new Player();
    final Player p2 = new Player();
    boolean gameEnd = false;
    int playedGames = 0;
    int draws = 0;
    Selections p1Selection;
    Selections p2Selection;

    do {
      PrintManager.printRound(playedGames);
      PrintManager.printDraws(draws);
      p1Selection = p1.playerChoice();
      PrintManager.printPlayerChoice(1, p1Selection, p1.getWins());
      p2Selection = p2.playerChoice();
      PrintManager.printPlayerChoice(2, p2Selection, p2.getWins());

      final Result result = getResult(p1Selection, p2Selection);
      switch (result) {
        case WIN:
          PrintManager.printWinner(1);
          p1.increaseWins();
          break; 
        case LOSE:
          PrintManager.printWinner(2);
          p2.increaseWins();
          break;
        case DRAW:
          PrintManager.printDraw();
          draws++;
          break;
      }

      playedGames++;
      if (p1.getWins() >= 3 || p2.getWins() >= 3) {
        gameEnd = true;
        PrintManager.printGameEnd();
      }
      System.out.println();
    } while (!gameEnd);
  }

  /**
   * @param p1Selection
   * @param p2Selection
   * @return Palauttaa pelin tuloksen.
   */
  static Result getResult(final Selections p1Selection, final Selections p2Selection) {
    if (p1Selection == p2Selection) {
      return Result.DRAW;
    }
    return WINNING_COMBINATIONS.get(p1Selection) == p2Selection ? Result.WIN : Result.LOSE;
  }
}
