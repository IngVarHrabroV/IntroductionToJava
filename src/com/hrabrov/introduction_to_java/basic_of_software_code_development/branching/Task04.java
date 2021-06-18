package com.hrabrov.introduction_to_java.basic_of_software_code_development.branching;

public class Task04 {
    /**
     * Given rectangular hole in wall with sides a, b and given brick with sides x, y, z.
     * Found, can brick fit rectangular hole?
     *
     * @param widthHole input 1th side rectangular hole
     * @param heightHole input 2th side rectangular hole
     * @param xSideBrick input brick's width
     * @param ySideBrick input brick's height
     * @param zSideBrick input brick's depth
     * @return String, that ask for question
     */

    public static String brickCanFit(double widthHole, double heightHole,
                                     double xSideBrick, double ySideBrick, double zSideBrick) {
        boolean firstCondition;
        boolean secondCondition;
        boolean thirtyCondition;

        firstCondition = (xSideBrick < widthHole && ySideBrick < heightHole)
                         || (xSideBrick < heightHole && ySideBrick < widthHole);

        secondCondition = (xSideBrick < widthHole && zSideBrick < heightHole)
                          || (xSideBrick < heightHole && zSideBrick < widthHole);

        thirtyCondition = (ySideBrick < widthHole && zSideBrick < heightHole)
                          || (ySideBrick < heightHole && zSideBrick < widthHole);

        if (firstCondition || secondCondition || thirtyCondition) {
            return "Yes, brick can fit in rectangular hole";
        } else {
            return "No, brick can't fit in rectangular hole";
        }
    }
}
