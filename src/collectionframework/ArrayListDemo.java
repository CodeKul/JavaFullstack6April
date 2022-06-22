package collectionframework;

import java.util.*;

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



        List<Integer>list2 = new ArrayList<>();//10
        list2.add(10);
        list2.add(60);
        list2.add(30);

        list2.add(40);

//        list.addAll(list2);
//        System.out.println(list.containsAll(list2));
//        list.retainAll(list2);
//        System.out.println(list);
        List<Integer>list = new ArrayList<>();//10
        list.add(10);
        list.add(60);
        list.add(30);
        list.add(40);

        Collections.sort(list);
        System.out.println(list);
      /*  System.out.println(list.contains(100));
        System.out.println(list.get(0));
        System.out.println(list.indexOf(30));
        System.out.println(list.isEmpty());

        Iterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/


        List<Integer> list1 = new ArrayList<>();

        List<Integer> list3 = Arrays.asList(12,2,3,34,4);

        List<Integer> list4 = new ArrayList<>(Arrays.asList(12,2,3,34,4));

        List<Integer> list5 = new ArrayList<>(List.of(1,2,3,4));

        List<Integer> list6 = new ArrayList<>(){{
            add(10);add(33);
        }};
    }
}
