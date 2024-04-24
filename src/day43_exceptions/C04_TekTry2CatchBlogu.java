package day43_exceptions;

import java.util.Scanner;

public class C04_TekTry2CatchBlogu {

    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesir ";

        // Kullanicidan pozitif bir tamsayi alin
        // ve bu tamsayiyi index olarak kabul edip
        // str'da o index'deki harfi yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz...");

        int index = scanner.nextInt(); // InputMissmatchException

        System.out.println(str.charAt(index)); // StringIndexOutOfBoundsException
    }
}
