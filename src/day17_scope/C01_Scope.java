package day17_scope;

public class C01_Scope {

    /*
        Scope :
        variable ve method'larin nerelerden kullanilabilecegini
        ve bir kod blogu icerisinde hangi class uyelerinin kullanilabilecegini
        belirleyen kurallardir
     */

    int a = 20;
    static String b;

    public static void main(String[] args) {

        int sayi = 10 ;
        System.out.println(sayi); // 10
        // System.out.println(str);
        // System.out.println(a);
        System.out.println(b);

        for (int i = 0; i <10 ; i++) {

            int c= 20;
        }

        // System.out.println(i);
        // System.out.println(c);
        String str = "Ali";
    }


    public static void method1(){

        //System.out.println(sayi);
        String str = "Java super";
        //System.out.println(a);
        System.out.println(b);
    }

    public void method2(){

        //System.out.println(sayi);
        //System.out.println(str);
        System.out.println(a);
        System.out.println(b);
    }


}
