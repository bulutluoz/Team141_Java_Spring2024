package day09_switchStatement_stringManipulations;

import java.util.Scanner;

public class C01_GunIsmiYazdirma {

    public static void main(String[] args) {

        // kullanicidan gun numarasini isteyin
        // 1- pazartesi .... 7 pazar olacak sekilde
        // girilen numaraya karsilik gelen gun ismini yazdirin
        // Kullanici 1-7 arasinda sayi girmezse hata mesaji verin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Gun ismini yazdirmak icin 1-7 arasi bir tamsayi giriniz...");
        int gunNo = scanner.nextInt();

        if (gunNo==1){
            System.out.println("pazartesi");
        } else if (gunNo==2) {
            System.out.println("sali");
        } else if (gunNo==3) {
            System.out.println("carsamba");
        } else if (gunNo==4) {
            System.out.println("persembe");
        } else if (gunNo==5) {
            System.out.println("cuma");
        } else if (gunNo==6) {
            System.out.println("cumartesi");
        } else if (gunNo==7) {
            System.out.println("pazar");
        }else {
            System.out.println("gecerli bir gun numarasi giriniz");
        }



        // Switch statement if-else ile yapilabilecek gorevlerde
        // durum sayisi cok oldugunda, daha duzenli bir gorunum elde etmek icin kullanilir
        System.out.println("===============");

        switch (gunNo){

            case 1 :
                System.out.println("pazartesi");
                break;
            case 2 :
                System.out.println("sali");
                break;
            case 3 :
                System.out.println("carsamba");
                break;
            case 4 :
                System.out.println("persembe");
                break;
            case 5 :
                System.out.println("cuma");
                break;
            case 6 :
                System.out.println("cumartesi");
                break;
            case 7 :
                System.out.println("pazar");
                break;
            default:
                System.out.println("gecerli bir gun numarasi giriniz");
        }





    }
}
