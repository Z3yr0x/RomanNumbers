package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerToRomanTest {

  /*  @Test
    void testIntegerToRoman() {
        int[] inputs = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,30,35,40,41,42,43,44,45,46,47,48,49,50,51,60,70,75,80,90,100,145,150,170,175,200,400,415,450,495,500,501, 504, 509, 510, 540, 549, 550, 590, 599,600, 700, 777, 800, 888, 900, 904, 944, 950,990, 994, 999, 1000};
        String[] previsti = {
                "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXX", "XXXV", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII",
                "XLVIII", "XLIX", "L", "LI", "LX", "LXX", "LXXV", "LXXX", "XC", "C",
                "CXLV","CL","CLXX","CLXXV","CC","CD","CDXV","CDL","CDXCV","D",
                "DI", "DIV", "DIX", "DX", "DXL", "DXLIX", "DL", "DXC", "DXCIX",
                "DC", "DCC", "DCCLXXVII", "DCCC", "DCCCLXXXVIII", "CM", "CMIV", "CMXLIV", "CML",
                "CMXC", "CMXCIV", "CMXCIX", "M"
        };
        for (int i = 0; i < inputs.length; i++) {
            assertEquals(previsti[i], IntegerToRoman.convert(inputs[i]));
        }
    }
*/
    @Test
    void testZero() {
        int input = 0;

        assertThrows(IllegalArgumentException.class,
                () -> IntegerToRoman.convert(input));
    }

    @Test
    void testNegativi() {
        int input = -1;


        assertThrows(IllegalArgumentException.class,
                () -> IntegerToRoman.convert(input));
    }

    @Test
    void testLimite() {
        int input = 501;

        assertThrows(IllegalArgumentException.class,
                () -> IntegerToRoman.convert(input));
    }
}