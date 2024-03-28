package org.learning.snack5;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write a word that can contain letters, numbers and special characters: ");
        String userWord = scan.nextLine();

        int letterCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        for (int i = 0; i < userWord.length(); i++) {
            char c = userWord.charAt(i);
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else {
                specialCharCount++;
            }
        }

        System.out.println("Number of letters: " + letterCount);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of special characters: " + specialCharCount);

        scan.close();
    }
}
