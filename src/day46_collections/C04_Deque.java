package day46_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

    public static void main(String[] args) {

        // Deque : double ended queue demektir
        // yani bastan ve sondan calisabilir
        // deque queue'nun child'i oldugundan
        // deque'i implement eden bir class,
        // deque'in parent'i olan queue'daki tum method'lari da imp[lement etmek zorundadir

        Deque<Integer> sayilar = new LinkedList();

        sayilar.add(20);
        sayilar.add(23);
        sayilar.add(34);

        System.out.println(sayilar); // [20, 23, 34]

        sayilar.addFirst(10);
        sayilar.addLast(40);

        System.out.println(sayilar); // [10, 20, 23, 34, 40]

        sayilar.remove(); // en bastakini siler (queue'dan)
        System.out.println(sayilar); // [20, 23, 34, 40]

        sayilar.removeFirst(); // en bastakini siler (deque'den)
        System.out.println(sayilar); // [23, 34, 40]

        sayilar.removeFirstOccurrence(34);
        // ilk sayiyi degil, ilk buldugu 34'u siler

        System.out.println(sayilar); // [23, 40]

        System.out.println(sayilar.getLast()); // 40
        System.out.println(sayilar.getFirst()); // 23


        System.out.println(sayilar.pop()); // 23
        //  removes and returns the first element of this deque.
        // ilk elementi siler ve bize getirir
        // deque bos ise exception firlatir

        System.out.println(sayilar); // [40]

        sayilar.push(25);
        // eger kapasite sinirlamasi yoksa ve verilen obje deque'e uygunsa,
        // verilen elementi deque'e ekler

        System.out.println(sayilar); // [25, 40]


    }
}
