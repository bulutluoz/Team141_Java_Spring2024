package day43_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_FarkliTryCatchlerIleCozum {

    public static void main(String[] args) {
        /*
            Ayri ayri try catch kullandigimizda
            birinci try-catch'de exception yakalandiginda
            ikinci bundan haberdar olmuyor

            bunun cozumu icin ekstra flag kullanilabilir
         */

        String str = "Java gun gectikce guzellesir ";

        // Kullanicidan pozitif bir tamsayi alin
        // ve bu tamsayiyi index olarak kabul edip
        // str'da o index'deki harfi yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz...");

        int index = 100; // InputMissmatchException

        try {

            index = scanner.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("Pozitif tamsayi girmelisiniz...");
        }

        try {
            System.out.println(str.charAt(index)); // StringIndexOutOfBoundsException

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("girdiginiz index sinirlarin disinda");
        }
    }
}
