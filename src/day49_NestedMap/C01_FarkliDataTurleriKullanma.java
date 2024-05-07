package day49_NestedMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_FarkliDataTurleriKullanma {

    public static void main(String[] args) {

        /*
            Java'daki herhangi bir yapinin icerisinde
            farkli data turlerinden degerler bulundurmak istersek
            data turu olarak Object secebiliriz

            ANCAK data turunu object sectigimizde
            diger data turlerine ozgu olan length, size, toUpperCase gibi method'lar
            obje uzerinde calismayacaktir

            Data turunun spesifik method'larini kullanmak icin
            Objeyi kullanmak istedigimiz data turune CAST etmeliyiz
         */

        List<String> seyler = new ArrayList<>();

        seyler.add("Ali");
        seyler.add("4");
        //seyler.add(5);
        //seyler.add('d');
        //seyler.add(true);

        String[] harfler = {"a","b","c"};

        // seyler.add(harfler);

        // Bir listeye <> icinde yazilan data turu disinda
        // herhangi bir data turunden deger ekleyemeyiz


        List<Object> objeler = new ArrayList<>();

        objeler.add("Ali");
        objeler.add(5);
        objeler.add('d');
        objeler.add(true);
        objeler.add(harfler);
        objeler.add(seyler);

        System.out.println(objeler); // [Ali, 5, d, true, [Ljava.lang.String;@e580929, [Ali, 4]]

        // objeler listesinin 4.index'indeki array'i yazdirin
        System.out.println(Arrays.toString(((String[]) objeler.get(4))));


        // objeler listesinin ilk elementi olan Ali'nin uzunlugunu yazdirin

        System.out.println(((String) objeler.get(0)).length()); // 3

        // objeler listesinin 2.elementi olan 5'in 3 fazlasini yazdirin

        System.out.println(        ((Integer) (objeler.get(1) )       + 3)); // 8


    }
}
