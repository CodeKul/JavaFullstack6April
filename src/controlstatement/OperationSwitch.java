package controlstatement;

import java.util.Scanner;

public class OperationSwitch {
    public static void main(String[] args) {
        int num1, num2;
        char operation;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first value");
        num1 = scanner.nextInt();
        System.out.println("enter second value");
        num2 = scanner.nextInt();
        System.out.println("enter operator");
        operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);

        }

    }
}
