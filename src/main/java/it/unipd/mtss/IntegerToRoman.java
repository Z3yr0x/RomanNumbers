////////////////////////////////////////////////////////////////////
// Yi Ming Ye 2137995
// Luca Stangherlin 2137996
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public final class IntegerToRoman {
    private IntegerToRoman(){}
    public static String convert(int number){
        if(number<1){
            throw new IllegalArgumentException("Numero non valido: " + number);
        }
        StringBuilder result = new StringBuilder();
        result.append("I".repeat(number % 4));
        return String.valueOf(result);
    }

}
