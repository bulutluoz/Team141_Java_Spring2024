package day19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaArrayOlusturtma {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan
        //         ve bize donduren bir method olusturun.

        // System.out.println(Arrays.toString(arrayOlustur()));

        int[] kullaniciArr = arrayOlustur();


    }


    public static int[] arrayOlustur(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen array'in kac elemanli olacagini giriniz...");
        int length = scanner.nextInt();


        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {

            System.out.println(i + ". index'deki eleman icin bir deger giriniz...");

            arr[i] = scanner.nextInt();
        }

        return arr;
    }
}
