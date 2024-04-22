package day41_abstractClasses_Interfaces;

public class C05_ConcreteChildClass extends C04_AbstractParent{
    public int method2() {
        return 10;
    }

    public void method5() {
        System.out.println("Child Method 5");
    }
   /*
        Abstract silsileden sonra gelen
        ILK CONCRETE class
        parent class'larda concrete olmayan / concrete yapilmayan
        tum abstract method'lari uyarlamak ZORUNDADIR

    */

}
