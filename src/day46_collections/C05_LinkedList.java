package day46_collections;

import java.util.LinkedList;

public class C05_LinkedList {

    public static void main(String[] args) {

        LinkedList<String> isimler = new LinkedList<>();

        // data turu olarak 3 interface'i implement eden
        // LinkedList sectigimiz icin
        // List, Queue ve Deque interface'lerinde olan tum method'lari implement etmistir


        System.out.println(isimler.hashCode()); // 1

        isimler.add("java");

        System.out.println(isimler.hashCode()); // 3254849

        isimler.add("candir");

        System.out.println(isimler.hashCode()); // -1266823012
    }
}
