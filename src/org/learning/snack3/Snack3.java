package org.learning.snack3;

public class Snack3 {
    public static void main(String[] args) {
        int[] numbers = {13, 45, 66, 23, 95, 54, 71};

        int sumOddPosition = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                sumOddPosition += numbers[i];
            }
        }
        System.out.println("The sum of the numbers in odd positions is: " + sumOddPosition);
    }
}
