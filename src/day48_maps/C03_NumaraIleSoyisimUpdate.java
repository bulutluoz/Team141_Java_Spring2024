package day48_maps;

import day47_maps.OgrenciMapClass;

public class C03_NumaraIleSoyisimUpdate extends OgrenciMapClass {

    public static void main(String[] args) {

        // verilen numarali ogrencinin soyismini verilen soyisim olarak update edin
        // ornek : 103 numarali ogrencinin soyismini Yilmaz yap

        mapeOgrenciEkle();

        System.out.println(ogrenciMap);

        numaraIleSoyisimUpdate(101,"Esen");
        numaraIleSoyisimUpdate(102,"Avluk");

        System.out.println(ogrenciMap);

    }
}
