package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C04_IfElseIfStatements {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan mesafeyi kilometre olarak alin
        //        ve cevirmek istedigi birimi sorun,
        //        istedigi birim metre veya santimetre ise cevirip yazdirin,
        //        yoksa “istediginiz birim sisteme kayitli degil” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Km olarak mesafeyi giriniz...");
        double mesafe = scanner.nextDouble();

        scanner = new Scanner(System.in);
        System.out.println("mesafeyi cevirmek istediginiz birimi giriniz...");
        String cevrilecekBirim = scanner.nextLine();

        if (cevrilecekBirim.equalsIgnoreCase("metre")){
            System.out.println("Girilen mesafe metre olarak : " + mesafe*1000 + " metredir");
        } else if (cevrilecekBirim.equalsIgnoreCase("santimetre")) {
            System.out.println("Girilen mesafe santimetre olarak : " + mesafe*100000 + " santimetredir");
        }else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }
    }
}
