package day37_inheritance;

public class C02_GParent {

   C02_GParent(){
       System.out.println("GParent parametresiz cons.");
   }

   C02_GParent(double c){
       this();
       c= 5;
       System.out.println(c);
   }
}
