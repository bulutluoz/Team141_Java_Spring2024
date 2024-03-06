package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C06_AsalSayiKontrol {

    public static void main(String[] args) {

        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip,
        //         sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        int flag = 20;

        for (int i = 2; i < sayi ; i++) {

            if (sayi % i == 0){
                System.out.println( "Verilen sayi "+ i+"'ye bolunuyor,sayi asal degil");
                flag = 10;
                break;
                // break komutu loop'u derhal bitirir
            }
        }

        if (flag == 20){
            System.out.println("Sayi asal");
        }

    }
}
