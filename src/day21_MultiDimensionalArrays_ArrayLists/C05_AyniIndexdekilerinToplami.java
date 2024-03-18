package day21_MultiDimensionalArrays_ArrayLists;

import java.util.Arrays;

public class C05_AyniIndexdekilerinToplami {

    public static void main(String[] args) {

        //Soru 2- Verilen 2 katli ,2 elemanli bir multidimensional array’de
        //        inner array'lerde ayni index’e sahip elementleri toplayip,
        //        yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //		input :      int[][] arr =  {{3,4,5}, {2,3,6,7}};
        //	    output:                       [5, 7, 11]

        int[][] arr =  {{3,4,5}, {2,3,6,7}};

        // once yeni olusturacagimiz array'in uzunlugunu belirlemek icin
        // verilen array'lerden kisa olanin length'ini bulmaliyiz

        int yeniArrLength = arr[0].length<arr[1].length ? arr[0].length : arr[1].length;

        int[] yeniArr = new int[yeniArrLength]; // [0, 0, 0]

        for (int i = 0; i <yeniArrLength ; i++) {

            yeniArr[i] = arr[0][i]+arr[1][i];

        }

        System.out.println(Arrays.toString(yeniArr));
    }
}
