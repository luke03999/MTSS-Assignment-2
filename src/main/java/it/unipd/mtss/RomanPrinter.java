////////////////////////////////////////////////////////////////////
// [LUCA] [CALZETTA] [2075524]
// [LORENZO] [STEFANI] [2079249]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;

public class RomanPrinter {
    public static String print(int num) {
        try {
            return printAsciiArt(IntegerToRoman.convert(num));
        } catch (IllegalArgumentException e) {
            return "Valore non compreso tra 1 e 1000!";
        }
    }

    private static String printAsciiArt(String romanNumber) {
        Map<Character, String[]> romanAsciiMap = createRomanAsciiMap();
        StringBuilder[] asciiArtLines = new StringBuilder[8];

        for (int i = 0; i < 8; i++) {
            asciiArtLines[i] = new StringBuilder();
        }

        for (char c : romanNumber.toCharArray()) {
            String[] asciiArt = romanAsciiMap.get(c);
            for (int i = 0; i < 8; i++) {
                asciiArtLines[i].append(asciiArt[i]).append(" ");
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder line : asciiArtLines) {
            result.append(line.toString()).append("\n");
        }

        return result.toString();
    }

    private static Map<Character, String[]> createRomanAsciiMap() {
        Map<Character, String[]> romanAsciiMap = new HashMap<>();

        romanAsciiMap.put('I', new String[]{
                "  _____  ",
                " |_   _| ",
                "   | |   ",
                "   | |   ",
                "   | |   ",
                "  _| |_  ",
                " |_____| ",
                "         "
        });
        romanAsciiMap.put('V', new String[]{
                " __      __ ",
                " \\ \\    / / ",
                "  \\ \\  / /  ",
                "   \\ \\/ /   ",
                "    \\  /    ",
                "     \\/     ",
                "            ",
                "            "
        });
        romanAsciiMap.put('X', new String[]{
                "__   __",
                "\\ \\ / /",
                " \\ V / ",
                "  > <  ",
                " / . \\ ",
                "/_/ \\_\\",
                "       ",
                "       "
        });
        romanAsciiMap.put('L', new String[]{
                "  _       ",
                " | |      ",
                " | |      ",
                " | |      ",
                " | |      ",
                " | |____  ",
                " |______| ",
                "          "
        });
        romanAsciiMap.put('C', new String[]{
                "  _____ ",
                " / ____|",
                "| |     ",
                "| |     ",
                "| |     ",
                " \\____|",
                "       ",
                "       "
        });
        romanAsciiMap.put('D', new String[]{
                "  _____  ",
                " |  __ \\ ",
                " | |  | |",
                " | |  | |",
                " | |  | |",
                " | |__| |",
                " |_____/ ",
                "         "
        });
        romanAsciiMap.put('M', new String[]{
                " __  __  ",
                "|  \\/  | ",
                "| \\  / | ",
                "| |\\/| | ",
                "| |  | | ",
                "|_|  |_| ",
                "         ",
                "         "
        });

        return romanAsciiMap;
    }
}