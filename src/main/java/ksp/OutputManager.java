package ksp;

/** OutputManager rajapinta määrittelee metodit, joita käytetään pelin tulostamiseen. */

public interface OutputManager {
    void printRound(int round);
    void printDraws(int draws);
    void printPlayerChoice(int playerNumber, Selections choice, int wins);
    void printWinner(int playerNumber);
    void printDraw();
    void printGameEnd();
}
