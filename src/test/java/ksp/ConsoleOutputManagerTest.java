package ksp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsoleOutputManagerTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testPrintRound() {
        ConsoleOutputManager outputManager = new ConsoleOutputManager();
        outputManager.printRound(1);
        assertEquals("Erä: 1 =====================", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testPrintDraws() {
        ConsoleOutputManager outputManager = new ConsoleOutputManager();
        outputManager.printDraws(1);
        assertEquals("Tasapelien lukumäärä: 1", outputStreamCaptor.toString().trim());
    }
    @Test
    public void testPrintPlayerChoice() {
        ConsoleOutputManager outputManager = new ConsoleOutputManager();
        outputManager.printPlayerChoice(1, Selections.KIVI, 1);
        assertEquals("Pelaaja 1 valitsi: KIVI", outputStreamCaptor.toString().trim());
    }
    @Test
    public void testPrintWinner() {
        ConsoleOutputManager outputManager = new ConsoleOutputManager();
        outputManager.printWinner(1);
        assertEquals("Pelaaja 1 voittaa", outputStreamCaptor.toString().trim());
    }
    @Test
    public void testPrintDraw() {
        ConsoleOutputManager outputManager = new ConsoleOutputManager();
        outputManager.printDraw();
        assertEquals("Tasapeli", outputStreamCaptor.toString().trim());
    }
    @Test
    public void testPrintGameEnd() {
        ConsoleOutputManager outputManager = new ConsoleOutputManager();
        outputManager.printGameEnd();
        assertEquals("KOLME VOITTOA - PELI PÄÄTTYY", outputStreamCaptor.toString().trim());

    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}