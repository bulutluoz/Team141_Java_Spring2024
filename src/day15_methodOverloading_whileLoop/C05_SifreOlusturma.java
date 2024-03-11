package day15_methodOverloading_whileLoop;

import java.util.Scanner;

public class C05_SifreOlusturma {

    public static void main(String[] args) {

        // Main method icerisinde kullanicidan sifre isteyin
        // sifre, istenen sartlara uymadigi surece
        // kullanicidan yeni sifre istemeye devam edin
        // istenen sartlara uygun bir sifre girildiginde
        // "Sifreniz basariyla kaydedildi" yazdirin

        // sifre kontrolu icin bir method olusturun
        // asagidaki sartlari kontrol edin ve kullaniciye düzeltmesi gereken
        // tüm eksikleri söyleyin.
        // eğer tüm şartları sağlarsa method true , sartlar saglanmazsa false dondurecektir

        //ilk harf kucuk harf olmalı
        //son karakter rakam olmalı
        //sifre bosluk icermemeli
        //uzunlugu en az 10 karakter olmali.

        Scanner scanner = new Scanner(System.in);
        String sifre = "";
        boolean sifreSonuc = false;

        while (!sifreSonuc){ // sifreSonuc == false

            System.out.println("Lutfen sifre giriniz");
            sifre = scanner.nextLine();

             sifreSonuc = sifreUygunMu(sifre);

        }

        System.out.println("Sifreniz basariyla kaydedildi");

    }

    public static boolean sifreUygunMu(String sifre){

        int flag = 20;

        //         - ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);
        if ( !Character.isLowerCase(ilkHarf) ){
            System.out.println("Ilk karakter kucuk harf olmali");
            flag = 15;// hata varsa hep ayni degeri atayacagiz
        }

        //         - son karakter rakam olmali

        char sonHarf = sifre.charAt(sifre.length()-1);
        if ( !(sonHarf>='0' && sonHarf<='9')){

            System.out.println("Son karakter rakam olmali");
            flag = 15;
        }

        //         - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            flag = 15;
        }

        //         - uzunlugu en az 10 karakter olmali

        if (sifre.length() < 10){
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            flag = 15;
        }


        // flag kullanarak sonuc yazdirma

        if (flag == 20){
           return true;
        }else {
            return false;
        }
    }
}
