package day24_ArrayList_ForEachLoop;

public class C03_ArraydekiSayilariToplama {

    public static void main(String[] args) {

        // verine int bir arraydeki
        // tum tek sayilari toplayip, yazdirin

        int[] sayilar = {3,5,6,7,3,1,2,6,5,4};


        int toplam = 0 ;

        for (int i = 0; i < sayilar.length ; i++) {

            if (sayilar[i]  % 2 != 0 ){
                toplam += sayilar[i];
            }
        }

        System.out.println(toplam); // 24


        toplam = 0;

        for (int each : sayilar) { // bana sayilar array'indeki herbir(each) int'i getir

           if (each % 2 != 0 ){
               toplam += each;
           }
        }

        System.out.println(toplam); // 24

    }
}
