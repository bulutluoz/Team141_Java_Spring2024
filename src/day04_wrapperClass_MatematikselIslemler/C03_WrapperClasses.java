package day04_wrapperClass_MatematikselIslemler;

public class C03_WrapperClasses {

    public static void main(String[] args) {

        int sayi = 20;

        String str = "Java Candir";

        // primitive data turleri sadece deger barindirir,
        // non primitive data turleri ise hem deger, hem de hazir method'lar barindirir

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        // Java primitive data turleri ile de bazi method'lari kullanabilmemiz icin
        // Wrapper class'lari olusturmustur.
        // Wrapper class'lar primitive'ler ile ayni isimlere sahiptir
        // ancak non-primitive olduklari icin class isimleri buyuk harfle baslar
        // Boolean, Character, Byte, Short, Integer, Long, Float ve Double

        char chr1 = 'a';

        // chr1 primitive char oldugundan hazir method'lari olmaz

        Character chr2 = 'b';

        System.out.println(chr2.charValue()); // b

        System.out.println(Character.isLowerCase(chr1)); // true
        System.out.println(Character.isDigit(chr1)); // false


        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Short.MIN_VALUE); // -32768




    }
}
