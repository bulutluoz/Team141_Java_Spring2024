package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class C07_AradakisayilariYazdirma {

    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degerlerini alip
        // sinirlar dahil olarak
        // baslangictan bitise kadar 7 ile bolunebilen sayilari yazdirin
        // bitis degeri baslangictan kucuk ise hata mesaji yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen baslangic degerini giriniz...");
        int baslangic = scanner.nextInt();

        System.out.println("Lutfen bitis degerini giriniz...");
        int bitis = scanner.nextInt();

        if (bitis < baslangic){
            System.out.println("Bitis degeri, baslangictan kucuk olamaz");
        }else{

            for (int i = baslangic; i <=bitis ; i++) {

                if (i%7==0){
                    System.out.print(i+" ");
                }
            }





        }
    }
}
