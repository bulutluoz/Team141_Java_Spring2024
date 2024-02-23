package day05_concatenation_mantiksalKarsilastirmalar;

public class C01_Concatenation {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Candir";

        // String metin ifadeler barindirdigindan
        // matematiksel islemlerde KULLANILAMAZ
        // System.out.println( str1 * str2 ); // Operator '*' cannot be applied to 'java.lang.String', 'java.lang.String'
        // System.out.println( str1 - str2 ); // Operator '-' cannot be applied to 'java.lang.String', 'java.lang.String'
        // System.out.println( str1 / str2 ); // Operator '/' cannot be applied to 'java.lang.String', 'java.lang.String'

        // Java'da metinsel ifadeler sadece + islemine tabii tutulabilir
        // + ile yazilan metinler, yan yana birlestirilir

        System.out.println( str1 + str2 ); // JavaCandir

        System.out.println( str1 +" "+ str2 ); // Java Candir

        // String ile + islemine hangi data turu girerse girsin
        // String onu metne cevirir

        System.out.println(str1 + 5); //  "Java5"

        System.out.println(str1 + 5 + 6 + str2); //

    }
}
