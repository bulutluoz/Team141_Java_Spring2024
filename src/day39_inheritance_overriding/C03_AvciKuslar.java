package day39_inheritance_overriding;

import day38_inheritance.C04_Kuslar;
import day38_inheritance.C05_AvciKuslar;

public class C03_AvciKuslar extends C02_Kuslar{
    public void hareket() {
        System.out.println("ucarlar");
    }

    public void beslenme() {
        System.out.println("et yerler");
    }

    public void pence() {
        System.out.println("pencelidir");
    }

    public void gaga() {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {
        /*
        Onceki gun ozellikleri variable olarak olusturmustuk,
        ozellikler variable ise,
        dikkat etmemiz gereken en onemli konu DATA TURU secilen class'dir
        data turu secilen class'dan aramaya baslayip,
        ilk buldugumuzu kullaniriz

        ANCAK,
        ozellikler method olarak olusturuldugunda
        overridding(gecersiz kilmak) devreye girer
        override eden method'lar ve override edilen method'lar
        intelliJ'de asagi veya yukari yonlu oklarla gosterilirler

        ozellikleri belirlemede
        data turu secilen class ve constructor
        birlikte etkili olurlar

        aramaya data turu secilen class'dan baslariz
        aranan ozellik bulununca,
        hemen ilk bulunani kullanmayiz,
        buldugumuz method, constructor'in oldugu class'a kadar
        ovverride edilmisse,
        daha guncel bilgiyi kullaniriz

        Farkli bir bakis acisiyla soylersek;
        EGER constructor ve data turu ayni class'dan ise
        ozelliklerin variable veya method olmasi farketmez
        o class'dan aramaya baslar, ilk buldugumuzu kullaniriz

        EGER constructor ve data turu farkli ise
        variable ve method'lar farkli davranir
        ikisinde de aramaya data turunden baslariz,
        variable ilk buldugunu kullanir,
        method ise bulduktan sonra constructor'a kadar daha gunceli var mi diye bakar
         */

        C03_AvciKuslar kartalAvK = new C03_AvciKuslar();

        kartalAvK.omur(); // H yasar ve olurler

        kartalAvK.solunum(); // K akcigerle nefes alir
        kartalAvK.cogalma(); // K yumurtayla cogalir
        kartalAvK.kanat(); // K kanatlidir

        kartalAvK.hareket(); // AvK ucarlar
        kartalAvK.beslenme(); // AvK etle beslenir
        kartalAvK.pence(); // AvK pencelidir
        kartalAvK.gaga(); // AvK sivri gagalidir



        C02_Kuslar kartalKus = new C03_AvciKuslar();

        kartalKus.omur(); // H yasar ve olurler

        kartalKus.solunum(); // K akcigerle nefes alir
        kartalKus.cogalma(); // K yumurtayla cogalir
        kartalKus.kanat(); // K kanatlidir

        kartalKus.hareket(); // AvK ucarlar
        kartalKus.beslenme(); // AvK etle beslenir
        //kartalKus.pence(); // CTE kuslar veya hayvanlarda yok
        kartalKus.gaga(); // AvK sivri gagalidir



        C01_Hayvanlar kartalHayvan = new C03_AvciKuslar();

        kartalHayvan.omur(); // H yasar ve olurler

        kartalHayvan.solunum(); // K akcigerle nefes alir
        kartalHayvan.cogalma(); // K yumurtayla cogalir
        //kartalHayvan.kanat(); // CTE hayvanlarda yok

        kartalHayvan.hareket(); // AvK ucarlar
        kartalHayvan.beslenme(); // AvK etle beslenir
        //kartalHayvan.pence(); // CTE hayvanlarda yok
        //kartalHayvan.gaga(); // CTE hayvanlarda yok



        C02_Kuslar kus1 = new C02_Kuslar();
        kus1.omur(); // H yasar ve olurler

        kus1.solunum(); // K akcigerle nefes alir
        kus1.cogalma(); // K yumurtayla cogalir
        kus1.kanat(); // K kanatlidir

        kus1.hareket(); // H hareket eder
        kus1.beslenme(); // H beslenir
        // kus1.pence(); // CTE kuslar veya hayvanlarda yok
        kus1.gaga(); // K gagalidir



        C01_Hayvanlar kusHayvanlar = new C02_Kuslar();
        kusHayvanlar.omur(); // H yasar ve olurler

        kusHayvanlar.solunum(); // K akcigerle nefes alir
        kusHayvanlar.cogalma(); // K yumurtayla cogalir
        //kusHayvanlar.kanat(); // CTE hayvanlarda yok

        kusHayvanlar.hareket(); // H hareket eder
        kusHayvanlar.beslenme(); // H beslenir
        //kusHayvanlar.pence(); // CTE hayvanlarda yok
        // kusHayvanlar.gaga(); // CTE hayvanlarda yok


        C01_Hayvanlar hayvan1 = new C01_Hayvanlar();
        hayvan1.omur(); // H yasar ve olurler

        hayvan1.solunum(); // H nefes alir
        hayvan1.cogalma(); // H  cogalir
        //hayvan1.kanat(); // CTE hayvanlarda yok

        hayvan1.hareket(); // H hareket eder
        hayvan1.beslenme(); // H beslenir
        //hayvan1.pence(); // CTE hayvanlarda yok
        //hayvan1.gaga(); // CTE hayvanlarda yok

    }
}








