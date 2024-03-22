package day25_constructor;

public class C02_ArabaRunner {

    public static void main(String[] args) {

        /*
            Biz bir class'dan obje olusturdugumuzda
            Java objeyi olusturup,
            olusturuldugu class'daki
            TUM INSTANCE variable'larin ve degerlerinin
            birer kopyasini olusturur
            ve objeye yapistirir

            PEKI BU ISI KIM YAPIYOR?

            Bir obje olusturuldugunda
            o objeye ilk deger atama islevini (initialization)
            constructor yapar

            diger bir deyisle
            Bir Constructor calismadan,
            bir obje olusturulup,
            ona ilk deger atamasi yapmak MUMKUN DEGILDIR

            Constructor'lar () kullandiklari icin
            method'lara benzetilirler
            ama constructor'lar java'da ayri bir yapidir

            Java her class'dan obje olusturulabilmesini saglamak icin
            her class'a GORUNMEYEN
            Default bir constructor koymustur.

            Yani, bir class'da gozle gorulebilir
            bir constructor yoksa,
            o class'da DEFAULT CONSTRUCTOR vardir

            bir class'da gorunur bir constructor olusturulursa
            Java default constructor'i SILER

         */

        C01_Araba araba1 = new C01_Araba();

        System.out.println(araba1.marka); // MB
        System.out.println(araba1.model); // MB
        System.out.println(araba1.yil);//1900
        System.out.println(araba1.fiyat); // 0


        araba1.marka = "Toyota";
        araba1.model = "Corolla";
        araba1.yil = 2012;
        araba1.fiyat = 8000;

        C01_Araba araba2 = new C01_Araba();

        System.out.println(araba2.marka); // MB
        System.out.println(araba2.model); // MB
        System.out.println(araba2.yil);//1900
        System.out.println(araba2.fiyat); // 0



         C01_Araba   araba3          =         new    C01_Araba();
      // Class adi  obje adi  atama isareti  keyword  constructor










    }
}
