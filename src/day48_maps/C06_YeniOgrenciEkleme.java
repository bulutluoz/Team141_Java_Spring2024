package day48_maps;

import day47_maps.OgrenciMapClass;

public class C06_YeniOgrenciEkleme extends OgrenciMapClass {


    public static void main(String[] args) {
        // scanner ile sorarak map'e yeni bir ogrenci ekleyin
        mapeOgrenciEkle();

        System.out.println(ogrenciMap);

        ogrenciEkle(102); // Verilen numara zaten kayitli

        ogrenciEkle(120);

        System.out.println(ogrenciMap);

    }
}
