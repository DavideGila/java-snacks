package org.learning.snack6;

import java.util.Random;

public class Snack6 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomSeconds = randomGenerator.nextInt(10000000);
        System.out.println("Random seconds: " + randomSeconds);

        int hours = randomSeconds / 3600;
        int remainingSeconds = randomSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        String formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        System.out.println("Random seconds formatted in hours, minutes and seconds: " + formattedTime);
    }
}
