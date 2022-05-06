package controlstatement;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        int i;
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");

        str = scanner.next();
        System.out.println("your value is "+str);
    }
}
