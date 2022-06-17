package collectionframework;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {


        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

//        System.out.println(list.contains(100));
//        System.out.println(list.get(0));
//        System.out.println(list.indexOf(30));
//        System.out.println(list.isEmpty());
        System.out.println(list.size());


        ListIterator<Integer> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
