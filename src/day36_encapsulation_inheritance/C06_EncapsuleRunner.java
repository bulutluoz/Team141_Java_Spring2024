package day36_encapsulation_inheritance;

public class C06_EncapsuleRunner {

    public static void main(String[] args) {

        C05_EncapsuleClass obj = new C05_EncapsuleClass();

        //obj.satisTutari = 30;
        //System.out.println(obj.satisTutari);

        //System.out.println(obj.toplamSatisMiktari);
        //obj.toplamSatisMiktari= 40;

        obj.setSatisTutari(50);

        //System.out.println(obj.setSatisTutari(20));
        // satis miktarina deger atayabiliyoruz
        // ama atanan degerleri yazdiramiyoruz

        obj.setSatisTutari(60);
        obj.setSatisTutari(20);
        obj.setSatisTutari(30);

        System.out.println(obj.getToplamSatisMiktari()); // 160

        // obj.getToplamSatisMiktari() = 500;
        // toplam satis tutarini yazdirip gorebiliyoruz
        // ama toplam satis tutarina deger atayamiyoruz

        obj.publicsayi = 60;
        System.out.println(obj.publicsayi); // 60
        obj.publicsayi = 75;
        System.out.println(obj.publicsayi); // 75


        // obj.encapsuleSayi = 24;
        // System.out.println(obj.encapsuleSayi);
        obj.setEncapsuleSayi(65);
        System.out.println(obj.getEncapsuleSayi());//65

        /*
            Bir variable'i public yapmak ile,
            private yapip getter ve setter olusturmak
            erisim acisindan ayni sonucu verir

            Bazi developer'lar
            get ve set islemine vurgu yapmak icin
            public yapmak yerine
            encapsule edip,
            getter ve setter olusturmayi tercih ederler
         */
    }
}
