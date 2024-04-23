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

}
