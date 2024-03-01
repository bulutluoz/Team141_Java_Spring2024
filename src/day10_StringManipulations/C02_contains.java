package day10_StringManipulations;

public class C02_contains {

    public static void main(String[] args) {

        String str = "Ali topu at, at Ali at";

        System.out.println(str.contains("Ali")); // true

        System.out.println(str.contains("at")); // true

        System.out.println(str.contains("ali")); // false

        System.out.println(str.contains("topu Ali")); // false
        System.out.println(str.contains("topu") && str.contains("Ali")); // true

        System.out.println(str.contains("topu at")); // true

        System.out.println(str.contains("u a")); // true


        String aciklama = "The iPhone 13 in Starlight color is a high-performance device with 128 GB of storage, offering ample space for your apps, photos, and files. It boasts advanced features, including a powerful A15 Bionic chip, improved camera system, vibrant 6.1-inch Super Retina XDR display, and all-day battery life.";

        // aciklamada buyuk kucuk harf onemsiz olarak
        // phone geciyor mu ?

        System.out.println( aciklama.toLowerCase().contains("phone")     ); // true





    }
}
