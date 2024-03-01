package day09_switchStatement_stringManipulations;

public class C06_equals_equalsIgnoreCase {

    public static void main(String[] args) {

        String str1 = "java";
        String str2 = "Java";
        String str3 = "JAVA";
        String str4 = "Java";
        String str5 = "JAVA ";

        // equals() String'lerin metin olarak birbirine esit olup olmadigini kontrol eder
        // String'de buyuk harf ve kucuk harf birbirinden farkli karakterler oldugundan
        //
        System.out.println(str1.equals(str2)); // java <==> Java  false
        System.out.println(str1.equals(str3)); // java <==> JAVA  false
        System.out.println(str1.equals(str4)); // java <==> Java  false
        System.out.println(str2.equals(str4)); // Java <==> Java  true
        System.out.println(str1.equals(str5)); // java <==> JAVA  false
        System.out.println(str3.equals(str5)); // JAVA <==> JAVA  false  sonda bosluk var

        // Eger buyuk kucuk harf onemsiz ise
        // amacimiz sadece metin olarak ayni olup olmadigina bakmak ise
        // equalsIgnoreCase()
        System.out.println("=================");

        System.out.println(str1.equalsIgnoreCase(str2)); // java <==> Java  true
        System.out.println(str1.equalsIgnoreCase(str3)); // java <==> JAVA  true
        System.out.println(str1.equalsIgnoreCase(str4)); // java <==> Java  true
        System.out.println(str2.equalsIgnoreCase(str4)); // Java <==> Java  true
        System.out.println(str1.equalsIgnoreCase(str5)); // java <==> JAVA  false  sonda bosluk var
        System.out.println(str3.equalsIgnoreCase(str5)); // JAVA <==> JAVA  false  sonda bosluk var


        // Java'da metin ifadelerin karsilastirilmasi icin == kullanilmaz
        // bunun yerine equals() veya equalsIgnoreCase() kullanilmalidir.

        // cunku equals() sadece metne odaklanirken
        // == hem metne , hem de referans'a odaklanir
        // == kullanildiginda ayni metinlerden bazilari true verirken bazilari false verir

        System.out.println("=================");
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        String s4 = "ja" + "va";
        String a = "ja";
        String b = "va";
        String s5 = a+b;

        System.out.println( s1.equals(s2)); // true
        System.out.println( s1.equals(s3)); // true
        System.out.println( s1.equals(s4)); // true
        System.out.println( s1.equals(s5)); // true
        System.out.println( s1.equals("java")); // true

        System.out.println("=================");

        System.out.println( s1 == s2); // java == java  ==> true
        System.out.println( s1 == s3); // java == java  ==> false
        System.out.println( s1 == s4); // java == java  ==> true
        System.out.println( s1 == s5); // java == java  ==> false
        System.out.println( s1 == "java"); // java == java  ==> true


    }
}
