package day36_encapsulation_inheritance;

public class C04_Runner {

    public static void main(String[] args) {

        C03_Depo obj = new C03_Depo();

        //System.out.println(obj.intPrivate); // 0
        //obj.intPrivate = 20;

        obj.intDefault = 40;
        System.out.println(obj.intDefault); // 40

        obj.intProtected = 23;
        System.out.println(obj.intProtected); // 23

        System.out.println(obj.intPublic); // 0
        obj.intPublic = 12;
    }
}
