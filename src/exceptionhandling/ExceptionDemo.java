package exceptionhandling;

public class ExceptionDemo {
    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        System.out.println("hello");
        try {
            int k = i / j;//critical statement
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        } catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
/*

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
*/

        System.out.println("hii");//normal statement
        System.out.println("hii");
        System.out.println("hii");
        System.out.println("hii");
    }
}
