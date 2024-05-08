package day50_maps;

import java.util.Map;
import java.util.TreeMap;

public class C02_KullanimMiktarlariniBulma {

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

        for (int eachSayi: input
             ) {
            sayilarVeKullanimlari.computeIfPresent(eachSayi , (k,v) -> v+1 ); // sayi map'de varsa
            sayilarVeKullanimlari.computeIfAbsent(eachSayi, v -> 1 ); // sayi map'de yoksa
        }

        System.out.println(sayilarVeKullanimlari); // {1=3, 2=3, 3=3, 4=3, 5=2}



    }
}
