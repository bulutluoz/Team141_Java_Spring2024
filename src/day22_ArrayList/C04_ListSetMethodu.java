package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ListSetMethodu {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,4,7,1));

        System.out.println(sayilar); // [3, 4, 7, 1]

        sayilar.add(2,9); // [3, 4, 9, 7, 1]

        // set() ==> update yani yeni deger atamasi yapar

        sayilar.set(2,5);

        System.out.println(sayilar); // [3, 4, 5, 7, 1]


    }
}
