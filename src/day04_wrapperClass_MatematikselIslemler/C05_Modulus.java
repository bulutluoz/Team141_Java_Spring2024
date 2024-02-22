package day04_wrapperClass_MatematikselIslemler;

public class C05_Modulus {

    public static void main(String[] args) {

        System.out.println( 25 % 4 ); // 1

        System.out.println(23454321 % 7); // 2 bu sayi 7 ile tam bolunmez

        // 354645241 sayisi 17'ye bolunur mu ?

        System.out.println(354645241 % 17 ); // 13 tam bolunemiyor

        int verilenSayi = 456;

        System.out.println( 456 % 2 ); // 0 ==> verilen sayi cift sayi


        // verilen sayinin birler basamagini yazdirin

        System.out.println( verilenSayi % 10 ); // 6

        System.out.println( verilenSayi / 10 ); // 456/10 ==> 45,6 java 45 yazdirir

    }
}
