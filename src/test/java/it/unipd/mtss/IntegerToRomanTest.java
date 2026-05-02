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
                () -> IntegerToRoman.convert(11));
    }
}