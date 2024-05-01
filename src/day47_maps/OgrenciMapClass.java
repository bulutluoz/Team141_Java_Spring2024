package day47_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    public static void noIleIsimSoyisimYazdir(int ogrenciNo){
        // 101

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

    public static void sinifVeSubeIleListeOlusturma(Integer sinif , String sube){
        // 10  H

        // Tum ogrencilerin value'lerini gozden gecirmemiz
        // ve sinif ve subesi istenen degerde olan ogrencilerin
        // istenen bilgilerini yazdirmamiz gerekiyor

        // 1- Tum ogrencilerin numaralari icin
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet(); // [101, 102, 103, 104, 105, 106, 107]

        // 2- her bir ogrenci key'i icin value'lere ulasmak ve
        //    istenen islemleri yapmak icin for-each loop kullanalim (Set index desteklemez)

        for (Integer eachKey : ogrenciKeySeti
             ) {
            // 3- eachKey tek tek tum key'leri getirecek.    103
            //    eachKey'in getirdigi key'e ait value'yu kaydedelim

            String istenenOgrenciValue = ogrenciMap.get(eachKey); // Ali-Cem-11-K-TM

            // 4- ogrenci value'sunu - ile split yapip kaydedelim
            String[] ogrenciValueArr = istenenOgrenciValue.split("-"); // [Ali, Cem, 11, K, TM]

            // 5- array'den gorevde istenen sinif ve subeye esit olup olmadigini kontrol edebiliriz

            if (ogrenciValueArr[2].equals(sinif+"")  && ogrenciValueArr[3].equalsIgnoreCase(sube)){
                System.out.println(eachKey + " " + ogrenciValueArr[0] + " " + ogrenciValueArr[1]);
            }


        }




    }

    public static void isimVeSoyisimIleOgrenciBulma(String isim, String soyisim){
        // 1- Tum ogrencilerin numaralari icin
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet(); // [101, 102, 103, 104, 105, 106, 107]


        // 2- her bir ogrenci key'i icin value'lere ulasmak ve
        //    istenen islemleri yapmak icin for-each loop kullanalim (Set index desteklemez)

        for (Integer eachKey : ogrenciKeySeti
        ) {

            // 3- eachKey tek tek tum key'leri getirecek.    103
            //    eachKey'in getirdigi key'e ait value'yu kaydedelim

            String istenenOgrenciValue = ogrenciMap.get(eachKey); // Ali-Cem-11-K-TM


            // 4- ogrenci value'sunu - ile split yapip kaydedelim
            String[] ogrenciValueArr = istenenOgrenciValue.split("-"); // [Ali, Cem, 11, K, TM]

            // 5- array'den gorevde istenen isim ve soyisme esit olup olmadigini kontrol edebiliriz

            if (ogrenciValueArr[0].equalsIgnoreCase(isim) && ogrenciValueArr[1].equalsIgnoreCase(soyisim)){
                System.out.println(eachKey + " " + ogrenciValueArr[2] + " " + ogrenciValueArr[3]);
            }

        }


    }
}
