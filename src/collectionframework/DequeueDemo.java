package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);

        deque.addLast(60);
        deque.addFirst(50);
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());


    }
}
