package java8;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,23,3,4,5,5);

        int sum= 0;
        for(int i=0;i< list.size();i++){
            sum = sum+list.get(i);
        }

        System.out.println(sum);

        Integer integer  = list.stream().reduce(0,Integer::sum);

        System.out.println(integer);
    }
}
