////////////////////////////////////////////////////////////////////
// [LUCA] [CALZETTA] [2075524]
// [LORENZO] [STEFANI] [2079249]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.TreeMap;


public class IntegerToRoman {

    private static final TreeMap<Integer, String> romanNumerals = new TreeMap<>();

    static {
        romanNumerals.put(1000, "M");
        romanNumerals.put(900, "CM");
        romanNumerals.put(500, "D");
        romanNumerals.put(400, "CD");
        romanNumerals.put(100, "C");
        romanNumerals.put(90, "XC");
        romanNumerals.put(50, "L");
        romanNumerals.put(40, "XL");
        romanNumerals.put(10, "X");
        romanNumerals.put(9, "IX");
        romanNumerals.put(5, "V");
        romanNumerals.put(4, "IV");
        romanNumerals.put(1, "I");
    }

    public static String convert(int number){

        if (number <= 0 || number > 1000) {
            throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 1000");
        }

        StringBuilder roman = new StringBuilder();

        for (int key : romanNumerals.descendingKeySet()) {
            while (number >= key) {
                roman.append(romanNumerals.get(key));
                number -= key;
            }
        }

        return roman.toString();
    }
}