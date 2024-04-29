package ksp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/** Luokka PlayerTest testaa pelaajan toiminnallisuutta */
class PlayerTest {

  @Test
  void playerChoice() {
    Player Player = new Player();
    Selections selection = Player.playerChoice();
    assertNotNull(selection);
  }

  @Test
  void increaseWins() {
    Player Player = new Player();
    Player.increaseWins();
    assertEquals(1, Player.getWins());
  }

  @Test
  void getWins() {
    Player Player = new Player();
    assertEquals(0, Player.getWins());
  }
}
