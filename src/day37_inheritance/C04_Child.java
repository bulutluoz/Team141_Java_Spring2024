package day37_inheritance;

public class C04_Child extends C03_Parent {
    /*
        Child class'da olusturulan her objenin
        parent class'daki ozelliklere de sahip olabilmesi icin
        Java extends kullanan bir class'daki,
        her constructor'in ILK SATIRINDA constructor call olma mecburiyeti koymustur

        ilk satirda gorunur bir constructor call varsa
        Java o constrructor call'a uygun olarak calisir
        Eger ilk satirda GORUNUR bir constructor call yoksa
        Java default olarak PARAMETRESIZ super() koyar
     */

    C04_Child(){
        System.out.println("Child parametresiz cons.");
    }

    C04_Child(int a){
        System.out.println("Child int parametreli cons.");
    }

    C04_Child(String s){
        super(5);
        System.out.println("Child String parametreli cons");
    }

    public static void main(String[] args) {

        // C04_Child child1 = new C04_Child();

        // C04_Child child2 = new C04_Child(4);

        C04_Child child3 = new C04_Child("ali");

    }
}
