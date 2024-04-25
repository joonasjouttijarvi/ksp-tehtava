package ksp;
/**
 * Luokka Pelaaja määrittelee pelaajan ja hänen toimintonsa.
 * @author Joonas Jouttijärvi
 */
public class Player {

  private int wins;
  private int allWins;

  /**
   * Valitsee satunnaisesti kiven, paperin tai sakset.
   * @return selection, joka on joko kivi, paperi tai sakset.
   */
  public Selections playerChoice() {
    return Selections.value();
  }

  /**
   * Kasvattaa voittojen lukumäärää yhdellä.
   */
  public void increaseWins() {
    wins++;
    allWins++;
  }

  /**
   * Palauttaa voittojen lukumäärän.
   * @return wins, joka on voittojen lukumäärä.
   */
  public int getWins() {
    return wins;
  }
}
