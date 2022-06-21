package collectionframework;

import java.util.*;

public class ListOfMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Pune");
        map1.put(2,"Mumbai");
        map1.put(3,"Nashik");

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(1,"Pune");
        map2.put(2,"Mumbai");
        map2.put(3,"Nashik");

        Map<Integer,String> map3 = new HashMap<>();
        map3.put(1,"Pune");
        map3.put(2,"Mumbai");
        map3.put(3,"Nashik");

        List<Map<Integer,String>> list = Arrays.asList(map1,map2,map3);

        list.forEach(l->{
            l.forEach((k,v)->{
                System.out.println(k+ " "+v);
            });
        });

    }
}
