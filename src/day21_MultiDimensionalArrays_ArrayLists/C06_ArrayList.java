package day21_MultiDimensionalArrays_ArrayLists;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class C06_ArrayList {

    public static void main(String[] args) {

        // Kullanicidan girmek istedigi kadar isim alip
        // girilen isimleri kaydedin
        // Kullanici bitirmek icin q'ya basmalidir

        List<String> isimler = new ArrayList<>();
        ArrayList<String> deneme = new ArrayList<>();
        ArrayList<String> deneme1 = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        String isim = "";
        while (! isim.equalsIgnoreCase("q")){

            System.out.println("Listeye eklemek icin isim giriniz... \nbitirmek icin q'ya basiniz");
            isim = scanner.nextLine();

            if (!isim.equalsIgnoreCase("q")){
                isimler.add(isim);
            }

        }
        System.out.println("Girilen isimler : " + isimler);
    }
}
