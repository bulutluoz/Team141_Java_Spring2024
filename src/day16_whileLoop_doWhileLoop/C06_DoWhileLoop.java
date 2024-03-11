package day16_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan baslangic ve bitis harflerini alip,
        //         o harfleri ve aralarindaki harfleri yazdirin.
        //         kullanici bir harf harf degil
        //         bir metin girerse uyari verip, yeniden harf girmesini isteyin
        //         kullanici harf girinceye kadar tekrar isteyin

        Scanner scanner = new Scanner(System.in);

        String baslangicStr;
        char baslangic='a';

        do{
            System.out.println("Lutfen baslangic harfini giriniz...");
            baslangicStr = scanner.nextLine();

            if (baslangicStr.length() == 1){

                baslangic = baslangicStr.charAt(0);

            }else{
                System.out.println("Sadece 1 harf girmelisiniz..");
            }

        }while(baslangicStr.length() != 1);



        System.out.println("Lutfen bitis harfini giriniz...");
        char bitis = scanner.next().charAt(0);


        do{
            System.out.print(baslangic + " ");
            baslangic++;
        }while (baslangic <= bitis);


    }
}
