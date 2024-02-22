package day04_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C01_DataCasting_Char {
    // Soru 2- Kullanicidan bir harf alin
    //         ve alfabede o harften sonraki 3 harfi yazdirin.


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char girilenKarakter = scan.next().charAt(0);


        System.out.println("Girdiginiz karakterden bir sonraki karakter : " +(char) (girilenKarakter+1));
        System.out.println("Girdiginiz karakterden iki sonraki karakter : " + (char)(girilenKarakter+2));
        System.out.println("Girdiginiz karakterden uc sonraki karakter : " + (char)(girilenKarakter+3));

    }

}
