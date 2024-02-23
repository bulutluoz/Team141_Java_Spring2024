package day04_wrapperClass_MatematikselIslemler;

public class C07_IncrementDecrement {

    public static void main(String[] args) {

        int sayi = 10 ;

        sayi = sayi + 5;

        System.out.println(sayi); // 15


        sayi += 5;

        System.out.println(sayi); // 20;

        int artis = 30;

        sayi += artis;  // sayi = sayi + artis;


        System.out.println(sayi); //  50

        sayi = 2;

        sayi = sayi * 3 ; // 6

        System.out.println(sayi); // 6

        // sayinin degerini 5 katina cikarin

        sayi *= 5 ;

        System.out.println(sayi); // 30
    }
}
