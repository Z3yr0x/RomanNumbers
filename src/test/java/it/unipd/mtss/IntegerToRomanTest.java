package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerToRomanTest {

    @Test
    void testIntegerToRoman() {
        assertEquals("I",   IntegerToRoman.convert(1));
        assertEquals("II",  IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("VI", IntegerToRoman.convert(6));
        assertEquals("VII", IntegerToRoman.convert(7));
        assertEquals("VIII", IntegerToRoman.convert(8));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));
        assertEquals("XI", IntegerToRoman.convert(11));
        assertEquals("XII", IntegerToRoman.convert(12));
        assertEquals("XIII", IntegerToRoman.convert(13));
        assertEquals("XIV", IntegerToRoman.convert(14));
        assertEquals("XV", IntegerToRoman.convert(15));
        assertEquals("XVI", IntegerToRoman.convert(16));
        assertEquals("XVII", IntegerToRoman.convert(17));
        assertEquals("XVIII", IntegerToRoman.convert(18));
        assertEquals("XIX", IntegerToRoman.convert(19));
        assertEquals("XX", IntegerToRoman.convert(20));
    }

    @Test
    void testZero() {
        assertThrows(IllegalArgumentException.class,
                () -> IntegerToRoman.convert(0));
    }

    @Test
    void testNegativi() {
        assertThrows(IllegalArgumentException.class,
                () -> IntegerToRoman.convert(-1));
    }

    @Test
    void testLimite() {
        assertThrows(IllegalArgumentException.class,
                () -> IntegerToRoman.convert(21));
    }
}