package day20_arrays_multiDimensionalArrays;

import day19_arrays.C05_ElemanArama;

import java.util.Arrays;

public class C04_BinarySearch {

    public static void main(String[] args) {

        /*
            binarySearch()
              - array'de olan elemanlarin index'ini
              - olmayan elemanlarin ise - isareti ile
                olsalardi kacinci sirada olacaklarini dondurur
         */

        int[] arr = {3,15,27,8,3,5,1};

        C05_ElemanArama.elemanVarMi(arr,3); // Aranan sayi array'de 2 adet kullanilmistir
        C05_ElemanArama.elemanVarMi(arr,0); // Aranan eleman array'de yok

        // java'da bir array'de aranan bir elemanin varligini sorgulamak icin
        // Arrays.binarySearch() kullanilir

        System.out.println(Arrays.binarySearch(arr, 3)); // 0
        System.out.println(Arrays.binarySearch(arr, 1)); // -1
        System.out.println(Arrays.binarySearch(arr, 8)); // 3
        System.out.println(Arrays.binarySearch(arr, 27)); // -8
        System.out.println(Arrays.binarySearch(arr, 15)); // -8

        // binarySearch(), aranan elementin, array'de ilk kullanildigi index'i verir
        // AMA binarySearch() sort edilmis array'lerde saglikli calisir
        // sort edilmemis array'lerde sonuc ONGORULEMEZ

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 3, 3, 5, 8, 15, 27]


        System.out.println(Arrays.binarySearch(arr, 3)); // 1
        System.out.println(Arrays.binarySearch(arr, 1)); // 0
        System.out.println(Arrays.binarySearch(arr, 8)); // 4
        System.out.println(Arrays.binarySearch(arr, 27)); // 6
        System.out.println(Arrays.binarySearch(arr, 15)); // 5

        System.out.println(Arrays.binarySearch(arr, -15)); // -1
        System.out.println(Arrays.binarySearch(arr, 4)); // -4
        System.out.println(Arrays.binarySearch(arr, 10)); // -6
        System.out.println(Arrays.binarySearch(arr, 20)); // -7









    }
}
