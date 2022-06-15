package collectionframework;

public class PrimeOrNotPrime {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        for (int j = 0; j < arr.length; j++) {
            boolean flag = false;
            for (int i = 2; i <= arr[j] / 2; ++i) {
                if (arr[j] % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) System.out.println(arr[j]);
        }
    }
}
