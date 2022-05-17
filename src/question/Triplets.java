package question;

public class Triplets {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 6, 3, 9};
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 11) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

}
