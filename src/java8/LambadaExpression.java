package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambadaExpression {
    public static void main(String[] args) {

        MyInterface myInterface = ()-> {
            System.out.println("In msg");
        };
        myInterface.msg();


        List<Integer> list = new ArrayList<Integer>();//10
        list.add(10);
        list.add(60);
        list.add(30);
        list.add(40);

        list.forEach((integer) ->{
            System.out.println(integer);
        });

    }

    private void show(){

    }
}


interface MyInterface{

    void msg();

}