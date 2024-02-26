package day06_IfElseStatements;

import java.util.Scanner;

public class C06_IfStatements {

    public static void main(String[] args) {

        // Kullanicidan bir harf alin
        // girilen harf kucuk harf ise "Kucuk"
        // buyuk harf ise "buyuk" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz...");
        char harf = scanner.nextLine().charAt(0);

        if (harf >= 'a' && harf <= 'z'){
            System.out.println("Kucuk");
        }

        if (harf>='A' && harf<='Z'){
            System.out.println("Buyuk");
        }

    }
}
