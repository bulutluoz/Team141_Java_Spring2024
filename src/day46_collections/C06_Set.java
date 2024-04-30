package day46_collections;

import java.util.Set;
import java.util.TreeSet;

public class C06_Set {

    public static void main(String[] args) {

        Set<String> harfler = new TreeSet<>();

        harfler.add("a");
        harfler.add("b");
        harfler.add("a");
        harfler.add("a");

        System.out.println(harfler); // [a, b]

        Set<String> isimler = new TreeSet<>();

        isimler.add("Seren");
        isimler.add("Bugra Can");
        isimler.add("Ilgar");

        System.out.println(isimler); // [Bugra, Ilgar, Seren]

        // Set'de bulunan tum isimlerdeki toplam karakter sayisini yazdirin
        // Set INDEX KULLANMAZ
        // tum elementleri elden gecirmek istersek
        // iterator veya for-each loop kullanabiliriz

        System.out.println(isimler.size()); // 3

        int toplamharfSayisi = 0;

        for (String eachIsim : isimler
             ) {

            toplamharfSayisi += eachIsim.length();
        }


        System.out.println("Setteki toplam karakter sayisi : " + toplamharfSayisi);
        // Setteki toplam karakter sayisi : 19

        // Set'deki tum isimleri Buyuk harfe donusturup kaydedin

        /*
            Set index desteklemedigi icin
            elemanlar uzerinde degisiklik yapmak zor olur
            eger elemanlarda degisiklik yapmak istersek
            once bos bir set olusturup,
            eski setteki elemanlara istenen degisikligi yapip yeni set'e ekleriz
            islem bittikten sonra eski set'e deger olarak yeni set'i atariz

         */

        Set<String> yeniSet = new TreeSet<>();

        for (String eachIsim: isimler
             ) {
            yeniSet.add(eachIsim.toUpperCase());

        }

        System.out.println("isimler : " +isimler); // [Bugra Can, Ilgar, Seren]
        System.out.println("yeni set : " + yeniSet); // [BUGRA CAN, ILGAR, SEREN]

        isimler = yeniSet;

        System.out.println("Isimler set'inin son hali : " + isimler);


    }
}
