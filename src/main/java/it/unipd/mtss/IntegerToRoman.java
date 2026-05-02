////////////////////////////////////////////////////////////////////
// Yi Ming Ye 2137995
// Luca Stangherlin 2137996
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public final class IntegerToRoman {
    private IntegerToRoman(){}
    public static String convert(int number){
        if(number<1||number>6){
            throw new IllegalArgumentException("Numero non valido: " + number);
        }
        StringBuilder result = new StringBuilder();
        if (number>3)
        {
            if(number==4)
            {
                result.append("IV");
            }
            else{
                result.append("V");
            }
            number-=5;
        }
        for (int i=0; i<number;i++)
        {
            result.append("I");
        }
        return String.valueOf(result);
    }
}
