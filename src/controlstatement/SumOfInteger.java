package controlstatement;

import java.util.Scanner;

public class SumOfInteger {
    public static void main(String[] args) {
        int num,sum=0;
        char choice;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter the value");
            num = scanner.nextInt();
            sum = sum+ num;

            System.out.println("Do you want enter next value");
            choice = scanner.next().charAt(0);

        }while (choice=='y' || choice=='Y');

        System.out.println("your sum is "+sum);
    }
}
