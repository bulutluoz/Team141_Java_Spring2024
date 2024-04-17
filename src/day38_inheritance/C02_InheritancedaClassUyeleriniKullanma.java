package day38_inheritance;

public class C02_InheritancedaClassUyeleriniKullanma  extends C01_Parent{

    String s = "Ali";
    String t = "Veli";
    int a = 33;
    int b = 34;
    int c = 35;

    public static void main(String[] args) {

        C02_InheritancedaClassUyeleriniKullanma obj = new C02_InheritancedaClassUyeleriniKullanma();
        obj.method1();

    }

    private void method1() {

        String s = "Malatya";
        String k = "Nigde";
        int a = 43;
        int b = 44;
        int c = 45;
        int d = 46;

        System.out.println(k); // Nigde
        System.out.println(s); // Malatya
        System.out.println(t); // Veli scope'ta olmadigi icin class'dan aldi
        System.out.println(str); // Java scope'da ve class'da olmadigi icin parent'dan aldi

        /*
            Bir scope'da herhangi bir class uyesini kullanmak istersek
            Java sirasi ile
            1- icinde oldugu scope
            2- icinde oldugu class
            3- parent class(lar)'a bakar ve ilk buldugunu kullanir
         */

        System.out.println(a); // 43
        System.out.println(this.a); // 33 class'daki a'yi yazdirir
        System.out.println(super.a); // 10 parent class'daki a'yi yazdirin

        System.out.println(b); // 44
        System.out.println(this.b); // 34
        System.out.println(super.b); // 20

        System.out.println(c); // 45
        System.out.println(this.c); // 35
        //System.out.println(super.c); // CTE

        System.out.println(d); // 46
        //System.out.println(this.d); // CTE
        // System.out.println(super.d); // CTE

        /*
            this.variableIsmi yazdigimizda
            aramaya scope'u atlayip class level'dan baslar
            class seviyesinde veya parent class'larda buldugu ilk degeri kullanir,
            class seviyesinde veya parent class'larda variable'i bulamazsa CTE verir
            (scope'a donmez)

            super.variableIsmi yazdigimizda
            aramaya scope ve icinde oldugu class'i atlayip
            direk parent class'dan baslar
            parent class veya parent class'in parent'larinda buldugu ilk degeri kullanir
            EGER parent class veya parent class'in parent'larinda bulamazsa
            CTE verir,
            class'a veya scope'a donmez
         */


    }


}
