package day02_variables_scanner;

import java.util.Scanner;

public class C04_Scanner_IlkHarfiYazdirma {

    public static void main(String[] args) {

        // Kullanicidan bir metin isteyip
        // metnin sadece ilk harfini, buyuk harf olarak yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");

        // 2 yontemle yapacagiz
        // 1 - once tum metni alip, sonra ilk harfi yazdiralim

        String metin = scanner.nextLine(); // kullanicidan metni alip kaydettik
        System.out.println(metin.toUpperCase().charAt(0));
        // kaydettigimiz metni, buyuk harfe cevirip, ilk karakteri aldik


        // 2.yontem olarak scanner'dan sadece metnin ilk harfini alip kaydedelim

        System.out.println("Lutfen bir metin daha giriniz...");

        char ilkHarf = scanner.nextLine().toUpperCase().charAt(0);

        System.out.println("Ikinci metin ilk harf : " + ilkHarf);

    }
}
