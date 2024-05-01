package day47_maps;

import java.util.*;

public class C01_Maps {

    public static void main(String[] args) {

        // Bir ogrenci map'i olusturmamiz isteniyor
        // map olusturmadan once
        // 1- Hangi bilgileri tutacagiz No, isim, soyisim, sinif, sube, bolum
        // 2- hangi bilgi key olacak ? No
        // 3- Geriye kalan bilgiler, hangi data turunde value olarak birlestirilecek
        //    value olusturan bilgiler hangi sira ile tutulacak
        //    ve ihtiyac oldugunda o bilgilere nasil ulasilacak ?

        Map<Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");

        System.out.println(ogrenciMap);
        /*
            {
            101=Ali-Can-11-H-MF,
            102=Veli-Cem-10-K-TM,
            103=Ali-Cem-11-K-TM
            }
         */

        // bu map'de kac eleman var
        System.out.println(ogrenciMap.size()); // 3

        // sadece key'leri yazdiralim

        System.out.println(ogrenciMap.keySet()); // [101, 102, 103]

        // map'de 102 diye bir key var mi ?
        System.out.println(ogrenciMap.containsKey(102)); // true

        // map'de 105 diye bir key var mi ?
        System.out.println(ogrenciMap.containsKey(105)); // false

        // 101 numarali ogrencinin bilgilerini yazdirin
        System.out.println(ogrenciMap.get(101)); // Ali-Can-11-H-MF

        // 106 numarali ogrencinin bilgilerini yazdirin
        System.out.println(ogrenciMap.get(106)); // null

        // Tum value'leri yazdirin
        System.out.println(ogrenciMap.values());
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM]

        // values collection'inda kac bilgi var?
        System.out.println(ogrenciMap.values().size()); // 3

        // value'ler icinde "Ali" var mi ?
        System.out.println(ogrenciMap.containsValue("Ali")); // false
        // contains value butun olarak bir value'yu arar
        // value icindeki bilgileri tek tek kontrol etmez

        System.out.println(ogrenciMap.containsValue("Ali-Can-11-H-MF")); // true

    }


}
