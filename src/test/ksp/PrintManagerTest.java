package ksp;

import ksp.PrintManager;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

/**
 *  Testiluokka PrintManager-luokalle.
 */
public class PrintManagerTest {

    @Test
    public void testPrintRound() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PrintManager.printRound(1);
        String expectedOutput  = "Erä: 1 =====================\n";
        assertEquals(expectedOutput, outContent.toString());

        outContent.reset();

        PrintManager.printRound(2);
        expectedOutput  = "Erä: 2 =====================\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}