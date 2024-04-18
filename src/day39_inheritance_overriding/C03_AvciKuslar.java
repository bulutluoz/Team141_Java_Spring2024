package day39_inheritance_overriding;

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
        buldugumuz method, constructor'in oldugu cl;ass'a kadar
        ovverride edilmisse,
        daha guncel bilgiyi kullaniriz


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

    }
}
