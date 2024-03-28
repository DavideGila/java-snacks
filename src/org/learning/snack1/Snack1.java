package org.learning.snack1;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write an even number between 10 and 20 ");
        int userNumber = Integer.parseInt(scan.nextLine());

        while (userNumber >= 10 && userNumber <= 20 && userNumber % 2 == 0) {
            System.out.println("The number entered is an even number between 10 and 20");
            System.out.println("Write an even number between 10 and 20 ");
            userNumber = Integer.parseInt(scan.nextLine());
        }

        scan.close();
    }
}
