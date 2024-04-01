package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_OrtakElemanlar {

    public static void main(String[] args) {
        //Soru 5- Verilen iki array’in elementlerini karsilastirip,
        //        ikisinde ortak olan elementleri
        //        ayri bir liste olarak veren bir program yazin.

        int[] array1 = {3,6,8,1,0,3,8,1,1};
        int[] array2 = {3,6,7,5,6,5,6,5,1};

        List<Integer> ortakElemanlarListesi = new ArrayList<>();

        // bir array'deki tum elemanlari,
        // diger array'deki tum elemanlarla karsilastirmak icin
        // nested loop kullanmak zorundayiz

        for(int each1 : array1){

            for(int each2 : array2){

                if (each1 == each2 && !ortakElemanlarListesi.contains(each1)){
                    ortakElemanlarListesi.add(each1);
                }

            }

        }

        System.out.println("ortak elemanlar listesi : " + ortakElemanlarListesi);

        // ikisinde ortak olmayan elementleri tekrar etmeden
        // ayri bir liste olarak veren bir program yazin.
        //output : [7,8,0,5]

        // ortak olmayan elemanlar icin bir list olusturalim
        List<Integer> ortakOlmayanElemanlar = new ArrayList<>();

        // array1'deki elemanlari gozden gecirip
        // ortak elemanlarda olmayan elemanlari yeni listeye ekleyelim
        // ama ayni sayiyi tekrar eklememek icin listede olmadigini kontrol edelim

        for (int each:array1
             ) {
            System.out.println(each);
            if ( !ortakElemanlarListesi.contains(each) && !ortakOlmayanElemanlar.contains(each)){
                ortakOlmayanElemanlar.add(each);
            }
        }

        // ayni sekilde array2 deki elemanlari da yapalim
        for (int each:array2
        ) {
            if ( !ortakElemanlarListesi.contains(each) && !ortakOlmayanElemanlar.contains(each)){
                ortakOlmayanElemanlar.add(each);
            }
        }

        System.out.println("Ortak olmayan elamanlar : " + ortakOlmayanElemanlar);
    }
}
