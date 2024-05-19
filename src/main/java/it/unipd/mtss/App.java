////////////////////////////////////////////////////////////////////
// [LUCA] [CALZETTA] [2075524]
// [LORENZO] [STEFANI] [2079249]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero (1-1000):");
        String romanNumber = scanner.nextInt();
        String asciiArt = RomanPrinter.print(romanNumber);
        System.out.println(asciiArt);   
        scanner.close();
    }
}