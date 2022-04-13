package operators;

/**
 * unary operator -> pre increment , post increment ,pre decrement, post decrement
 * arithmetic -> + , -, * ,/, %
 * relational -> < ,> , <= , >=
 * logical -> & , | , !
 * bitwise -> && , ||
 * assignment -> = ,<=,>=
 * ternary -> : ?
 * shift -> << ,>>
 *
 */
public class OperatorDemo {
    public static void main(String[] args) {

        int a = 10, b = 5;
//        System.out.println(++a); //a + 1 = a
        System.out.println(a++); // a = a + 1
        System.out.println(a);
    }
}
