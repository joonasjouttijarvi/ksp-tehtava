package ksp;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Testiluokka Game-luokalle.
 */
public class GameTest {

  @Test
  public void testGetResult() {
    assertEquals(Result.DRAW, Game.getResult(Selections.ROCK, Selections.ROCK));
    assertEquals(Result.WIN,
                 Game.getResult(Selections.ROCK, Selections.SCISSORS));
    assertEquals(Result.LOSE,
                 Game.getResult(Selections.ROCK, Selections.PAPER));

    assertEquals(Result.LOSE,
                 Game.getResult(Selections.SCISSORS, Selections.ROCK));
    assertEquals(Result.DRAW,
                 Game.getResult(Selections.SCISSORS, Selections.SCISSORS));
    assertEquals(Result.WIN,
                 Game.getResult(Selections.SCISSORS, Selections.PAPER));

    assertEquals(Result.WIN, Game.getResult(Selections.PAPER, Selections.ROCK));
    assertEquals(Result.LOSE,
                 Game.getResult(Selections.PAPER, Selections.SCISSORS));
    assertEquals(Result.DRAW,
                 Game.getResult(Selections.PAPER, Selections.PAPER));
  }
}
