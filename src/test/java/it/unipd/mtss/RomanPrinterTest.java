package it.unipd.mtss;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanPrinterTest {
    /*@Test
    void testLinguaggioLegittimo() {
        String[] invalidInputs = {
                "A", "B", "E", "F", "G", "H", "J", "K", "N",
                "O", "P", "Q", "R", "S", "T", "U", "W", "Y", "Z",

                "a", "b", "c", "d", "e", "f", "i", "l", "m",
                "v", "x", "z", "hello", "world", "iv", "ix",

                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "42", "2024", "-1", "3.14", "007",

                ".", ",", ";", ":", "!", "?", "-", "_", "+", "=",
                "*", "/", "\\", "|", "<", ">", "~", "`", "^",

                "@", "#", "$", "%", "&", "£", "€",
                "(", ")", "[", "]", "{", "}", "\"", "'",

                " ",
                "   ",
                "\t",
                "\n",
                "\r",
                "I I",
                " X",
                "V ",
                "",

                "α", "β", "Ω",
                "è", "à", "ù",
                "漢", "字",
                "😊", "🚀", "🍕",

                "IIII",
                "VV",
                "LL",
                "DD",
                "IC",
                "IM",
                "VX",
                "IIV"
        };

        for (String input : invalidInputs) {
            assertThrows(IllegalArgumentException.class,
                    () -> RomanPrinter.printAsciiArt(input));
        }
    }

    @Test
    void testStampaNumeriFinoATre() {
        // Array degli input validi
        String[] inputs = {"I", "II", "III"};

        // Array con i risultati attesi (Text Blocks)
        String[] expectedOutputs = {
                """
             _____
            |_   _|
              | |
              | |
             _| |_
            |_____|""",

                """
             _____   _____
            |_   _| |_   _|
              | |     | |
              | |     | |
             _| |_   _| |_
            |_____| |_____|""",

                """
             _____   _____   _____
            |_   _| |_   _| |_   _|
              | |     | |     | |
              | |     | |     | |
             _| |_   _| |_   _| |_
            |_____| |_____| |_____|"""
        };

        // Eseguiamo il controllo su tutti gli elementi dell'array
        for (int i = 0; i < inputs.length; i++) {
            assertEquals(expectedOutputs[i], RomanPrinter.printAsciiArt(inputs[i]));
        }
    }*/
}
