package it.unipd.mtss;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanPrinterTest {

    @Test
    void testStampaNumeriFinoASei() {
        String[] expected = {
                // 1 (I)
                " _____  \n" +
                        "|_   _| \n" +
                        "  | |   \n" +
                        "  | |   \n" +
                        " _| |_  \n" +
                        "|_____| \n",

                // 2 (II)
                " _____   _____  \n" +
                        "|_   _| |_   _| \n" +
                        "  | |     | |   \n" +
                        "  | |     | |   \n" +
                        " _| |_   _| |_  \n" +
                        "|_____| |_____| \n",

                // 3 (III)
                " _____   _____   _____  \n" +
                        "|_   _| |_   _| |_   _| \n" +
                        "  | |     | |     | |   \n" +
                        "  | |     | |     | |   \n" +
                        " _| |_   _| |_   _| |_  \n" +
                        "|_____| |_____| |_____| \n",

                // 4 (IV)
                " _____  --       -- \n" +
                        "|_   _| \\ \\     / / \n" +
                        "  | |    \\ \\   / /  \n" +
                        "  | |     \\ \\ / /   \n" +
                        " _| |_     \\   /    \n" +
                        "|_____|     \\ /     \n",

                // 5 (V)
                "--       -- \n" +
                        "\\ \\     / / \n" +
                        " \\ \\   / /  \n" +
                        "  \\ \\ / /   \n" +
                        "   \\   /    \n" +
                        "    \\ /     \n",

                // 6 (VI)
                "--       --  _____  \n" +
                        "\\ \\     / / |_   _| \n" +
                        " \\ \\   / /    | |   \n" +
                        "  \\ \\ / /     | |   \n" +
                        "   \\   /     _| |_  \n" +
                        "    \\ /     |_____| \n"
        };

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], RomanPrinter.print(i + 1));
        }

    }

}