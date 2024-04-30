package ksp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void gameEndsWhenPlayerWinsRequiredRounds() {
        game.getP1().setWins(Game.WINS_REQUIRED);
        assertTrue(game.checkGameEndCondition());
    }

    @Test
    void gameContinuesWhenNoPlayerWinsRequiredRounds() {
        game.getP1().setWins(Game.WINS_REQUIRED - 1);
        assertFalse(game.checkGameEndCondition());
    }

    @Test
    void playerWinsRoundWhenResultIsWin() {
        game.handleAndPrintResult(Result.WIN);
        assertEquals(1, game.getP1().getWins());
    }

    @Test
    void playerLosesRoundWhenResultIsLose() {
        game.handleAndPrintResult(Result.LOSE);
        assertEquals(1, game.getP2().getWins());
    }

    @Test
    void noPlayerWinsRoundWhenResultIsDraw() {
        game.handleAndPrintResult(Result.DRAW);
        assertEquals(0, game.getP1().getWins());
        assertEquals(0, game.getP2().getWins());
    }
}