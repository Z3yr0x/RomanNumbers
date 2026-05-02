package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerToRomanTest {

    @Test
    void testIntegerToRoman() {
/*
        int[] inputs =      {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,30,35,40,41,42,43,44,45,46,47,48,49,50};
        String[] previsti = {"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX","XXX","XXXV","XL","XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L"};

        for (int i = 0; i < inputs.length; i++) {
            assertEquals(previsti[i], IntegerToRoman.convert(inputs[i]));
        }*/
    }

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
        /*int input = 51;

        assertThrows(IllegalArgumentException.class,
                () -> IntegerToRoman.convert(input));*/
    }
}