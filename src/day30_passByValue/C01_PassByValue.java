package day30_passByValue;

import java.util.Scanner;

public class C01_PassByValue {

    public static void main(String[] args) {

        // Main method’da verilen fiyat degerine
        // %10, %20 ve %30 indirim yaparak,
        // indirimli fiyati bize döndüren 3 method olusturun.

        // Main method’dan bu 3 method’u arka arkaya cagirip,
        // return edilen fiyatlari yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen indirimsiz fiyati giriniz...");
        double fiyat = scanner.nextDouble(); // 100

        System.out.println("%10 indirimli fiyat : "+yuzde10IndirimYap(fiyat));// 90

        System.out.println("%10 indirimli fiyat methodu cagrildiktan sonra fiyat : " + fiyat); // 100

        System.out.println("%20 indirimli fiyat : "+yuzde20IndirimYap(fiyat));// 80

        System.out.println("%20 indirimli fiyat methodu cagrildiktan sonra fiyat : " + fiyat); // 100

        // fiyatta kalici olarak %30 indirim yapin
        System.out.println("%30 indirimli fiyat : "+yuzde30IndirimYap(fiyat));// 70

        fiyat = yuzde30IndirimYap(fiyat);

        System.out.println("%30 indirimli fiyat methodu cagrildiktan sonra fiyat : " + fiyat); // 100

    }

    public static double yuzde10IndirimYap(double ucret){

        ucret = ucret *90/100;

        return ucret;
    }

    public static double yuzde20IndirimYap(double fiyat){

        fiyat = fiyat *80/100;

        return fiyat;
    }

    public static double yuzde30IndirimYap(double fiyat){

        fiyat = fiyat *70/100;

        return fiyat;
    }
}
