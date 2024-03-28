package org.learning.snack4;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write a word that could be palindrome: ");
        String userWord = scan.nextLine();

        boolean isPalindrome = true;
        for (int i = 0; i < userWord.length() / 2; i++) {
            if (userWord.charAt(i) != userWord.charAt(userWord.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The inserted word is a palindrome");
        } else {
            System.out.println("The inserted word is not a palindrome");
        }

        scan.close();
    }
}
