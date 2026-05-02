////////////////////////////////////////////////////////////////////
// Yi Ming Ye 2137995
// Luca Stangherlin 2137996
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public final class IntegerToRoman {
    private IntegerToRoman(){}
    public static String convert(int number){
        StringBuilder result = new StringBuilder();
        while (number>0&&number%5<=3)   {
            number--;
            result.append("I");
        }
        return String.valueOf(result);
    }

}
