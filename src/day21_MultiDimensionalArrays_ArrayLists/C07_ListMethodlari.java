package day21_MultiDimensionalArrays_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_ListMethodlari {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(); // Type argument cannot be of primitive type
        sayilar.add(10);
        sayilar.add(7);
        sayilar.add(9);

        List<Integer> list = new ArrayList<>(Arrays.asList(3,6,8,1,3,5,6));

        System.out.println(list); // [3, 6, 8, 1, 3, 5, 6]

        // list'deki eleman sayisini yazdirin

        System.out.println(list.size()); // 7

        // listede eleman olarak 7 var mi ?

        System.out.println(list.contains(7)); // false




    }
}
