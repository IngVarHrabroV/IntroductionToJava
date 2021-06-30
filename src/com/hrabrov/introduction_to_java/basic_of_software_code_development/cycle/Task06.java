package com.hrabrov.introduction_to_java.basic_of_software_code_development.cycle;

public class Task06 {
    /**
     * Return number equivalent symbol
     *
     * @return list with number equivalent
     */

    public static String numberEquivalentSymbol() {
        String charTableEquivalents = "\n";
        char charX;
        String spaces = "      "; // 6 space

        charTableEquivalents +="32 = ESK    ";

        for (int i = 33; i <= 126; i++) {
            String enter = "";

            charX = (char) i;

            if (i % 10 == 1) {
                enter = "\n";
            }

            if (i > 99) {
                spaces = "     "; // 5 space
            }

            charTableEquivalents += i + " = " + charX + spaces + enter;
        }

        charTableEquivalents += "127 = DEL";

        return charTableEquivalents;
    }
}
