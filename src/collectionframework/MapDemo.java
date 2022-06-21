package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Pune");
        map.put(2,"Mumbai");
        map.put(3,"Nashik");

        System.out.println(map);

        map.forEach((k,v)->{
            System.out.println(k+ " "+v);
        });

        for (Map.Entry<Integer,String> m: map.entrySet()){
            System.out.println(m.getKey()+ " "+ m.getValue());
        }
    }
}
