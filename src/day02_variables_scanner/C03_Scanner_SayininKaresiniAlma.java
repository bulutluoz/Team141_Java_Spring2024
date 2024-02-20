package day02_variables_scanner;

import java.util.Scanner;

public class C03_Scanner_SayininKaresiniAlma {

    public static void main(String[] args) {

        // Kullanicidan bir tamsayi isteyip
        // sayinin karesini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz...");

        int girilenSayi = scanner.nextInt();

        System.out.println("Girilen sayinin karesi : " + girilenSayi*girilenSayi);

    }
}
