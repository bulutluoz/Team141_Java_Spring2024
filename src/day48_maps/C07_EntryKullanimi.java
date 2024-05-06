package day48_maps;

import day47_maps.OgrenciMapClass;

import java.util.Map;
import java.util.Set;
import java.util.jar.JarOutputStream;

public class C07_EntryKullanimi extends OgrenciMapClass {

    public static void main(String[] args) {

        mapeOgrenciEkle();

        System.out.println(ogrenciMap);

        /*
            {
            101=Ali-Can-11-H-MF,
            102=Veli-Cem-10-K-TM,
            103=Ali-Cem-11-K-TM,
            104=Ayse-Can-10-H-MF,
            105=Sevgi-Cem-11-M-TM,
            106=Sevgi-Can-10-K-MF,
            107=Esra-Han-11-M-SOZ
            }
         */

        // 103 numarali ogrencinin key ve value'sunu birlikte yazdirin

        Integer ogrenciNo = 103;
        System.out.println(ogrenciNo +" "+ ogrenciMap.get(ogrenciNo));

        // tum ogrencilerin key ve value'lerini alt alta bir liste olarak yazdirin

        System.out.println("Tum Ogrenci Listesi...");
        // tum ogrencilere ulasmamiz gerektigi icin
        // key'leri bir set olarak kaydedelim
        Set<Integer> keySeti = ogrenciMap.keySet();

        // bir loop ile her bir key'i ele alip, key ve value'yu yazdiralim

        for (Integer eachKey : keySeti
             ) {

            System.out.println(eachKey +" "+ ogrenciMap.get(eachKey));
        }

        // Su ana kadar ogrendigimiz method'larda
        // map icindeki key ve value'ler birbirinden bagimsiz
        // bir ogrencinin key ve value'sunu tek bir deger olarak alamiyoruz

        // Java key ve value'yu birlikte kullanan Entry Class'i olusturmustur

        // 1. avantaj : key ve value birlikte ele alabiliyoruz

        Set<Map.Entry<Integer,String>>  ogrenciEntrySeti = ogrenciMap.entrySet();
        System.out.println("Entry seti ile ogrenci listesi");
        for ( Map.Entry<Integer,String> eachEntry : ogrenciEntrySeti
             ) {
            System.out.println(eachEntry);
        }


        System.out.println( "Entry seti :  " + ogrenciEntrySeti);

        System.out.println("ogrenci map : " + ogrenciMap);

       // 2.avantaj entry'de yapilan update'ler
       //   otomatik olarak map'e de islenir

       // Tum ogrencilerin isimlerini BUYUK HARF'e donusturun

        // 1- tum ogrenci bilgilerini entrySet olarak kaydedelim
        //    57.satirda kaydettik


        // 2- entrySet bir Set oldugu icin, for each loop ile
        //    key ve value'lerden olusan entry'leri tek tek ele alalim

        for (Map.Entry<Integer,String > eachEntry : ogrenciEntrySeti
             ) {
            // bu loop tek tek tum entry'leri bize getirir
            // 103=Ali-Cem-11-K-TM

            // 1- eski value'yu kaydedelim
            String eskiValue = eachEntry.getValue(); // "Ali-Cem-11-K-TM"

            // 2- bilgilere ulasabilmek icin split yapalim

            String[] valueArr = eskiValue.split("-"); // [Ali, Cem, 11, K, TM]

            // 3-  ismi buyuk harfe update edelim

            valueArr[0] = valueArr[0].toUpperCase();

            // 4- update array'de yapildi,
            eachEntry.setValue(String.join("-",valueArr));
        }

        System.out.println(ogrenciMap);
    }
}
