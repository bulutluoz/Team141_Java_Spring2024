package day09_switchStatement_stringManipulations;

import java.util.Scanner;

public class C03_SwitchISTQB {

    public static void main(String[] args) {
        //Soru 4- Kullanicidan ISTQB kisaltmasindaki harflerden
        //        anlamini ogrenmek istedigini alin
        //        ve girilen harfin karsiligini yazdirin.
        //	      I : International
        //	      S : Software
        //	      T : Testing
        //	      Q : Qualifications
        //	      B: Board

        Scanner scanner = new Scanner(System.in);
        System.out.println("ISTQB kisaltmasindan istediginiz harfi giriniz...");
        char girilenHarf = scanner.nextLine().toUpperCase().charAt(0);

        switch (girilenHarf){

            case 'I' :
                System.out.println("International");
                break;
            case 'S' :
                System.out.println("Software");
                break;
            case 'T' :
                System.out.println("Testing");
                break;
            case 'Q' :
                System.out.println("Qualifications");
                break;
            case 'B' :
                System.out.println("Board");
                break;
            default:
                System.out.println("Lutfen kisaltmadaki harflerden birini giriniz...");
        }

    }
}
