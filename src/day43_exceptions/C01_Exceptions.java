package day43_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exceptions {

    public static void main(String[] args) {

        // kullanicidan iki tamsayi alip
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz");

        /*
            java kodlari calistirirken
            bir sorunla karsilastiginda
            ONCELIKLE kod yazarinin bu sorunu ongorup, cozum yolu gosterip gostermedigini kontrol eder
              - eger cozum yolu gosterilmisse,
                o cozumu gerleslestirir (handle eder) ve NORMAL calismasina devam eder
              - eger cozum yolu gosterilmemisse
                kodun calismasini o satir itibariyle durdurur
                hatanin bulundugu satiri, hatanin cinsini ve sebebini bize rapor eder

            Iyi bir kod yazarinin
            exception olusma olasiliklarini iyi tespit edip
            java'ya tum olasi exception durumlarinda
            ne yapmasi gerektigini soyler
         */

        int sayi1 = 1;
        int sayi2 = 1;
        boolean hataVarMi = false;

        try { // try : bu kodlari calistirmaya gayret et
            sayi1 = scanner.nextInt();
            sayi2 = scanner.nextInt();

        } catch (InputMismatchException e) {
            // EGER yukarda calistirmak istedigimiz kodlarda
            // sana yazdigim InputMismatchException olusursa
            // o zaman o exception'i e objesine kaydet
            // ve simdi sana yazacagim kodlari calistir

            System.out.println("Sana tamsayi yaz dedik :) ");
            hataVarMi = true;

        }

        // bu iki sayiyi birbirine bolup, sonucu yazdirin

        if (hataVarMi){
            System.out.println("Hatalari duzeltip sonra tekrar dene");
        } else if (sayi2 == 0){
            System.out.println("bolecek sayi 0 olamaz");
        }else {
            System.out.println("Sayilarin bolum sonucu : " + sayi1 / sayi2 );
        }




    }
}
