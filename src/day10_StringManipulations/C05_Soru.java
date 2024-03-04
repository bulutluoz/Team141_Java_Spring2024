package day10_StringManipulations;

import java.util.Scanner;

public class C05_Soru {

    public static void main(String[] args) {
        //SORU : kullanicidan bir mail alin
        //        - mail @ icermiyorsa "gecersiz mail"
        //        - mail @gmail.com icermiyorsa, "mail gmail olmali"
        //        - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        //        yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mailinizi giriniz...");
        String mail = scanner.nextLine();

        // bagimsiz if else kullanirsak tum hatalari yazdirir
        // if-else kullanirsak ilk hatayi yazdirir, kalan calismaz

        // gorevde net olarak tercih belirtilmediginden
        // biz if-else tercih ettik

        if (!mail.contains("@")){
            System.out.println("gecersiz mail");
        } else if ( !mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        }

        // sanane@gmail.comm   contains true, endsWith false


    }
}
