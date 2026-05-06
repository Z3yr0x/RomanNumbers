////////////////////////////////////////////////////////////////////
// Yi Ming Ye 2137995
// Luca Stangherlin 2137996
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;


import java.util.Scanner;

public final class App
{
    private App(){}
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(RomanPrinter.print(Integer.parseInt(scan.nextLine())));
        scan.close();
    }

}
