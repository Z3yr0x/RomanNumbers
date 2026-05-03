////////////////////////////////////////////////////////////////////
// Yi Ming Ye 2137995
// Luca Stangherlin 2137996
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public final class IntegerToRoman {
    private IntegerToRoman(){}
    public static String convert(int number){
        if(number<1||number>100){
            throw new IllegalArgumentException("Numero non valido: " + number);
        }
        StringBuilder result = new StringBuilder();
        number-=over90(number,result);
        if(number>=40){
            if (number>=50)
            {
                result.append("L");
                number-=50;
            }
            else {
                result.append("XL");
                number-=40;
            }
        }
        while(number>=10)
        {
            result.append("X");
            number-=10;
        }
        if(number == 9)
        {
            result.append("IX");
            number-=9;
        }
        else if(number==4)
        {
            result.append("IV");
            number-=4;
        }
        else if(number>=5)
        {
            result.append("V");
            number-=5;
        }

        for (int i=0; i<number;i++)
        {
            result.append("I");
        }
        return String.valueOf(result);
    }
    public static int over90(int number, StringBuilder result)
    {
        if(number>=90)
        {
            if (number>=100)
            {
                result.append("C");
                return 100;
            }
            else {
                result.append("XC");
                return 90;
            }
        }
        return 0;
    }
}
