package day20_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C02_ArrayeElemanEkleme {

    public static void main(String[] args) {

        // verilen int bir array'e istenen elemani ekleyip
        // array'in son halini donduren bir method olusturun

        int[] sayilar = {3,5,7};
        int eklenecekSayi = 9;

        sayilar = arrayeElemanEkle(sayilar,9);

        System.out.println("sayilar'in 9 eklenmis hali : " + Arrays.toString(sayilar));
        // sayilar'in 9 eklenmis hali : [3, 5, 7, 9]


        sayilar = arrayeElemanEkle(sayilar,1);
        System.out.println("sayilar'in 1 eklenmis hali : " + Arrays.toString(sayilar));
        // sayilar'in 1 eklenmis hali : [3, 5, 7, 9, 1]

        arrayeElemanEkle(sayilar,0); // [3, 5, 7, 9, 1, 0] ==> havaya ucar

        System.out.println(Arrays.toString(arrayeElemanEkle(sayilar,2)));
        // array'in yeni halini yazdirir ama array eski halinde kalir
        // [3, 5, 7, 9, 1, 2]

        System.out.println("Method'la 2 ekleyip yazdirdiktan sonra sayilar : " + Arrays.toString(sayilar));
        // Method'la 2 ekleyip yazdirdiktan sonra sayilar : [3, 5, 7, 9, 1]

        sayilar = arrayeElemanEkle(sayilar,4);
        // array'i 4 ekli halde kaydeder, ama yazdirmadigimiz icin goremeyiz


    }



    public static int[] arrayeElemanEkle(int[] arr , int eklenecekSayi){

        // var olan bir array'e yeni eleman ekleyemeyiz
        // ama array'e toptan yeni bir array degeri atayabiliriz

        // once uzunlugu eski array'den 1 fazla olan bos bir array olusturalim
        int[] yeniArr = new int[arr.length+1]; // [0, 0, 0, 0]

        // eski array'deki elemanlari ayni index'lerle yeni array'e atayalim

        for (int i = 0; i < arr.length ; i++) {

            yeniArr[i] = arr[i];
        }// [3, 5, 7, 0]

        // yeni array'in son index'ine eklenmek istenen sayiyi atayalim

        yeniArr[yeniArr.length-1] = eklenecekSayi;


        return yeniArr;
    }
}
