package day36_encapsulation_inheritance;

import day35_accessModifiers.C02_Depo;

public class C01_FarkliPackageChildClass extends C02_Depo{

    public static void main(String[] args) {

        //System.out.println(C02_Depo.privateStr);
        //System.out.println(C02_Depo.defaultStr);
        System.out.println(C02_Depo.protectedStr);
        System.out.println(C02_Depo.publicStr);

        C01_FarkliPackageChildClass depo = new C01_FarkliPackageChildClass();
        //System.out.println(depo.privateSayi);
        //System.out.println(depo.defaultSayi);
        System.out.println(depo.protectedSayi);
        System.out.println(depo.publicSayi);
    }
}
