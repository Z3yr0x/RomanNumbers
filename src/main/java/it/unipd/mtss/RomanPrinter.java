////////////////////////////////////////////////////////////////////
// Yi Ming Ye 2137995
// Luca Stangherlin 2137996
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public final class RomanPrinter {

    private RomanPrinter(){}
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String[] getAsciiArt(char c) {
        switch (c) {
            case 'I': return new String[]{
                    " _____ ",
                    "|_   _|",
                    "  | |  ",
                    "  | |  ",
                    " _| |_ ",
                    "|_____|"
            };
            case 'V': return new String[]{
                    "--       --",
                    "\\ \\     / /",
                    " \\ \\   / / ",
                    "  \\ \\ / /  ",
                    "   \\   /   ",
                    "    \\ /    "
            };
            case 'X': return new String[]{
                    "--    --",
                    "\\ \\  / /",
                    " \\ \\/ / ",
                    "  >  <  ",
                    " / /\\ \\ ",
                    "/_/  \\_\\"
            };
            case 'L': return new String[]{
                    " _      ",
                    "| |     ",
                    "| |     ",
                    "| |     ",
                    "| |_ _  ",
                    "|_ _ _| "
            };
            default: throw new IllegalArgumentException("Carattere non valido: " + c);
        }
    }

    private static String printAsciiArt(String romanNumber){
        StringBuilder risultato = new StringBuilder();

        for(int i=0; i<6; i++) {
            for (int j = 0; j < romanNumber.length(); j++) {
                char c = romanNumber.charAt(j);
                risultato.append(getAsciiArt(c)[i]);
                risultato.append(" ");
            }
            risultato.append("\n");
        }
        return risultato.toString();
    }

}