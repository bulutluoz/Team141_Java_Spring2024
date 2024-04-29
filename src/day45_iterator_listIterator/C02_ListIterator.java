package day45_iterator_listIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {

    /*
        ListIterator ile ilgili dikkat edilecekler
        1- lit her lit.next(); gordugunde
           iterator'i bir saga goturur,
           islem hatasi yapmamak icin while loop icerisinde
           sadece 1 kere lit.next(); kullanilmalidir

        2- iterator biz soylemedikce hareket etmez,
           biz nerede birakirsak orada bizi bekler

           biz bir isleme baslamadan once
           iterator'in yerini belirlemeli,
           eger istedigimiz yerde degilse,
           istedigimiz yere gondermeliyiz
     */

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>(Arrays.asList(4,7,9,2,5));

        System.out.println(liste); // [    4,   7,   9,   2,   5   ]

        // index kullanmadan listedeki cift sayilari 2,
        // tek sayilari 1 artirin
        ListIterator<Integer> lit = liste.listIterator();

        while (lit.hasNext()){

            Integer sayi = lit.next();
            if (sayi % 2 == 0){ // sayi ciftse
                lit.set(sayi+2);
            }else{ // sayi tekse
                lit.set(sayi+1);
            }
        }

        System.out.println(liste); //  [6, 8, 10, 4, 6]

        // listenin yeni halinde
        // elementleri sondan basa dogru yazdirin
        // bu satir itibariyle lit en sonda
        // bu gorev icin lit dogru yerde

        while(lit.hasPrevious()){

            System.out.print(lit.previous() + " ");

        }

        System.out.println("\n" +liste); // [ 6, 8, 10, 4, 6]


        // listeyi sondan basa dogru tekrar yazdirin
        // yukaridaki gorevlerden sonra
        // lit en basa geldi
        // bizim elementleri sondan basa yazdirabilmemiz icin
        // lit'i yeniden en sona goturmeliyiz
        while (lit.hasNext()){
            lit.next();
        }
        // yukaridaki while loop
        // lit'i en sona goturur
        // artik gorevi yapabiliriz

        while(lit.hasPrevious()){

            System.out.print(lit.previous() + " ");

        }
    }
}
