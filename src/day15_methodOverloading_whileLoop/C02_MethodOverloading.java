package day15_methodOverloading_whileLoop;

public class C02_MethodOverloading {

    public static void main(String[] args) {

        /*
            Bir class'da overloading varsa
            o method cagrildiginda java hangi method'un calisacagina
            asagidaki 3 adimla karar verir

            1- signature'i %100 ayni olan method varsa onu calistirir
            2- signature'i ayni olan method yoksa
               Java casting yaparak kullanabilecegi method arar
            3- Casting ile birden fazla method calisabiliyor ise
               Java en az casting yapacagi method'u tercih eder
         */

        toplama('a','b'); // toplama char char ==> Iki integer'in toplami : 195
        // toplama("Ali",5); //CTE ==>"ali" argumentini method'lardan hic biri parametre olarak kabul etmez
        toplama(3.4f, 6); // toplama float int ==> double ve integer'in toplami : 9.400000095367432
        toplama(2.3f,3.1f); // Iki double'in toplami : 5.3999998569488525

    }

    public static void toplama(int a , int b){ // toplama int int 1
        System.out.println("Iki integer'in toplami : " + (a+b));
    }

    public static void toplama(double a , int b){ // toplama int int 2
        System.out.println("double ve integer'in toplami : " + (a+b));
    }

    public static void toplama(double a , double b){ // toplama int int 3
        System.out.println("Iki double'in toplami : " + (a+b));
    }

}
