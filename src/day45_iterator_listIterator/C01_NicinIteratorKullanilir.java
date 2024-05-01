package day45_iterator_listIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_NicinIteratorKullanilir {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(5,9,2,4));
        System.out.println(sayilar); // [5, 9, 2, 4]


        // sayilar listesindeki tum elementleri, 2 artirip
        // yeni haliyle listeyi kaydedin [7, 11, 4, 6]

        for (int i = 0; i < sayilar.size() ; i++) {

            int eskiDeger = sayilar.get(i);
            sayilar.set(i, eskiDeger+2);
        }

        System.out.println(sayilar); // [7, 11, 4, 6]


        // Index kullanmadan sayilar listesindeki tum elementleri
        // yeniden 2 artirin ve yeni haliyle kaydedin

        for (int each : sayilar
             ) {
            each +=2;
        }

        System.out.println(sayilar); // [7, 11, 4, 6]


        // Java'da her zaman index kullanamayabiliriz
        // index kullanmadan bir listedeki tum elementlere ulasmak istersek
        // iterator kullanabiliriz

        // index kullanmadan, sayilar listesindeki tek sayilari silin

        // [    7,      11,      4,      6    ]


        Iterator iterator = sayilar.iterator();

        System.out.println(iterator.hasNext()); // true

        Integer sayi = (Integer) iterator.next();

        if (sayi % 2 != 0){
            iterator.remove();  // 7'yi siler
        }

        System.out.println(iterator.hasNext()); // true

        sayi = (Integer) iterator.next();

        if (sayi % 2 != 0){
            iterator.remove();  // 11'yi siler
        }

        System.out.println(sayilar); // [4, 6]
        sayilar.add(15);
        sayilar.add(22);
        sayilar.add(43);


        System.out.println(sayilar);
        // [   4,    6,    15,    22,    43   ]

        // eger her element icin bu islemi tek tek yazmak istemezsek
        // bir while loop kullanabiliriz
        iterator = sayilar.iterator();


        while(iterator.hasNext()){  // iterator.hasNext() == true

            sayi = (Integer) iterator.next();
            if (sayi % 2 != 0){
                iterator.remove();
            }

        }

        System.out.println(sayilar); // [4, 6, 22]



    }

}
