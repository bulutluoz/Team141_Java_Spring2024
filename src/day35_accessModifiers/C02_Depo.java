package day35_accessModifiers;

public class C02_Depo {

    private int privateSayi;
    private static String privateStr;

    int defaultSayi ;
    static String defaultStr;

    protected int protectedSayi;
    protected static String protectedStr;

    public int publicSayi;
    public static String publicStr;

    public static void main(String[] args) {
        System.out.println(privateStr);
        System.out.println(defaultStr);
        System.out.println(protectedStr);
        System.out.println(publicStr);
    }

    public static void method1(){
        // method1 static oldugu icin access modifier yaninda
        // static keyword'e de dikkat etmemiz gerekir
        System.out.println(privateStr);
        System.out.println(defaultStr);
        System.out.println(protectedStr);
        System.out.println(publicStr);
    }

    public void method2(){
        System.out.println(privateSayi);
        System.out.println(privateStr);
        System.out.println(defaultSayi);
        System.out.println(defaultStr);
        System.out.println(protectedSayi);
        System.out.println(protectedStr);
        System.out.println(publicSayi);
        System.out.println(publicStr);
    }
}
