package ksp;

import java.util.Random;

/**
 * Enum Selections määrittelee kiven, paperin ja sakset.
 */

public enum Selections {
  KIVI,
  PAPERI,
  SAKSET;

  private static final Random RANDOM = new Random();

  /**
   * @return Palauttaa satunnaisen valinnan kiven, paperin tai sakset.
   */
  public static Selections value() {
    return values()[RANDOM.nextInt(values().length)];
  }

  /**
   * @param other toisen pelaajan valinta
   * @return Palauttaa pelin tuloksen kiven, paperin tai sakset
   */
  public Result getResultAgainst(Selections other) {
    if (this == other) {
      return Result.DRAW;
    }
      return switch (this) {
          case KIVI -> other == SAKSET ? Result.WIN : Result.LOSE;
          case PAPERI -> other == KIVI ? Result.WIN : Result.LOSE;
          case SAKSET -> other == PAPERI ? Result.WIN : Result.LOSE;
      };
  }
}
