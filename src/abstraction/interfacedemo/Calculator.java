package abstraction.interfacedemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Calculator implements Operation1,Operation2{

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(2,3);
    }

    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void sub(int a, int b) {

    }
}

