package basic;

import java.util.ArrayList;
import java.util.List;

//arraylist maintain insertion order
//arraylist store duplicate values
//arraylist use dynamic array to store the element
//it grows by 50%
public class ArrayListDemo {
    public static void main(String[] args) {

        int[] ints = new int[15];
        ints[0] = 1;
        ints[1] = 1;
        ints[2] = 1;

        List<Integer>list = new ArrayList<>();//10
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);


    }
}
