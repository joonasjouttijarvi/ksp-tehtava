package ksp;

/**
 * Luokka ConsoleOutputManager määrittelee OutputManager rajapinnan metodit.
 */ 
public class ConsoleOutputManager implements OutputManager {

  /**
   * Tulostaa erän numeron.
   * @param round erän numero
   */
  @Override
  public void printRound(int round) {
    System.out.println(STR."Erä: \{round} =====================\n");
  }

  /**
   * Tulostaa tasapelien lukumäärän.
   * @param draws  tasapelien lukumäärä.
   */
  @Override
  public void printDraws(int draws) {
    System.out.println(STR."Tasapelien lukumäärä: \{draws}\n");
  }

  /**
   * Tulostaa pelaajan valinnan ja voittojen lukumäärän.
   * @param playerNumber Pelaajan numero
   * @param choice Pelaajan valinta
   * @param wins Tulostaa pelaajan valinnan ja voittojen lukumäärän.
   */
  @Override
  public void printPlayerChoice(int playerNumber, Selections choice, int wins) {
    System.out.println(STR."Pelaaja \{playerNumber} valitsi: \{choice} \n");
  }

  /**
   * Tulostaa eplin voittajan
   * @param playerNumber Pelaajan numero
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

