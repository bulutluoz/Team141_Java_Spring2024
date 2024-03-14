package day19_arrays;

import java.util.Arrays;

public class C02_ElemanlariToplama {

    public static void main(String[] args) {

        // Verilen bir int array'deki tum elementleri toplayip yazdiran bir method olusturun

        int[] sayilar = {3,4,5,6};

        elementToplamiYazdir(sayilar); // Verilen array'deki elementlerin toplami : 18

        // sayilar[4] = 8; // ArrayIndexOutOfBoundsException


        int[] yeniArr = {3,4,5,6,8};

        sayilar = yeniArr;

        System.out.println("Sayilar array'inin yeni hali : " + Arrays.toString(sayilar));

        elementToplamiYazdir(sayilar); // Verilen array'deki elementlerin toplami : 26

    }


    public static void elementToplamiYazdir(int[] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            toplam += arr[i];

        }

        System.out.println("Verilen array'deki elementlerin toplami : " + toplam);

    }
}
