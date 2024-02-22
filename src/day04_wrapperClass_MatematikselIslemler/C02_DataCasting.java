package day04_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C02_DataCasting {

    public static void main(String[] args) {

        //Soru 1- Int olarak verilen 3 degerin ortalamasini
        //        double olarak yazdiran bir kod yazin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 = scanner.nextInt();


        // islem yapilan variable'larin hepsi int ise Java sonucun int kismini verir
        System.out.println("Girilen sayilarin ortalamasi : " +    (sayi1+sayi2+sayi3)/3  );

        // bolme isleminde pay veya paydayi double yaparsak sonuc double olur
        System.out.println("Girilen sayilarin ortalamasi : " +  (double)  (sayi1+sayi2+sayi3)/3  );
    }
}
