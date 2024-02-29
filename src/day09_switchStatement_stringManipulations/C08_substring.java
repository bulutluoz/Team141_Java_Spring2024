package day09_switchStatement_stringManipulations;

public class C08_substring {

    public static void main(String[] args) {

        /*
            Sadece bu method icin degil, Java'nin genelinde
            baslangic index'leri inclusive(dahil)
            bitis index'leri exclusive(haric)'dir.
         */

        String str = "Java guzeldir";

        System.out.println(str.substring(5, 8)); // guz

        // 5.index dahil basla, 8.index haric olarak aradaki karakterler

        // 5.index'den basla  (8-5) adet karakter yaz  // guz
    }
}
