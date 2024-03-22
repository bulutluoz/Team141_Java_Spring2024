package day25_constructor;



public class C01_Araba {

    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    int yil = 1900;
    int fiyat;

    C01_Araba(){
       // Java'nin class'lara koydugu default constructor
       // 1- parametresizdir
       // 2- body'sinde kod yoktur
       // 3- gorunmez
    }

    C01_Araba(int a){
        // Bir yapinin Constructor olabilmesi icin
        // Su iki sarti MUTLAKA saglamalidir
        // 1- ismi class ismi ile tamamen ayni olmalidir
        // 2- return type'i olmamalidir
        // Bu iki sarti saglamak kosuluyla
        // signature'lari farkli istediginiz kadar
        // constructor olusturabilirsiniz

    }


    void method1(){
        // bir method ile constructor arasindaki fark
        // method'larin MUTLAKA return type'lari olur
        // ama constructor'larin return type'i olmaz
    }

}
