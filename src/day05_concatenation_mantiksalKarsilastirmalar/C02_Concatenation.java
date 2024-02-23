package day05_concatenation_mantiksalKarsilastirmalar;

public class C02_Concatenation {

    public static void main(String[] args) {

        String  s1 = "Java";
        String  s2 = "Candir";
        String  s3 = " ";
        String  s4 = "";

        int a = 5;
        int b = 4;

        // sadece yukardaki variable'lari kullanarak
        // asagida verilen metinleri yazdirin

        // Java 54

        System.out.println(s1+s3+a+b); // Java 54

        // 1 Java

        System.out.println(a-b + s3 + s1); // 1 Java

        // Java 9

        System.out.println(s1+s3+ (a+b) ); // Java 9

        // Candir20

        System.out.println(s2 + a*b ); // Candir20

        // 45Java

        System.out.println(b+a+s1); // 9Java
        System.out.println(b+ (a+s1) ); // 45Java
        System.out.println(   s4+b+a+s1    ); // "4"+ 5 + "Java" ==>45Java



        // "45"'i nasil integer'a cevirip 1 ekleriz

        String str = "45";

        System.out.println( Integer.parseInt(str)  +  1   );


        // Integer olarak verilen bir sayiyi nasil String'e ceviririm

        String ab = ""+ 59 ;


    }
}
