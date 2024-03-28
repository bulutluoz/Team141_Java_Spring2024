package day29_passByValue;

public class C02_StaticOlmayanBlok {

    /*
        Static olmayan blok'lar
        constructor'dan once calisir
        ve (varsa) obje olusturulmadan once
        yapilmasi gereken ayarlari yapar
     */

    C02_StaticOlmayanBlok(){
        System.out.println("Constructor calisti");
    }

    C02_StaticOlmayanBlok(int sayi){
        System.out.println("parametreli constructor calisti");
    }

    public static void main(String[] args) {

        System.out.println("main method calisti");

        C02_StaticOlmayanBlok obj1 = new C02_StaticOlmayanBlok();
        System.out.println("obj1 olusturuldu");


        C02_StaticOlmayanBlok obj2 = new C02_StaticOlmayanBlok(5);
        System.out.println("obj2 olusturuldu");
    }

    {
        System.out.println("static olmayan blok calisti");
    }
}
