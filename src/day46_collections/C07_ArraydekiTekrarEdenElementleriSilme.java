package day46_collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C07_ArraydekiTekrarEdenElementleriSilme {

    public static void main(String[] args) {

        // verilen int bir arraydeki
        // tekrar eden sayilari silip
        // arraydeki her bir element unique olacak sekilde array'i kaydedin

        int[] arr = {3,6,5,1,2,5,7,9,3,4,5,2,3,6};
        // output arr = [3, 6, 5, 1, 2, 7, 4]


        Set<Integer> benzersizSayilarSeti = new TreeSet<>();

        // arr'deki tum sayilari benzersizsayilarSeti'ne eklersek

        for (int eachSayi : arr
             ) {
            benzersizSayilarSeti.add(eachSayi);
        }

        System.out.println("Benzersiz sayilar seti : " + benzersizSayilarSeti);
        // [1, 2, 3, 4, 5, 6, 7, 9]
        System.out.println("arr : " + Arrays.toString(arr));
        // [3, 6, 5, 1, 2, 5, 7, 9, 3, 4, 5, 2, 3, 6]

        // simdi arr'yi set'deki sayilardan olusan hale donusturmeliyiz

        arr = new int[benzersizSayilarSeti.size()]; // [0, 0, 0, 0, 0, 0, 0, 0]


        int index = 0;

        for (int eachSayi : benzersizSayilarSeti
             ) {
            arr[index] = eachSayi;
            index++;
        }

        System.out.println("arr'in son hali : " + Arrays.toString(arr));
        // arr'in son hali : [1, 2, 3, 4, 5, 6, 7, 9]

    }
}
