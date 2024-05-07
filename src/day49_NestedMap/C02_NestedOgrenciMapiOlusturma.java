package day49_NestedMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C02_NestedOgrenciMapiOlusturma {

    static Map< Integer , Map<String,String> > ogrenciNestedMap;

    public static void main(String[] args) {

        // 101,"Ali-Can-11-H-MF"
        // 102,"Veli-Cem-10-K-TM"
        // 103,"Ali-Cem-11-K-TM"

        /*
            101 ==> key 101 , value map  isim=Ali, soyisim=Can, sinif=11, sube=H, bolum=MF
            102 ==>     102 ,       Map<String,String>
            103 ==>     103 ,       Map
         */


        ogrenciNestedMap = new TreeMap();

        Map<String,String> ogrenci101ValueMap = new HashMap<>();
        ogrenci101ValueMap.put("isim","Ali");
        ogrenci101ValueMap.put("soyisim","Can");
        ogrenci101ValueMap.put("sinif","11");
        ogrenci101ValueMap.put("sube","H");
        ogrenci101ValueMap.put("bolum","MF");

        ogrenciNestedMap.put(101,ogrenci101ValueMap);


    }


}
