package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {

        int i=0;
        Predicate<Integer> predicate1 = p-> p.equals(8);
//        System.out.println(predicate1.test(i));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Predicate<Integer> predicate = p->p>5;
        Function<Integer,Integer>function = f->f*2;
        list.stream()
                .map(function)
                .filter(predicate)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
