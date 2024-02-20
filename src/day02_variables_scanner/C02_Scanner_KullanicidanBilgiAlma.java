package day02_variables_scanner;

import java.util.Scanner;

public class C02_Scanner_KullanicidanBilgiAlma {

    public static void main(String[] args) {

        // Kullanicidan ismini alip
        // ismi buyuk harf olarak yazdirin

        // Kullanicidan bilgi almak icin
        // 3 adima ihtiyac vardir


        // 1- Bir scanner objesi olusturmak

        Scanner scanner = new Scanner(System.in);


        // 2- Kullaniciya ne istedigimizi soylemeliyiz

        System.out.println("Lutfen isminizi giriniz...");

        // 3- Istedigimiz bilgiyi kaydedebilecegimiz,
        //    istenen bilgiye UYGUN bir variable olusturun,
        //    olusturdugumuz scanner objesi ile uygun hazir method'u kullanip
        //    kullanicinin girdigi degeri, konsoldan alip,
        //    olusturdugumuz variable'a atayin

        // Bu gorevde isim istedigimiz icin String bir variable olusturduk
        // ve scanner.nextLine()' i kullandik
        // next() ==> bize ilk space'e kadar olan kismi verir
        //            ornegin kullanici "Ali Can Aslan" girerse, next() sadece Ali'yi alir
        // nextLine() ==> Tum satiri alir

        String kullaniciIsmi = scanner.nextLine();

        // 37.satirda kullanicidan bilgiyi alip, kod dunyasina kaydettik
        // bundan sonra bizden istenen islemi yapabiliriz

        System.out.println( "Girilen ismin buyuk harfle yazilisi : "  + kullaniciIsmi.toUpperCase());


    }
}
