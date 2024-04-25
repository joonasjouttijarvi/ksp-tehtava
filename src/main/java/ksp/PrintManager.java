package ksp;
/**
 * Luokka PrintManager määrittelee tulostusmetodit.
 *
 * @author Joonas Jouttijärvi
 */
public class PrintManager {

  /**
   * @param round
   *              Tulostaa erän numeron.
   */
  public static void printRound(int round) {
    System.out.println(STR."Erä: \{round} =====================\n");
  }

  /**
   * @param draws
   *              Tulostaa tasapelien lukumäärän.
   */
  public static void printDraws(int draws) {
    System.out.println(STR."Tasapelien lukumäärä: \{draws}\n");
  }

  /**
   * @param playerNumber
   * @param choice
   * @param wins
   * Tulostaa pelaajan valinnan ja voittojen lukumäärän.
   */
  public static void printPlayerChoice(int playerNumber, Selections choice,
                                       int wins) {
    System.out.println(STR."Pelaaja \{playerNumber} valitsi: \{choice} \n");
  }

  /**
   * @param playerNumber
   *                     Tulostaa voittajan.
   */
  public static void printWinner(int playerNumber) {
    System.out.println(STR."Pelaaja \{playerNumber} voittaa");
  }

  /**
   * Tulostaa tasapelin.
   */
  public static void printDraw() { System.out.println("\n\t\t\t Tasapeli \n"); }

  /**
   * Tulostaa pelin lopun.
   */
  public static void printGameEnd() {
    System.out.println("KOLME VOITTOA - PELI PÄÄTTYY");
  }
}
