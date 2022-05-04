package controlstatement;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 14;
        arr[1] = 13;
        arr[2] = 12;
        arr[3] = 11;
        arr[4] = 10;

        //traditional for loop
//        for(int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }

        //reverse array
        for(int i= arr.length-1;i>= 0;i--){
            System.out.println(arr[i]);
        }

        //enhanced for loop
//        for (int j:arr) {
//            System.out.println(j);
//        }

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);

        list.forEach(s->{
            System.out.println(s);
        });

        /**
         *
         *    * * * * *
         *    * * * * *
         *    * * * * *
         *    * * * * *
         *
         */

        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        /**
         *  *
         *  * *
         *  * * *
         *  * * * *
         *  * * * * *
         *
         */

        /**
         *  * * * *
         *  *     *
         *  *     *
         *  * * * *
         *
         */
    }
}
