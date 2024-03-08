package day15_methodOverloading_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

    public static void main(String[] args) {

        // Tekrar sayisi belli olmayan islemleri
        // while loop ile yapmak daha avantajlidir

        // Kullanicidan toplanmak uzere tam sayilar isteyin
        // sayilarin toplami 500 veya daha fazla olursa
        // sayi istemeyi durdurup, toplami yazdirin.


        Scanner scanner = new Scanner(System.in);

        int sayi = 0 ;
        int toplam = 0 ;

        while (toplam < 500){

            System.out.println("Toplanmak uzere tam sayi giriniz...");
            sayi = scanner.nextInt();
            toplam += sayi;

        }

        System.out.println("Girdiginiz sayilarin toplami : " + toplam);

    }
}
