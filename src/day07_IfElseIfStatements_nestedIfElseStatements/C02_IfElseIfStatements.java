package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {

    public static void main(String[] args) {

        /*
            Verilen gorev sonucunda yazdigimiz kod
            else(geriye kalanlar) ile bitmeyebilir

            EGER
            if, else-if,.... cumleleri else ile bitmiyorsa
            bazi degerler icin hic bir if body'sinin calismayacagini
            gozonunde bulundurmaliyiz
         */

        // kullanicdan bir tamsayi alin
        // sayi 0'dan kucukse "negatif sayi" yazdirin
        // negatif olmayan sayilardan
        // tek basamakli olanlar icin "Rakam",
        // iki basamakli sayilar icin "Sayi",
        // uc basamakli sayilar icin "Buyuk sayi" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi < 0) System.out.println("Negatif sayi");
        else if (girilenSayi < 10) System.out.println("Rakam");
        else if (girilenSayi<100) System.out.println("Sayi");
        else if (girilenSayi<1000) System.out.println("Buyuk sayi");

    }
}
