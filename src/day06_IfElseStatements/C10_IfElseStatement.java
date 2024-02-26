package day06_IfElseStatements;

import java.util.Scanner;

public class C10_IfElseStatement {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir harf isteyin,
        //        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //        yoksa girilen karakteri girildigi gibi yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char girilenKarakter = scanner.nextLine().charAt(0);

        if ( Character.isLowerCase(girilenKarakter)){

            System.out.println(Character.toUpperCase(girilenKarakter));
        }else {

            System.out.println(girilenKarakter);
        }

    }
}
