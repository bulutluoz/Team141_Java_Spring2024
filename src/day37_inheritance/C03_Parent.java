package day37_inheritance;

public class C03_Parent extends C02_GParent {

    C03_Parent(){
        System.out.println("Parent parametresiz cons.");
    }

    C03_Parent(int b){
        System.out.println("Parent int parametreli cons.");
    }

    C03_Parent(String k){
        this(3);
        System.out.println("Parent String parametreli cons.");
    }

    C03_Parent(double c){
        super(7.2);
        c=7;
        System.out.println(c);
    }
}










