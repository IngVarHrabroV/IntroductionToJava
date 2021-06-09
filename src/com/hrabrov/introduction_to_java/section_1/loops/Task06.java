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
            char charX = (char) i;
            String enter = "";
            String spases = "    ";


            if ((i - 1) % 10 == 0) {
                enter = "\n";
            }

            if (i > 99) {
                spases = "   ";
            }


            charTableEquivalents.append(i)
                                .append(" = ")
                                .append(charX)
                                .append(spases)
                                .append(enter);
        }

        return charTableEquivalents;
    }
}
