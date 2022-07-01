package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortedDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,34,4,5);

        Set<Integer> list1 = list.stream().
                sorted(Collections.reverseOrder()).collect(Collectors.toSet());
        System.out.println(list1);
    }
}
