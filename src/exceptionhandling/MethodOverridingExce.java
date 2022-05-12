package exceptionhandling;

import java.io.FileNotFoundException;

public class MethodOverridingExce {
    public void show() throws RuntimeException{
        System.out.println("in show");
    }

}

class Sample extends MethodOverridingExce{

    @Override
    public void show() throws ArithmeticException {
        System.out.println("in child show");
    }
}

/*
   if parent class doesn't declare exception then child class can declare only unchecked exception
   if parent class declare exception then child class can declare same exception
   if parent class declare exception then child class can declare child exception


 */