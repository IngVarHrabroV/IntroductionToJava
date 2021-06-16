package com.hrabrov.introduction_to_java.section_1.loops;

public class Task06 {
    /**
     * Return number equivalent symbol
     *
     * @return list with number equivalent
     */

    public static StringBuilder numberEquivalentSymbol() {
        StringBuilder charTableEquivalents = new StringBuilder("\n");

        for (int i = 32; i <= 127; i++) {
            char charX;
            String enter = "";
            String spaces = "    "; // 4 space

            charX = (char) i;


            if ((i - 1) % 10 == 0) {
                enter = "\n";
            }

            if (i > 99) {
                spaces = "   "; // 3 space
            }

            charTableEquivalents.append(i)
                                .append(" = ")
                                .append(charX)
                                .append(spaces)
                                .append(enter);
        }

        return charTableEquivalents;
    }
}
