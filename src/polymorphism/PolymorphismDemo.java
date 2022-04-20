package polymorphism;

import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 *
 * ability to take one to many form
 * or
 * one thing have many action
 *
 * method overloading ->
 * in one class have same method name with different number of argument
 *
 * Rule -> 1.changing number of argument
 *         2.changing datatype
 *
 * advantage ->  it increases readability
 */
public class PolymorphismDemo {

    public void add(int a ,int b){
        System.out.println(a-b);
    }
    public void add(int a ,double b){
        System.out.println(a+b);
    }

    public void add(int a ,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        PolymorphismDemo obj = new PolymorphismDemo();
        obj.add(5,9.0);
        obj.add(5,9);
    }


}
