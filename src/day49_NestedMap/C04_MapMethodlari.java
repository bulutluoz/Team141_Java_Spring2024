package day49_NestedMap;

import java.util.Map;
import java.util.TreeMap;

public class C04_MapMethodlari {

    public static void main(String[] args) {

        //Soru : Verilen bir array’de kullanilan sayilari ve kacar defa kullanildigini yazdirin.
        //
        int[] input = {1,2,3,4,5,3,4,2,5,1,3,2,4,1} ;
        //output :  1 kullanimi : 3 adet
        //	        2 kullanimi : 3 adet
        //	        3 kullanimi : 3 adet
        //	        4 kullanimi : 3 adet
        //	        5 kullanimi : 2 adet


       // bir map olusturalim
       Map<Integer,Integer> sayilarVeKullanimlari = new TreeMap();
       // array'deki her bir sayiyi ele alip
       // map'de varsa eski kullanim adedini 1 artirip kaydedelim
       // map'de yoksa kullanim adedi 1 olarak map'e ekleyelim

        for (Integer eachSayi : input
             ) {

            if (sayilarVeKullanimlari.containsKey(eachSayi)){ // sayi map'de var
                int eskiDeger = sayilarVeKullanimlari.get(eachSayi);
                sayilarVeKullanimlari.put(eachSayi,eskiDeger+1);

            }else { // sayi map'de yok
                sayilarVeKullanimlari.put(eachSayi,1);
            }

        }

        System.out.println(sayilarVeKullanimlari);



    }
}
