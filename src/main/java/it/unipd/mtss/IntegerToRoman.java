////////////////////////////////////////////////////////////////////
// Yi Ming Ye 2137995
// Luca Stangherlin 2137996
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public final class IntegerToRoman {
    private IntegerToRoman(){}
    public static String convert(int number){
        if(number<1||number>1000){
            throw new IllegalArgumentException("Numero non valido: " + number);
        }
        StringBuilder result = new StringBuilder();
        number=over90(number,result);
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
        if(number==1000)
        {
            result.append("M");
            number-=1000;
        }
        else if(number>=900)
        {
            result.append("CM");
            number-=900;
        }
        else if(number>=500)
        {
            result.append("D");
            number-=500;
        }
        else if(number>=400)
        {
            result.append("CD");
            number-=400;
        }
        while(number>=100)
        {
            result.append("C");
            number-=100;
        }
        if(number>=90)
        {
            result.append("XC");
            number-=90;
        }
        return number;
    }
}
