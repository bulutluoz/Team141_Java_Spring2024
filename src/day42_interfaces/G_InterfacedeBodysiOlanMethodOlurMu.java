package day42_interfaces;

public interface G_InterfacedeBodysiOlanMethodOlurMu {

    /*
        Buyuk bir projede pekcok interface bulunabilir
        bu interface'ler yuzlerce/binlerce class tarafindan implement edilmis olabilir

        Eger gunun birinde varolan bir interface'e
        yeni bir method eklememiz gerekirse
        bugune kadar o interface'i implement etmis olan
        BUTUN CHILD CLASS'lar yeni method'u implement etmedigi icin CTE verir
        tum child class'lari bulmamiz
        her bir class'in durumunu inceleyip
        yeni method'u o child class'lara uyarlamamiz GEREKIR

        Developer'larin bu tur ihtiyaclari
        SORUNSUZ COZEBILMESI icin
        JAVA 8 ile istisnai bir yol olusturulmustur

        Java ozel 2 keyword belirleyerek
        Interface icinde bu keyword'lere sahip olan method'larin
        body'si olmasina ve boylece implement edilme zorunlulugu OLMAMASINA olanak tanimistir

        bu iki keyword : default , static
     */


    public void method1();  // interface'in icinde oldugundan
                            // biz yazmasak da Java otomatik olarak abstract kabul eder

    // public void method2(){
         // Interface abstract methods cannot have body
         // biz abstract yazmasak da Java otomatik olarak abstract kabul eder
         // ve body olusturmamiza IZIN VERMEZ
    // }


    public default void method3(){
        // burada default'un access modifier olmasi mumkun degil
        // cunku access modifier olarak public var
        // buradaki default 1.istisna keyword'udur
        System.out.println("Interface icinde default method");
    }

    public static void method4(){
        // istisna olarak default ve static keyword iceren method olusturursak
        // MUTLAKA body'si olmalidir
        System.out.println("Interface icinde static method");
    }



}
