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


        // bastan baslayip , sondan 4 karakter haric yazdirin

        System.out.println(str.substring(0, str.length()-4)); // Java guze

        // Bitis index'i baslangic index'inden kucuk olursa
        // System.out.println( str.substring(6,4)); // StringIndexOutOfBoundsException


        // baslangic ve bitis index'i ayni olursa

        System.out.println(str.substring(5, 5)); // hiclik yazdirir


        // Eger baslangic ve bitis indexleri arasinda 1 fark olursa
        // baslangic index'indeki karakteri verir
        // yani charAt() ile ayni islevi yapar

        System.out.println(str.substring(0, 1)); // J   intelliJ sari yapip Replace 'str.substring(0, 1)' with 'str.charAt(0)'
        System.out.println(str.substring(3,4)); // a

        // aralarindaki fark, charAt() bize char dondurdugunden,
        // sonrasinda String method'lari kullanamayiz ama
        // substring() ile tum String method'lari kullanilabilir

        // str.charAt(3).toUpperCase();
        str.substring(3,4).toUpperCase();




    }
}
