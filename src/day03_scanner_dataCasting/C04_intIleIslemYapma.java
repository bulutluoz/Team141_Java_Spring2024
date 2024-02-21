package day03_scanner_dataCasting;

public class C04_intIleIslemYapma {

    public static void main(String[] args) {

        int sayi1 = 24;
        int sayi2 = 8;
        int sayi3 = 10;

        System.out.println( sayi1 / sayi2 ); // 3

        System.out.println( sayi1 / sayi3 ); // 24 / 10 ==> 2.4 ==> 2

        // isleme giren sayilarin ikisi de int oldugundan,
        // Java sonucu da int olarak verir.


        double dbl = 24;

        System.out.println( dbl / sayi2 ); // 24.0 / 8 ==> 3.0

        System.out.println(  dbl / sayi3 ); // 24.0 / 10 ==> 2.4



        int a = 27;
        int b = 4;

        // a/b'yi ondalikli olarak yazdirin


        // direk bolsek
        System.out.println( a / b); // 27 / 4 ==> 6.75 ==> 6

        // bolme isleminin sonucunu double variable'a atasak
        double sonuc = a / b ;

        System.out.println(sonuc); // 6.0


        // sayilardan birini double'a cast edelim

        sonuc = (double)a / b ;
        System.out.println(sonuc); // 6.75


    }
}
