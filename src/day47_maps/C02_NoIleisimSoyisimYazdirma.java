package day47_maps;

import java.util.HashMap;
import java.util.Map;

public class C02_NoIleisimSoyisimYazdirma extends OgrenciMapClass{

    public static void main(String[] args) {

        // kullanicinin verdigi numara ile
        // ogrencinin ismini ve soyismini yazdirin

        System.out.println(ogrenciMap); // {}
        mapeOgrenciEkle();

        System.out.println(ogrenciMap); //

        // ornek 101 numarali ogrencinin ismini ve soyismini yazdiralim

        // hazir method bize 101'in tum value'sunu verir
        System.out.println(ogrenciMap.get(101)); // Ali-Can-11-H-MF

        noIleIsimSoyisimYazdir(101);


        // 105 numarali ogrencinin isim ve soyismini yazdirin

        noIleIsimSoyisimYazdir(105);



    }
}
