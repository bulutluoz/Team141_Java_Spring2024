package day36_encapsulation_inheritance;

import org.xml.sax.helpers.ParserAdapter;

public class C10_Runner {

    public static void main(String[] args) {

        C09_Corolla corolla = new C09_Corolla();
        System.out.println(corolla.yakit); // A yakit turu belirtilmedi
        System.out.println(corolla.yil); // A 1900

        System.out.println(corolla.marka); // T Toyota
        System.out.println(corolla.aku); // T Inci
        System.out.println(corolla.guvenlik); // T ABS

        System.out.println(corolla.model); // C Corolla
        System.out.println(corolla.uretimYeri); // C Sakarya
        System.out.println(corolla.kasa); // C Corolla kasasi
        System.out.println(corolla.teker);// C 15 inc pirelli
        System.out.println(corolla.motor); // C Cvvti

    }
}
