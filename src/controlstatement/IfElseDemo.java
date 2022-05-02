package controlstatement;

public class IfElseDemo {

    public static void main(String[] args) {

  /*      int i = 10;
//        single if else
        if (i > 0) {
            System.out.println("positive ");
        } else {
            System.out.println("negative");
        }*/

        int a = 10, b = 20, c = 30;

        //ladder if
        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }

        int age = 19;
        String nationality = "Indian";

        //nested if
        if (age >= 18) {
            if (nationality.equals("Indian")) {
                System.out.println("You can vote");
            }
        } else {
            System.out.println("you can vote");
        }

        int i = 10;
//        single if else
        if (i > 0) {
            System.out.println("positive ");
        } else {
            System.out.println("negative");
        }

        String str = i > 0 ? "positive" : "negative";//ternary operator

        System.out.println(str);
    }
}

