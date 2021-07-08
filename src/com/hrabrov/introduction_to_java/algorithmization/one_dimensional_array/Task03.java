package com.hrabrov.introduction_to_java.algorithmization.one_dimensional_array;

public class Task03 {
    /**
     * Given array with random real numbers between -100 to 100 and length n.
     * Found, how many negative number, positive number or equals 0
     *
     * @param arrayLength input array's length
     * @return object Quantity
     */

    public static Quantity checkArrayElements(int arrayLength) {
        Quantity quantity = new Quantity();

        quantity.negativeQuantity = 0;
        quantity.positiveQuantity = 0;
        quantity.zeroQuantity = 0;

        int[] arrayWithRandomNumber = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            arrayWithRandomNumber[i] = numberForArray();
        }

        for (int i : arrayWithRandomNumber) {
            if (i > 0) {
                quantity.positiveQuantity += 1;
            } else if (i < 0) {
                quantity.negativeQuantity += 1;
            } else {
                quantity.zeroQuantity += 1;
            }
        }

        return quantity;
    }

    public static int numberForArray() {
        int randomNumberForToken;
        int randomToken;

        randomNumberForToken = (int) (Math.random() * 10);
        randomToken = randomNumberForToken < 5 ? -1 : 1;

        int randomNumber;
        randomNumber = (int) (Math.random() * 100 * randomToken);

        if (randomNumber > -20 && randomNumber < 20) {
            randomNumber = 0;
        }

        return randomNumber;
    }

    static class Quantity {
        int negativeQuantity;
        int positiveQuantity;
        int zeroQuantity;
    }
}




