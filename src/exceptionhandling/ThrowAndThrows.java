package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThrowAndThrows {

    public static void main(String[] args) throws FileNotFoundException {

      /*  int age = 10;
        if (age < 18) {
//            try {
                throw new Exception("Age is less than 18");
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
        } else {
            System.out.println("age is greater than 18");
        }*/

        int i = 10/0;//unchecked

        FileOutputStream outputStream = new FileOutputStream("text.txt");//checked

    }
}
/**
 *              Throw                                   throws
 *
 * 1. throw is used to throw the exception       1. throws is used to declare the exception
 *
 * 2. throw is used in method                    2. throws is used with method signature
 *
 * 3. you can throw only one exception using     3. you can declare multiple exception
 *    throw
 *
 * 4. throw is followed by instance              4. throws is followed by class
 */
