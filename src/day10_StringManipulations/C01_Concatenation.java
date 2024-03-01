package day10_StringManipulations;

public class C01_Concatenation {

    public static void main(String[] args) {

        System.out.println( "Ja" + "va"+ 5 + 4 + true); // Java54true

        String s1 = "Ja";
        String s2 = "va";

        System.out.println(    s1+s2       ); // Java

        System.out.println(   s1.concat(s2)  ); // Java

        // s1.concat(5).concat(4)  concat method'unda mutlaka String kullanilmalidir

    }
}
