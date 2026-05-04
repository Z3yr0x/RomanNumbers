////////////////////////////////////////////////////////////////////
// Yi Ming Ye 2137995
// Luca Stangherlin 2137996
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;

public class RomanPrinter {
    /*
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }*/

    private static final Map<Character, String[]> ASCII_ART = new HashMap<>();
    static {
        ASCII_ART.put('I', new String[]{
                " _____ ",
                "|_   _|",
                "  | |  ",
                "  | |  ",
                " _| |_ ",
                "|_____|"
        });
    }

    private static String printAsciiArt(String romanNumber){
        StringBuilder risultato = new StringBuilder();

        for(int i=0; i<6; i++) {
            for (int j = 0; j < romanNumber.length(); j++) {
                char c = romanNumber.charAt(j);
                if (!ASCII_ART.containsKey(c)) {
                    throw new IllegalArgumentException("Carattere non valido: " + c);
                }
                risultato.append(ASCII_ART.get(c)[i]);
                risultato.append(" ");
            }
            risultato.append("\n");
        }
        return risultato.toString();
    }

}
