package controlstatement;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int num, guessNumber, count = 0;
        Scanner scanner = new Scanner(System.in);
        num = (int) (Math.random() * 100) + 1;

        do {
            System.out.println("enter value");
            guessNumber = scanner.nextInt();

            count++;
            if (num > guessNumber) {
                System.out.println("Number is greater");
            } else if (num < guessNumber) {
                System.out.println("number is less");
            } else {
                System.out.println("you guess correct " + count + " attempt");
            }

        } while (num != guessNumber);


    }
}
