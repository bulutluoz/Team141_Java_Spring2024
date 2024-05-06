package day48_maps;

import day47_maps.OgrenciMapClass;

public class C02_BolumdekiOgrencilerListesiYazdir extends OgrenciMapClass {

    public static void main(String[] args) {
        //        2- verilen bolumdeki tum ogrencilerin
        //           isim soyisim sinif ve subelerini yazdirin

        mapeOgrenciEkle();
        bolumdekiOgrencilerinListesiniYazdir("mf");
        //Ali Can 11H
        //Ayse Can 10H
        //Sevgi Can 10K

        bolumdekiOgrencilerinListesiniYazdir("TM");
        //Veli Cem 10K
        //Ali Cem 11K
        //Sevgi Cem 11M

        bolumdekiOgrencilerinListesiniYazdir("Yazilimci");
        // Girdiginiz bolum hatali

    }
}
