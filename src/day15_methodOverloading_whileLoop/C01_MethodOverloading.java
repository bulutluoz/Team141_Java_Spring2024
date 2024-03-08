package day15_methodOverloading_whileLoop;

public class C01_MethodOverloading {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.substring(5)); // Candir

        System.out.println(str.substring(5, 8)); // Can

        // Bir class'da ayni isimde birden fazla method olusturulmasina
        // METHOD OVERLOADING denir
        toplama(3,4); // toplama int int ==> Iki integer'in toplami : 7
        toplama(3,4,6); // toplama int int int ==> Uc integer'in toplami : 13
        toplama(4,4.5); // toplama int double ==> integer ve double'in toplami : 8.5
        toplama(5.6,4); // toplama double int ==> double ve integer'in toplami : 9.6
        toplama(5.6,4.4); // toplama double double ==> Iki double'in toplami : 10.0

    }

    // Kural1 : Bir class'in icinde herseyi ayni olan 2 method olusturamazsiniz
    //          parametre isimlerini, access modifier'i veya static durumunu degistirmek yeterli Olmaz

    // Kural2 : Bir class icinde ayni isimde birden fazla method olusturabilmek icin (overloading)
    //          method'larin SIGNATURE'lari farkli olmalidir

    // Method Signature : Method ismi + parametrelerin data turleri
    // Overloading olmasi icin ismi degistirmememiz gerekiyor,
    // Signature'i degistirmek icin 3 ihtimalimiz var
    //  - parametre sayisini degistirmek
    //  - data turlerini degistirmek
    //  - farkli data turundeki parametrelerin yerlerini degistirmek


    public static void toplama(int a , int b){ // toplama int int
        System.out.println("Iki integer'in toplami : " + (a+b));
    }
    protected static void toplama(int sayi1 , int sayi2, int sayi3) { // toplama int int int
        System.out.println("Uc integer'in toplami : " + (sayi1+sayi2+sayi3));
    }
    public static void toplama(double a , int b){ // toplama double int
        System.out.println("double ve integer'in toplami : " + (a+b));
    }
    public static void toplama(int a , double b){ // toplama int double
        System.out.println("integer ve double'in toplami : " + (a+b));
    }
    public static void toplama(double a , double b){ // toplama double double
        System.out.println("Iki double'in toplami : " + (a+b));
    }




    }
