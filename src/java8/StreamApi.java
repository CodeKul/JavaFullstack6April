package java8;

//stream api - > it is sequence of object and have many methods,and combine that method to produce desire result
// parallel and sequential
// operation ->
// 1 . terminal operation - forEach(Consumer) , reduce(), collect()
// 2 . intermediate operation - map(Function) ,filter(Predicate), sorted()


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Function<Integer,Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply (Integer integer) {
                return integer * 2 ;
            }
        };
//        list.stream().map(function).forEach(System.out::println);

        List<String> stringList = Arrays.asList("Pune","Mumbai","Nashik");

        Function<String,String> function1 = f-> f.toUpperCase();

        stringList.stream().map(function1).forEach(System.out::println);
    }
}
