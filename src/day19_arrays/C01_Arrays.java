package day19_arrays;

import java.util.Arrays;

public class C01_Arrays {

    public static void main(String[] args) {

        int[] arr = new int[4];  // [0, 0, 0, 0]

        // array'in 2.index'indeki elementi yazdirin

        System.out.println(arr[2]); // 0

        // array'in 1.index'ine deger olarak 5 atayin

        arr[1] = 5;

        // tum array'i yazdirin

        System.out.println(arr);  // [I@2752f6e2

        System.out.println(Arrays.toString(arr)); // [0, 5, 0, 0]


        // bir array'de kac eleman oldugunu (length) yazdirin

        System.out.println(arr.length); // 4

        // array'deki tum elemanlari yanlarinda bir bosluk birakarak yazdirin

        for (int i = 0; i < arr.length ; i++) {

            System.out.print(arr[i] + " ");
        }

    }
}
