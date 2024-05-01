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


    }


}
