package day17_scope;

public class C03_ClassLevelVariablelar {

    /*
        Eger tum method'lardan kullanabilecegimiz variable'lara ihtiyacimiz olursa
        bu variable'lari class level'da olustururuz

        class level demek, class'in icinde ama tum kod bloklarinin disinda demektir
        genel olarak class level variable'lar class'in en ust kisminda olusturulur

        1- class level variable'larin scope'u BUTUN CLASS'dir
           ancak class level variable'larin method icerisinde direk kullanilip kullanilamamasi
           static keyword'une de baglidir
        2- Variable static olarak isaretlenmisse
           class icerisinde her yerde direk kullanilabilir
           ama variable static degilse(instance), static method'lardan kullanilamaz
        3- static keyword'u method'lar icin de kullanilir
           static method'lar bunyelerine
           static olmayan variable ve method'lari kabul etmezler
        4- class level variable'lar deger atamadan olusturulabilir ve kullanilabilir
           Eger biz deger atamadan variable kullanilirsa
           Java variable'a DEFAULT DEGER atamasi yapar
           boolean ==> false
           char ==> '' (hiclik)
           byte,short,int,long,float,double ==> 0
           non-primitive data turleri ==> null
     */

    int sayi1 ;
    int sayi2 = 20;

    static String str1;
    static String str2 = "Java";

    public static void main(String[] args) {
        //System.out.println(sayi1);
        //System.out.println(sayi2);
        System.out.println(str1);
        System.out.println(str2);
        method1();
        //method2();
    }

    public static void method1(){
        //System.out.println(sayi1);
        //System.out.println(sayi2);
        System.out.println(str1);
        System.out.println(str2);
        //method2();
    }

    public void method2(){
        System.out.println(sayi1); // 0
        System.out.println(sayi2);
        System.out.println(str1); // null
        System.out.println(str2);
        method1();
    }
}
