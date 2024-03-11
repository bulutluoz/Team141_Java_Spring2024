package day16_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_DoWhileLoop {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir pozitif sayi isteyin,
        //         sayının tam kare olup olmadığını bulunuz,
        //         tamkare ise true değilse false yazdırınız.
        //	Ornek :  input : 16, output: 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        int karekok = 1;
        boolean tamkareMi = false;

        while ( karekok * karekok <= sayi){

            if (karekok * karekok == sayi){
                tamkareMi = true;
            }

            karekok++;
        }

        System.out.println(tamkareMi);
    }
}
