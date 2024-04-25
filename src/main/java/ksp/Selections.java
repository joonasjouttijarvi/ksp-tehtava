package ksp;

import java.util.Random;

/** Enum Selections määrittelee kiven, paperin ja sakset ja niiden valinnan. */
public enum Selections {
  ROCK,
  PAPER,
  SCISSORS;

  /**
   * Palauttaa satunnaisen valinnan kiven, paperin ja sakset välillä käyttäen
   * java.util.Random-luokkaa.
   */
  private static final Random RANDOM = new Random();

  public static Selections value() {
    return values()[RANDOM.nextInt(values().length)];
  }
}
