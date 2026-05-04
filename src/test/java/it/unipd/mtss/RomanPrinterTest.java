package it.unipd.mtss;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanPrinterTest {

    @Test
    void testStampaNumeriFinoATre() {
        String[] expected = {
                " _____  \n" +
                        "|_   _| \n" +
                        "  | |   \n" +
                        "  | |   \n" +
                        " _| |_  \n" +
                        "|_____| \n",

                " _____   _____  \n" +
                        "|_   _| |_   _| \n" +
                        "  | |     | |   \n" +
                        "  | |     | |   \n" +
                        " _| |_   _| |_  \n" +
                        "|_____| |_____| \n",

                " _____   _____   _____  \n" +
                        "|_   _| |_   _| |_   _| \n" +
                        "  | |     | |     | |   \n" +
                        "  | |     | |     | |   \n" +
                        " _| |_   _| |_   _| |_  \n" +
                        "|_____| |_____| |_____| \n"
        };

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], RomanPrinter.print(i + 1));
        }
    }

}