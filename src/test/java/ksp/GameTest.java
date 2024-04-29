package ksp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** Testiluokka Game-luokalle. */
class GameTest {

  /** Testaa getResult-metodia. */
  @Test
  void testGetResult() {
    assertEquals(Result.DRAW, Selections.KIVI.getResultAgainst(Selections.KIVI));
    assertEquals(Result.WIN, Selections.KIVI.getResultAgainst(Selections.SAKSET));
    assertEquals(Result.LOSE, Selections.KIVI.getResultAgainst(Selections.PAPERI));

    assertEquals(Result.LOSE, Selections.SAKSET.getResultAgainst(Selections.KIVI));
    assertEquals(Result.DRAW, Selections.SAKSET.getResultAgainst(Selections.SAKSET));
    assertEquals(Result.WIN, Selections.SAKSET.getResultAgainst(Selections.PAPERI));

    assertEquals(Result.WIN, Selections.PAPERI.getResultAgainst(Selections.KIVI));
    assertEquals(Result.LOSE, Selections.PAPERI.getResultAgainst(Selections.SAKSET));
    assertEquals(Result.DRAW, Selections.PAPERI.getResultAgainst(Selections.PAPERI));
  }
}