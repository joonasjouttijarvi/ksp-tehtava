package ksp;

public class ConsoleOutputManager implements OutputManager {

  /**
   * @param round Tulostaa erän numeron.
   */
  @Override
  public void printRound(int round) {
    System.out.println(STR."Erä: \{round} =====================\n");
  }

  /**
   * @param draws Tulostaa tasapelien lukumäärän.
   */
  @Override
  public void printDraws(int draws) {
    System.out.println(STR."Tasapelien lukumäärä: \{draws}\n");
  }

  /**
   * @param playerNumber
   * @param choice
   * @param wins Tulostaa pelaajan valinnan ja voittojen lukumäärän.
   */
  @Override
  public void printPlayerChoice(int playerNumber, Selections choice, int wins) {
    System.out.println(STR."Pelaaja \{playerNumber} valitsi: \{choice} \n");
  }

  /**
   * @param playerNumber Tulostaa voittajan.
   */
  @Override
  public void printWinner(int playerNumber) {
    System.out.println(STR."Pelaaja \{playerNumber} voittaa");
  }

  /** Tulostaa tasapelin. */
  @Override
  public void printDraw() {
    System.out.println("\n\t\t\t Tasapeli \n");
  }

  /** Tulostaa pelin lopun. */
  @Override
  public void printGameEnd() {
    System.out.println("KOLME VOITTOA - PELI PÄÄTTYY");
  }
}

