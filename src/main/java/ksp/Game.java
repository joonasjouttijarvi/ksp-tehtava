package ksp;

import java.util.HashMap;
import java.util.Map;

public class Game {

  private static final Map<Selections, Selections> WINNING_COMBINATIONS = new HashMap<>();
  private static final int WINS_REQUIRED = 3;

  static {
    WINNING_COMBINATIONS.put(Selections.ROCK, Selections.SCISSORS);
    WINNING_COMBINATIONS.put(Selections.SCISSORS, Selections.PAPER);
    WINNING_COMBINATIONS.put(Selections.PAPER, Selections.ROCK);
  }

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
      handleResult(result, p1, p2, draws);

      playedGames++;
      if (p1.getWins() >= WINS_REQUIRED || p2.getWins() >= WINS_REQUIRED) {
        gameEnd = true;
        PrintManager.printGameEnd();
      }
    } while (!gameEnd);
  }

  static Result getResult(final Selections p1Selection, final Selections p2Selection) {
    if (p1Selection == p2Selection) {
      return Result.DRAW;
    }
    return WINNING_COMBINATIONS.get(p1Selection) == p2Selection ? Result.WIN : Result.LOSE;
  }

  static void handleResult(Result result, Player p1, Player p2, int draws) {
    if (result == Result.WIN) {
      PrintManager.printWinner(1);
      p1.increaseWins();
    } else if (result == Result.LOSE) {
      PrintManager.printWinner(2);
      p2.increaseWins();
    } else if (result == Result.DRAW) {
      PrintManager.printDraw();
      draws++;
    }
  }
}
