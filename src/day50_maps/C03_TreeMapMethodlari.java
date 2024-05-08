package day50_maps;

import java.util.Map;
import java.util.TreeMap;

public class C03_TreeMapMethodlari {

    public static void main(String[] args) {

        TreeMap<String,Integer> harfler = new TreeMap<>();

        harfler.put("S",40);
        harfler.put("H",20);
        harfler.put("K",50);
        harfler.put("M",10);
        harfler.put("A",10);
        harfler.put("T",40);

        System.out.println(harfler); // {A=10, H=20, K=50, M=10, S=40, T=40}

        // TreeMap elemanlari sirali tuttugu icin, siralamaya uygun olarak
        // - herhangi iki element arasindakiler
        // - bir element'den sonrakiler
        // - bir element'den oncekiler ... gibi ozellikleri barindirir

        // K'dan bir sonraki sonraki key'i yazdirin
        System.out.println(harfler.higherKey("K")); // M
        // B'den bir sonraki sonraki key'i yazdirin
        System.out.println(harfler.higherKey("B")); // H
        // Returns the least key strictly greater than the given key, or null if there is no such key.

        // Returns the least key greater than or equal to the given key, or null if there is no such key.
        // Verilen key'den buyuk esit olan keyl'lerden en kucugunu verir
        System.out.println(harfler.ceilingKey("K")); // K
        System.out.println(harfler.ceilingKey("B")); // H

        // K'dan buyuk esit butun key'leri ve value'leri istersek
        System.out.println(harfler.tailMap("K")); // {K=50, M=10, S=40, T=40}
        System.out.println(harfler.tailMap("B")); // {H=20, K=50, M=10, S=40, T=40}

        // yazdigimiz key baslangic oldugundan inclusive(dahil) dir
        // haric olmasini isterseniz ozellikle belirtmemiz gerekir

        System.out.println(harfler.tailMap("K",false)); // {M=10, S=40, T=40}
        System.out.println(harfler.tailMap("B",false)); // {H=20, K=50, M=10, S=40, T=40}

        System.out.println(harfler); // {A=10, H=20, K=50, M=10, S=40, T=40}
        // verilen element'den basa dogru olanlar icin

        System.out.println(harfler.lowerKey("K")); // H
        System.out.println(harfler.lowerKey("B")); // A
        System.out.println(harfler.lowerKey("A")); // null
        // Returns the greatest key strictly less than the given key, or null if there is no such key.
        // Verilen key'den kucuk olan key'ler icindeki en buyuk olani verir

        // kucuk esittir
        System.out.println(harfler.floorKey("K")); // K
        System.out.println(harfler.floorKey("B")); // A

        // verilen key'den basa dogru tum map'i yazdirin

        System.out.println(harfler.headMap("K")); // {A=10, H=20}
        System.out.println(harfler.headMap("B")); // {A=10}

        System.out.println(harfler.headMap("K",true)); // {A=10, H=20, K=50}
        System.out.println(harfler.headMap("B",true)); // {A=10}


        // Verilen iki key arasini yazdirin
        System.out.println(harfler.subMap("C", "T")); // {H=20, K=50, M=10, S=40}
        System.out.println(harfler.subMap("H", "V")); // {H=20, K=50, M=10, S=40, T=40}

        // {A=10, H=20, K=50, M=10, S=40, T=40}
        System.out.println(harfler.subMap("H",false, "T",true));
        //  {K=50, M=10, S=40, T=40}

        System.out.println(harfler.subMap("H",false, "T",false));
        // {K=50, M=10, S=40}

        System.out.println(harfler.descendingMap()); // {T=40, S=40, M=10, K=50, H=20, A=10}

        // harfler =  harfler.descendingMap();
        // harfler TreeMap oldugundan dogal sirali OLMAK ZORUNDADIR

    }
}
