package org.learning.snack2;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        final String[] NAMES = {"Giuseppe", "Giovanni", "Francesca", "Marco", "Anna", "Luca", "Maria"};
        final String[] SURNAMES = {"Rossi", "Bianchi", "Verdi", "Ferrari", "Russo", "Esposito", "Bianco"};

        Random randomGenerator = new Random();
        int randomIndexNames = randomGenerator.nextInt(NAMES.length);
        int randomIndexSurnames = randomGenerator.nextInt(SURNAMES.length);

        String randomNames = NAMES[randomIndexNames];
        String randomSurnames= SURNAMES[randomIndexSurnames];
        System.out.println(randomNames + " " + randomSurnames);
    }
}
