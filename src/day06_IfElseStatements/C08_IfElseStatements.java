package day06_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseStatements {

    public static void main(String[] args) {
        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin,
        //        degilse “Eskenar degil” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini girin...");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();


        if (kenar1==kenar2 && kenar1==kenar3 && kenar1>0){
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar ucgen degil");
        }



    }
}
