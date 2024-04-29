package ksp;

import java.util.Random;

public enum Selections {
  KIVI,
  PAPERI,
  SAKSET;

  private static final Random RANDOM = new Random();

  public static Selections value() {
    return values()[RANDOM.nextInt(values().length)];
  }

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
