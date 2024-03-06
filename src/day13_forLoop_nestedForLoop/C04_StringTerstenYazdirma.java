package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C04_StringTerstenYazdirma {
    public static void main(String[] args) {

        // Soru 9 (interview)- Kullanicidan bir String isteyin
        //        ve String’i tersten yazdirin.
        //       Orn :  input : Java Candir   Output : ridnaC avaJ

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        for (int i = metin.length()-1 ; i>=0 ; i--) {

            System.out.print(metin.charAt(i));
        }


    }
}
