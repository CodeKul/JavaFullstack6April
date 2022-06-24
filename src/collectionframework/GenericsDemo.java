package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {

        GenericsDemo<Integer> obj = new GenericsDemo<>();
        obj.setT(10);
        System.out.println(obj.getT());

        GenericsDemo<String> obj1 = new GenericsDemo<>();
        obj1.setT("Hello");

        System.out.println(obj1.getT());

        List<String> list = new ArrayList<>();
        list.add("hello");
        String s = list.get(0);
    }
}
