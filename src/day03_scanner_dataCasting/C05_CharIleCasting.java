package day03_scanner_dataCasting;

public class C05_CharIleCasting {

    public static void main(String[] args) {

        // char data turu ozel bir data turudur
        // normal olarak '' icinde tek bir karakter olabilir
        // ANCAK char data turu int ile gecis ozelligine sahiptir
        // char data turundeki bir variable, matematiksel isleme sokulursa
        // ASCII tablosundaki degeri ile isleme girer
        // ayni sekilde ASCII tablosundaki deger ile
        // int data turu olarak kullanilabilir

        char harf = 'a';

        int sayi = harf;

        double dbl = harf;


        char chr1 = 243;


        System.out.println(  'a' + 'b'); // 195

        System.out.println( '1' + '2'); // 49 + 50 ==> 99
    }
}
