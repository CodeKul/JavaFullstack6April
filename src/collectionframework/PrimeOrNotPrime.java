package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class PrimeOrNotPrime {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            int num = arr[j];
            boolean flag = false;
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }

        System.out.println(list);
    }
}
