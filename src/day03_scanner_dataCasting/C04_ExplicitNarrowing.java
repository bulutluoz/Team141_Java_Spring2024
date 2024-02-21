package day03_scanner_dataCasting;

public class C04_ExplicitNarrowing {

    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 130;
        int sayi3 = 140;
        int sayi4 = 250;
        int sayi5 = 520;
        int sayi6 = 780;
        double dbl = 24.5;


        int sayi = (int)dbl;

        System.out.println("24.5'i integer'a cast edersek : " + sayi);
        // 24.5'i integer'a cast edersek : 24

        byte byt = (byte)sayi1;
        System.out.println("20'yi byte'a cast edersek : " + byt);
        // 20'yi byte'a cast edersek : 20


        byt = (byte)sayi2;
        System.out.println("130'u byte'a cast edersek : " + byt);
        // 130'u byte'a cast edersek : -126


        byt = (byte)sayi3;
        System.out.println("140'u byte'a cast edersek : " + byt);
        // 130'u byte'a cast edersek : -116


        byt = (byte)sayi4;
        System.out.println("250'yi byte'a cast edersek : " + byt);
        // 130'u byte'a cast edersek : -6


        byt = (byte)sayi5;
        System.out.println("520'yi byte'a cast edersek : " + byt);
        // 130'u byte'a cast edersek : 8

        byt = (byte)sayi6;
        System.out.println("780'i byte'a cast edersek : " + byt);
        // 130'u byte'a cast edersek : 12
















    }
}
