package src.test.ksp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Luokka PlayerTest testaa pelaajan toiminnallisuutta.
 */
class PlayerTest {

    @Test
    void pelaajanValinta() { 

      pelaajanValinta();
      
    }

    @Test
    void increaseWins() {
        increaseWins();
        assertEquals(0, 0);
    }

    @Test
    void getWins() {
      getWins();
      assertEquals(0, 0);
    }
}
