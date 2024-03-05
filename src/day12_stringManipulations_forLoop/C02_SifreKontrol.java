package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class C02_SifreKontrol {

    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz...");
        String sifre = scanner.nextLine();

        /*
            eger if-else kullanirsaniz

            + tum hatalari sirasiyla kontrol eder,
              en sonda hata if'lerine takilmazsa basarili sifre yazdirabiliriz
            - if else cumlelerinde, suzgec mantigi oldugundan
              sadece 1 hatayi yazdirabiliriz

            Bagimsiz if cumleleri kullanirsak
            + sifredeki tum hatalari yazdirabiliriz
            - bagimsiz if cumleleri kodun kendileri disindaki kismiyla ilgilenmez
              yani sifrenin basarili oldugunu yazdirabilmek icin
              ekstra bir kontrol mekanizmasi kullanmalisiniz
         */

        int flag = 20;
        int sayac = 0;

        //         - ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);
        if ( !Character.isLowerCase(ilkHarf) ){
            System.out.println("Ilk karakter kucuk harf olmali");
            flag = 15;// hata varsa hep ayni degeri atayacagiz
            sayac++; // hata varsa sayaci 1 artir
        }

        //         - son karakter rakam olmali

        char sonHarf = sifre.charAt(sifre.length()-1);
        if ( !(sonHarf>='0' && sonHarf<='9')){

            System.out.println("Son karakter rakam olmali");
            flag = 15;
            sayac++;
        }

        //         - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            flag = 15;
            sayac++;
        }

        //         - uzunlugu en az 10 karakter olmali

        if (sifre.length() < 10){
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            flag = 15;
            sayac++;
        }


        // flag kullanarak sonuc yazdirma

        if (flag == 20){
            System.out.println("Sifre basarili olarak kaydedildi");
        }else {
            System.out.println("Lutfen hatalari duzelterek yeniden sifre giriniz");
        }


        // sayac kullanarak sonucu yazdirma

        if (sayac == 0){
            System.out.println("Sifre basarili olarak kaydedildi");
        }else {
            System.out.println(sayac + " adet hata yaptiniz, Lutfen tekrar deneyin");
        }



    }
}
