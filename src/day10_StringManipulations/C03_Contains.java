package day10_StringManipulations;

import java.util.Scanner;

public class C03_Contains {

    public static void main(String[] args) {

        // Kullanicidan bir metin isteyin
        // metin "ev" iceriyorsa "Home sweet home",
        // "is" iceriyorsa "calismak cok guzel"
        // ikisini de iceriyorsa "hayatta denge cok guzeldir",
        // ikisini de icermiyorsa "tembellik guzel degil" yazdiralim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scan.nextLine();


        if (metin.contains("ev") && metin.contains("is")){
            System.out.println("hayatta denge cok guzeldir");
        } else if (metin.contains("ev")) {
            System.out.println("Home sweet home");
        } else if (metin.contains("is")) {
            System.out.println("calismak cok guzel");
        }else {
            System.out.println("tembellik guzel degil");
        }


    }
}
