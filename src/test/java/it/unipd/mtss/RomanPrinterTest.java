package it.unipd.mtss; 

import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;


public class RomanPrinterTest extends TestCase
{
   @Test
    public void testPrintDefaultNumber()
    {

        String expectedI = "  _____   \n" +
                " |_   _|  \n" +
                "   | |    \n" +
                "   | |    \n" +
                "   | |    \n" +
                "  _| |_   \n" +
                " |_____|  ";

        String expectedV =" __      __  \n" +
                " \\ \\    / /  \n" +
                "  \\ \\  / /   \n" +
                "   \\ \\/ /    \n" +
                "    \\  /     \n" +
                "     \\/   ";

        String expectedX = "__   __ \n" +
                "\\ \\ / / \n" +
                " \\ V /  \n" +
                "  > <   \n" +
                " / . \\  \n" +
                "/_/ \\_\\ ";

        String expectedL = "  _        \n" +
                " | |       \n" +
                " | |       \n" +
                " | |       \n" +
                " | |       \n" +
                " | |____   \n" +
                " |______| ";

        String expectedC = "  _____  \n" +
                " / ____| \n" +
                "| |      \n" +
                "| |      \n" +
                "| |      \n" +
                " \\____|";

        String expectedD = "  _____   \n" +
                " |  __ \\  \n" +
                " | |  | | \n" +
                " | |  | | \n" +
                " | |  | | \n" +
                " | |__| | \n" +
                " |_____/ ";

        String expectedM = " __  __   \n" +
                "|  \\/  |  \n" +
                "| \\  / |  \n" +
                "| |\\/| |  \n" +
                "| |  | |  \n" +
                "|_|  |_|  ";

        assertEquals(expectedI.trim() , RomanPrinter.print(1).trim()  );
        assertEquals(expectedV.trim() , RomanPrinter.print(5).trim()  );
        assertEquals(expectedX.trim() , RomanPrinter.print(10).trim()  );
        assertEquals(expectedL.trim() , RomanPrinter.print(50).trim()  );
        assertEquals(expectedC.trim() , RomanPrinter.print(100).trim()  );
        assertEquals(expectedD.trim() , RomanPrinter.print(500).trim()  );
        assertEquals(expectedM.trim() , RomanPrinter.print(1000).trim()  );
    }

    @Test
    public void testPrintNotDefaultNumber()
    {

        String expected566 = "  _____     _        __   __  __      __    _____   \n" +
                " |  __ \\   | |       \\ \\ / /  \\ \\    / /   |_   _|  \n" +
                " | |  | |  | |        \\ V /    \\ \\  / /      | |    \n" +
                " | |  | |  | |         > <      \\ \\/ /       | |    \n" +
                " | |  | |  | |        / . \\      \\  /        | |    \n" +
                " | |__| |  | |____   /_/ \\_\\      \\/        _| |_   \n" +
                " |_____/   |______|                        |_____|  ";


        String expected999 = "  _____   __  __   __   __   _____    _____   __   __ \n" +
                " / ____| |  \\/  |  \\ \\ / /  / ____|  |_   _|  \\ \\ / / \n" +
                "| |      | \\  / |   \\ V /  | |         | |     \\ V /  \n" +
                "| |      | |\\/| |    > <   | |         | |      > <   \n" +
                "| |      | |  | |   / . \\  | |         | |     / . \\  \n" +
                " \\____| |_|  |_|  /_/ \\_\\  \\____|   _| |_   /_/ \\_\\ \n" +
                "                                   |_____|          ";

        String expected888 = "  _____     _____    _____    _____    _        __   __ __   __ __   __  __      __    _____     _____     _____   \n" +
                " |  __ \\   / ____|  / ____|  / ____|  | |       \\ \\ / / \\ \\ / / \\ \\ / /  \\ \\    / /   |_   _|   |_   _|   |_   _|  \n" +
                " | |  | | | |      | |      | |       | |        \\ V /   \\ V /   \\ V /    \\ \\  / /      | |       | |       | |    \n" +
                " | |  | | | |      | |      | |       | |         > <     > <     > <      \\ \\/ /       | |       | |       | |    \n" +
                " | |  | | | |      | |      | |       | |        / . \\   / . \\   / . \\      \\  /        | |       | |       | |    \n" +
                " | |__| |  \\____|  \\____|  \\____|  | |____   /_/ \\_\\ /_/ \\_\\ /_/ \\_\\      \\/        _| |_     _| |_     _| |_   \n" +
                " |_____/                           |______|                                        |_____|   |_____|   |_____|  ";

        assertEquals(expected566.trim() , RomanPrinter.print(566).trim());
        assertEquals(expected888.trim() , RomanPrinter.print(888).trim());
        assertEquals(expected999.trim() , RomanPrinter.print(999).trim());
    }

    @Test
    public void testPrintIllegalValue() {
       assertEquals("Valore non compreso tra 1 e 1000!", RomanPrinter.print(0));
       assertEquals("Valore non compreso tra 1 e 1000!", RomanPrinter.print(1001));
       assertEquals("Valore non compreso tra 1 e 1000!", RomanPrinter.print(-30));
    }
}
