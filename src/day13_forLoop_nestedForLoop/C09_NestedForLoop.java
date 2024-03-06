package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C09_NestedForLoop {

    public static void main(String[] args) {

        /*
            Kullanicidan satir ve sutun sayisini alip
            asagidaki tabloyu olusturun

            * * * * * * * *
            * * * * * * * *
            * * * * * * * *
            * * * * * * * *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz...");
        int satir = scanner.nextInt();

        System.out.println("Lutfen sutun sayisini giriniz...");
        int sutun = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=sutun ; j++) {

                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
