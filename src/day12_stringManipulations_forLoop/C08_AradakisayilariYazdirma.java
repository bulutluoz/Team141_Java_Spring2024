package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class C08_AradakisayilariYazdirma {

    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degerlerini alip
        // sinirlar dahil olarak
        // aralarindaki 9 ile bolunebilen sayilari yazdirin
        // bitis degeri baslangictan kucuk olsa da kod calismalidir

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen baslangic degerini giriniz...");
        int baslangic = scanner.nextInt();

        System.out.println("Lutfen bitis degerini giriniz...");
        int bitis = scanner.nextInt();

        if (baslangic < bitis){

            for (int i = baslangic; i <=bitis ; i++) {

                if (i % 9 == 0){
                    System.out.print(i + " ");
                }
            }

        }else { // baslangic >= bitis

            for (int i = baslangic; i >= bitis ; i--) {

                if (i % 9 == 0){
                    System.out.print(i + " ");
                }

            }

        }

    }
}
