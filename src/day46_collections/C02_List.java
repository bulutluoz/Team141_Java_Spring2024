package day46_collections;

import java.util.LinkedList;
import java.util.List;

public class C02_List {

    public static void main(String[] args) {


        List<Integer> sayilar = new LinkedList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(8);

        System.out.println(sayilar); // [3, 5, 8]

        // 5 ile 8'in arasina 1 ekleyelim

        sayilar.add(2,1);

        System.out.println(sayilar); // [3, 5, 1, 8]

        List<Integer> sayilar2 = new LinkedList<>();

        sayilar2.add(3);
        sayilar2.add(4);
        sayilar2.add(7);

        System.out.println(sayilar2); // [3, 4, 7]

        sayilar.retainAll(sayilar2);

        System.out.println(sayilar); // [3]
        System.out.println(sayilar2); // [3, 4, 7]


        // sayilar2.remove(3); // IndexOutOfBoundsException

        System.out.println(sayilar2.equals(sayilar)); // false

    }
}
