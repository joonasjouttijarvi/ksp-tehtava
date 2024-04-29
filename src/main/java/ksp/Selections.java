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
    switch (this) {
      case KIVI:
        return other == SAKSET ? Result.WIN : Result.LOSE;
      case PAPERI:
        return other == KIVI ? Result.WIN : Result.LOSE;
      case SAKSET:
        return other == PAPERI ? Result.WIN : Result.LOSE;
    }
    throw new IllegalStateException("Unexpected value: " + this);
  }
}
