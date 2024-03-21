package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayiListeCevirme {

    public static void main(String[] args) {

        Integer[] sayilar = {3,5,2,6,7,3,4,5};

        // Bu array'i list'e cevirin

        // 1- Bir loop ile array'deki tum elementleri list'e ekleyebiliriz
        //    Bir array'i listeye cevirmek icin bu yontem daha saglikli calisir

        List<Integer> sayiList1 = new ArrayList<>();

        for (int i = 0; i < sayilar.length ; i++) {

            sayiList1.add(sayilar[i]);
        }

        System.out.println(sayiList1); // [3, 5, 2, 6, 7, 3, 4, 5]

        sayiList1.add(9);

        sayiList1.remove(0);

        System.out.println(sayiList1); // [5, 2, 6, 7, 3, 4, 5, 9]


        // 2- AsList()
        /*
            Varolan bir array'i tek bir satirla asList() kullanarak
            listeye cevirebiliriz

            ANCAK bu cevirme islemi ile olusturulan listede 2 major yan etki olur

            - asList() ile donusturulen listeye
              array'de oldugu gibi ekleme veya silme yapamazsiniz

            - asList() ile donusturulen liste ve kaynak olarak kullanilan array
              etkilesime devam eder
              array'de yaptigimiz degisiklikler, listeye de yansir
              ayni sekilde listede yaptigimiz degisiklikler array'e de islenir
         */

        List<Integer> sayiList2 = Arrays.asList(sayilar);

        System.out.println("asList ile donusturulen liste : "+ sayiList2);
        // asList ile donusturulen liste : [3, 5, 2, 6, 7, 3, 4, 5]

        // sayiList2.add(9); // UnsupportedOperationException
        // sayiList2.remove(0); // UnsupportedOperationException


        sayilar[0] = 23;
        sayilar[1] = 15;

        System.out.println("Array'e yapilan atamadan sonra array : " + Arrays.toString(sayilar));
        // Array'e yapilan atamadan sonra array : [23, 15, 2, 6, 7, 3, 4, 5]


        System.out.println("Array'e yapilan atamadan sonra liste : " + sayiList2);
        // Array'e yapilan atamadan sonra liste : [23, 15, 2, 6, 7, 3, 4, 5]

    }
}
