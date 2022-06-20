package collectionframework;

import java.util.*;

//set doesn't maintain insertion order
//set doesn't store duplicate values
public class SetDemo {
    public static void main(String[] args) {
        NavigableSet<Object> set = new TreeSet<>().descendingSet();
        set.add(10);
        set.add(320);
        set.add(340);
        set.add(400);

        System.out.println(set);
/*
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(20);
        set1.add(40);
*/

//        System.out.println(set.equals(set1));

//        System.out.println(set.size());
//        System.out.println(set.contains(40));
//        System.out.println(set.isEmpty());
//        System.out.println(set.remove(40));
//
//        Object[] list = set.toArray();
//        System.out.println(Arrays.asList(list));


    }
}
