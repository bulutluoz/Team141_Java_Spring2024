package day43_exceptions;

import java.util.Scanner;

public class C02_MultipleExceptions {

    public static void main(String[] args) {

        /*
            Bu kod'da 2 tane risk var
            1- InputMissmatchException olusabilir
            2- StringIndexOutOfBoundsException olusabilir

            4 farkli yol ile bunu cozebiliriz
            1- eger risk olusturan kodlar ayri ayri ise
               ayri ayri try catch yapabiliriz

            2- ic-ice try catch olusturabiliriz

            3- bir try, 2 catch olusturabiliriz

            4- iki exception'i da kapsayan
               daha kapsamli bir exception ile
               ikisinin yerine tek bir exception ile cozeriz
         */

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
