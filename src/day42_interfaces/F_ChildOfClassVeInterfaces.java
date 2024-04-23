package day42_interfaces;

public class F_ChildOfClassVeInterfaces extends E_ParentClass
                                        implements A_ParentInterface01,D_ParentInterface03{


    @Override
    public int method3() {
        return 0;
    }

    @Override
    public String method4() {
        return null;
    }

    /*
        birden fazla parent edinen bir class
        parent abstract yapilarda bulunan
        concrete'lestirilmemis tum abstract method'lari
        kendisine UYARLAMAK ZORUNDADIR

        bu ornekte method1 ve method2
        parentClass'da concrete olarak bulundugundan
        implement etme zorunlulugu yoktur
     */

    public static void main(String[] args) {

        // System.out.println(SAYI);
        // Reference to 'SAYI' is ambiguous, both 'E_ParentClass.SAYI' and 'A_ParentInterface01.SAYI' match

        System.out.println(A_ParentInterface01.SAYI); // 10
        System.out.println(D_ParentInterface03.SAYI); // 20
        System.out.println(E_ParentClass.SAYI); // 50

        // A_ParentInterface01.SAYI = 45;
        // Cannot assign a value to final variable 'SAYI'
        // Interface'lerdeki tum variable'lar final oldugundan sonradan deger atanamaz

        E_ParentClass.SAYI = 44;
        System.out.println(E_ParentClass.SAYI); // 44

        /*
            Birden fazla parent'da ayni isimde variable olursa
            parent ismi ile birlikte yazarak
            istedigimizi kullanabiliriz
         */

    }

}
