package day41_abstractClasses_Interfaces;

public class C06_ConcreteGrandChild extends C05_ConcreteChildClass{

    // parent class olan C05'de
    // butun abstract method'lar concrete'lestirildigi icin
    // C06'nin hic bir mecburiyeti kalmaz
    // Normal inheritance kurallari cercevesinde
    // method'lari kullanir

    public void method3(){
        System.out.println("GC method3");
    }

    public int method6(){
        return 20;
    }

    public static void main(String[] args) {


        C06_ConcreteGrandChild gc1 = new C06_ConcreteGrandChild();
        // data turu ve cons ayni, C06'ya git ilk buldugunu kullan
        gc1.method1(); // Parent method1
        System.out.println(gc1.method2()); // 10
        gc1.method3(); // GC method3
        System.out.println(gc1.method4()); // 2
        gc1.method5(); // C method5
        System.out.println(gc1.method6()); // 20


        C04_AbstractParent gc2 = new C06_ConcreteGrandChild();
        // data turu ve cons farkli,
        // C04'ya git bulursan, C06'ya kadar guncel ara
        gc2.method1(); // Parent method1
        System.out.println(gc2.method2()); // 10
        gc2.method3(); // GC method3
        System.out.println(gc2.method4()); // 2
        gc2.method5(); // C method5
        System.out.println(gc2.method6()); // 20


        C05_ConcreteChildClass cc1 = new C05_ConcreteChildClass();
        // data turu ve cons ayni, C05'ya git ilk buldugunu kullan
        cc1.method1(); // Parent method1
        System.out.println(cc1.method2()); // 10
        cc1.method3(); // GP method3
        System.out.println(cc1.method4()); // 2
        cc1.method5(); // C method5
        System.out.println(cc1.method6()); // 0


        C03_AbstractGrandParent cc2 = new C05_ConcreteChildClass();
        // data turu ve cons farkli,
        // C03'ya git bulursan, C05'ya kadar guncel ara
        cc2.method1(); // Parent method1
        System.out.println(cc2.method2()); // 10
        cc2.method3(); // GP method3
        System.out.println(cc2.method4()); // 2
        // cc2.method5(); // CTE C03'de yok
        // System.out.println(cc2.method6()); // CTE C03'de yok













    }

}
