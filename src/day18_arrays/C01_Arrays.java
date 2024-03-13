package day18_arrays;

import java.util.Arrays;

public class C01_Arrays
{

    public static void main(String[] args) {

        // Bir array iki sekilde olusturulabilir
        // 1 - deklarasyon ve icindeki tum elementler yazilabilir

        String[] isimler = {"Mahmut","Hasan","Ilgar","Sumeyra"};

        String harfler[] = {"a","l","d"};


        // 2- deklarasyon ve array'in eleman sayisi yazilip array olusturulabilir

        int[] sayilar = new int[3];  // [0, 0, 0]


        // isimler array'inden Hasan'i yazdir

        System.out.println(isimler[1]); // Hasan


        // {"a","l","d"};
        // harfler array'inin 1.index'indeki harf'i yazdirin

        System.out.println(harfler[1]); // l

        // harfler array'inin 2.index'indeki elemani i yapin

        harfler[2] ="i";

        // harfler array'ine 4.eleman olarak Q'yu atayin

        // harfler[4] = "Q"; // ArrayIndexOutOfBoundsException


        // Icinde 5,8,1 sayilarinin oldugu bir array olusturun

        int[] sayilar2 = {5,8,1};


        int[] sayilar3 = new int[3]; // [0, 0, 0]
        sayilar3[0] = 5;
        sayilar3[1] = 8;
        sayilar3[2] = 1;


        System.out.println(sayilar3); // [I@2752f6e2 sayilar3 array'inin referansidir

        System.out.println(Arrays.toString(sayilar3)); // [5, 8, 1]




    }
}






















