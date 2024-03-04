package day10_StringManipulations;

import java.util.Scanner;

public class C06_indexOf {

    public static void main(String[] args) {

        String str = "Ali topu at, at Ali at";

        // indexOf() parametre olarak hem String hem de char kabul eder
        System.out.println(str.indexOf("t")); // 4
        System.out.println(str.indexOf('t')); // 4

        System.out.println(str.indexOf("Ali")); // 0

        System.out.println(str.indexOf("pu at")); // 6

        System.out.println(str.indexOf(' ')); // 3

        System.out.println(str.indexOf("t", 7)); // 10
        // 7.index ve sonrasindaki ilk t'nin index'ini verir
        // "u at, at Ali at"


        // kullanicidan bir metin isteyip
        // girilen metindeki 2.anin index'ini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        // Java ile ders su gibi akiyor... :)

        int ilkIndex = metin.indexOf("a"); // 1
        System.out.println(metin.indexOf( "a" , ilkIndex+1     )); // 3

    }
}
