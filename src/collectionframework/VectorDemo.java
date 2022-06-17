package collectionframework;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<Integer> list = new Vector<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list.capacity());
        System.out.println(list.contains(100));
        System.out.println(list.get(0));
        System.out.println(list.indexOf(30));
        System.out.println(list.isEmpty());

        Iterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
