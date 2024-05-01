package day47_maps;

import java.util.HashMap;
import java.util.Map;

public class OgrenciMapClass {

    protected static Map<Integer, String> ogrenciMap = new HashMap<>();


    public static void mapeOgrenciEkle(){
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
    }

    public static void noIleIsimSoyisimYazdir(int ogrenciNo){ // 101

        // verilen ogrenci numarasina ait value'yu String olarak kaydedelim

        String istenenOgrenciValue = ogrenciMap.get(ogrenciNo); // "Ali-Can-11-H-MF"

        // bu string'deki bilgilere tek tek ulasabilmek icin
        // value'u - ile split edelim

        String[] ogrenciValueArr = istenenOgrenciValue.split("-"); // [Ali, Can, 11, H, MF]

        // ogrenci value array'inde index ile istedigimiz tum bilgilere ulasabiliriz

        System.out.println(ogrenciNo + " nolu ogrenci isim ve soyismi : " +
                            ogrenciValueArr[0] + " " + ogrenciValueArr[1]);

    }

    public static void noIleSinifVeSubeYazdir(int ogrenciNo){
        // verilen ogrenci numarasina ait value'yu String olarak kaydedelim

        String istenenOgrenciValue = ogrenciMap.get(ogrenciNo); // "Ali-Can-11-H-MF"

        // bu string'deki bilgilere tek tek ulasabilmek icin
        // value'u - ile split edelim

        String[] ogrenciValueArr = istenenOgrenciValue.split("-"); // [Ali, Can, 11, H, MF]

        // ogrenci value array'inde index ile istedigimiz tum bilgilere ulasabiliriz

        System.out.println(ogrenciNo + " nolu ogrenci sinif ve subesi : " +
                ogrenciValueArr[2] + "/" + ogrenciValueArr[3]);

    }
}
