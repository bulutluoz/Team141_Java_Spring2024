package day36_encapsulation_inheritance;

import day35_accessModifiers.C02_Depo;

public class C02_FarkliPackageChildOlmayanClass {

    public static void main(String[] args) {
        //System.out.println(C02_Depo.privateStr);
        //System.out.println(C02_Depo.defaultStr);
        //System.out.println(C02_Depo.protectedStr);
        System.out.println(C02_Depo.publicStr);

        C02_Depo depo = new C02_Depo();
        //System.out.println(depo.privateSayi);
        //System.out.println(depo.defaultSayi);
        //System.out.println(depo.protectedSayi);
        System.out.println(depo.publicSayi);
    }
}
