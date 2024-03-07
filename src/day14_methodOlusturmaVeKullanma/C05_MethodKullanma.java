package day14_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C05_MethodKullanma {

    public static void main(String[] args) {

        // Kullanicidan bir metin alin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        // kullanicinin girdigi metni tersten yazdirin

        C03_MethodOlusturma.terstenYazdir(metin);

        // kullanicinin girdigi metnin palindrome olup olmadigini true/false seklinde yazdirin

        System.out.println(C04_Palindrome.isPalindrome(metin));

        // eger girilen metin palindrome ise "Aferin sana"
        // palindrome degilse "Bu nasil metin, daha guzel bir metin girmelisin " yazdirin

        boolean sonuc = C04_Palindrome.isPalindrome(metin);
        // palindrome olup olmadigini true veya false donen method sayesinde kaydettik

        if (sonuc){ // sonuc == true
            System.out.println("Aferin sana");
        }else {
            System.out.println("Bu nasil metin, daha guzel bir metin girmelisin ");
        }

    }
}
