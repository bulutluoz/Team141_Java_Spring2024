package day40_abstraction;

public abstract class C03_KismiKuralciAbstractParent {

    /*

        Bir class isterse, kendisini parent edinecek child class'larin
        mutlaka implement etmesi gereken method'lari belirleyebilir

        ornegin bu class'imiz kendisinde bulunan method1 ve method2'yi
        C03'u parent edinen tum child class'larin implement etmesini zorunlu kilmak istiyor

        bu zorunlulugu saglamak icin
        1- kural koymak isteyen class abstract olmalidir
           bir class'i abstract yapmak icin class deklarasyonuna abstract yazmak yeterlidir

        2- bir abstract class icindeki tum method'lar zorunlu degildir
           child class'larin implement etmesini zorunlu kilmak istedigimiz method'lari da abstract yapmaliyiz

           bir method'u abstract yapmak icin
           - method deklarasyonuna abstract yazmaliyiz
           - abstract method'lar bugune kadar kullandigimiz method'lar gibi degildir
             abstract method'lari normal bir method olarak degil,
             sadece bir kurali belirten standart yazisi gibi dusunebiliriz
           - abstract method'lar sadece kural cumlesidir,
             adindan anlasilacagi gibi (abstract = soyut yani body'si olmayan)
             abstract method'larin body'si olmaz

     */

    // child class'larin kendine uyarlamasi zorunlu olsun
    public abstract void method1();

    // child class'larin kendine uyarlamasi zorunlu olsun
    public abstract void method2();

    // child class'larin kendine uyarlamasi zorunlu degil, child'in istegine kalsin
    public void method3(){

    }

    public void method4(){

    }
}
