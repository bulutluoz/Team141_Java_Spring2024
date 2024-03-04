package day11_stringManipulations;

import java.util.Scanner;

public class C05_Replace {

    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.replace('a', 'A')); // JAvA cAndir
        System.out.println(str.replace("candir", "guzeldir")); // Java guzeldir

        // a'lari yok edin
        System.out.println(str.replace("a", "")); // Jv cndir

        // b'leri B yapin

        System.out.println(str.replace('b','B')); // Java candir

        // Can yerine Han yapin

        System.out.println(str.replace("Can", "Han")); // Java candir

        // sadece ilk a'yi A yapin

        System.out.println(str.replaceFirst("a", "A")); // JAva candir

        // Kullanicidan bir metin isteyin
        // ve metinde varsa ilk rakam'i * yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String cumle = scanner.nextLine();

        System.out.println(cumle.replaceFirst("\\d", "*"));




    }
}
