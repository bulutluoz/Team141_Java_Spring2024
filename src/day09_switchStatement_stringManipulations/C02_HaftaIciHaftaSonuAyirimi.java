package day09_switchStatement_stringManipulations;

import java.util.Scanner;

public class C02_HaftaIciHaftaSonuAyirimi {

    public static void main(String[] args) {

        // kullanicidan gun numarasini isteyin
        // 1- pazartesi .... 7 pazar olacak sekilde
        // girilen numaraya karsilik hafta ici veya hafta sonu
        // seceneklerinden uygun olani yazdirin
        // Kullanici 1-7 arasinda sayi girmezse hata mesaji verin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Gun ismini yazdirmak icin 1-7 arasi bir tamsayi giriniz...");
        int gunNo = scanner.nextInt();

        switch (gunNo){

            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("hafta ici");
                break;
            case 6 :
            case 7 :
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("gecerli bir gun numarasi giriniz");
        }


    }
}
