package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C03_IfElseIfStatements {

    public static void main(String[] args) {

        /*
            Bize verilen gorevdeki siralama farkli olsa da
            if, else-if ... cumlelerinin bir elek gibi calistigini unutmamaliyiz

            en cok kisitlama olani en basa yazmaliyiz
         */

        // Kullanicidan bir tamsayi isteyin
        // sayi 7 ile bolunuyorsa "7'nin kati",
        // sayi 5 ile bolunuyorsa "5'in kati"
        // her ikisine de bolunuyorsa "Super sayi"
        // ikisine de bolunemiyorsa "Kotu sayi" yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scan.nextInt();


        if (sayi % 7 == 0 && sayi % 5 == 0){
            System.out.println("Super sayi");
        } else if ( sayi % 5 == 0) {
            System.out.println("5'in kati");
        } else if (sayi%7 == 0  ) {
            System.out.println("7'nin kati");
        }else {
            System.out.println("Kotu sayi");
        }
    }
}
