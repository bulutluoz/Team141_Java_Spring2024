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


        System.out.println(ogrenciNestedMap); // {101={sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali}}

        mapeOgrenciEkle(102,"Veli","Cem","10","K","TM");

        mapeOgrenciEkle(103,"Ali","Cem","11","K","TM");

        System.out.println(ogrenciNestedMap);

        /*
                {   101={sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali},
                    102={sinif=10, sube=K, soyisim=Cem, bolum=TM, isim=Veli},
                    103={sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali}
                    }
         */

        // 101 numarali ogrencinin soyismini yazdirin

        // ogrenciNestedMap.get(101) // {sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali}

        System.out.println(ogrenciNestedMap.get(101).get("soyisim")); // Can

        // 103 numarali ogrencinin bolumunu yazdirin

        // ogrenciNestedMap.get(103);  // {sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali}

        System.out.println(ogrenciNestedMap.get(103).get("bolum")); // TM


        // 102 numarali ogrencinin sinifini 12 yapin

        // ogrenciNestedMap.get(102) // {sinif=10, sube=K, soyisim=Cem, bolum=TM, isim=Veli}

        ogrenciNestedMap.get(102).put("sinif","12");

        System.out.println(ogrenciNestedMap);

        //{101={sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali}, 102={sinif=12, sube=K, soyisim=Cem, bolum=TM, isim=Veli}, 103={sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali}}


        // Eger 101 numarali ogrencinin sinifi 11 ise, 12 yapin

        String eskiSinif = ogrenciNestedMap.get(101)
                                           .get("sinif");

        if (eskiSinif.equals("11")){
            // sinifi 12 yapalim
            ogrenciNestedMap.get(101)
                            .put("sinif","12");
        }



    }






    public static void mapeOgrenciEkle(Integer ogrenciNo,String isim, String soyisim, String sinif, String sube, String bolum){

        Map<String,String> ogrenciValueMap = new HashMap<>();
        ogrenciValueMap.put("isim",isim);
        ogrenciValueMap.put("soyisim",soyisim);
        ogrenciValueMap.put("sinif",sinif);
        ogrenciValueMap.put("sube",sube);
        ogrenciValueMap.put("bolum",bolum);

        ogrenciNestedMap.put(ogrenciNo,ogrenciValueMap);


    }

}
