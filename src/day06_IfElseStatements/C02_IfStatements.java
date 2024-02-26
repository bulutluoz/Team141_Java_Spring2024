package day06_IfElseStatements;

public class C02_IfStatements {

    public static void main(String[] args) {

        /*
            Bagimsiz if cumleleri,
            adindan anlasilacagi gibi kodun geriye kalanindan bagimsizdir

            sart'a odaklanir
            sart true ise if body'si calisir
            sart false ise if body'si calismaz

            bagimsiz if cumleleri kod'un geriye kalaniyla ilgilenmediginden
            birden fazla bagimsiz if cumlesi oldugunda
            tumunun if body'si calisabilecegi gibi,
            hic birinin if body'sinin calismadigi da olabilir


         */

        int a = 18;
        int b = 47;

        // Eger a b'den buyukse "a b'den buyuk" yazdirin

        if ( a > b ){
            System.out.println("a b'den buyuk");
        }


        // b cift ise , " bu sayilarin carpimi cift olur" yazdirin

        if ( b % 2 == 0  ){
            System.out.println("bu sayilarin carpimi cift olur");
        }

        // a 100'den buyukse "ilk sayi cok buyuk" yazdirin

        if ( a > 100 ){
            System.out.println("ilk sayi cok buyuk");
        }
    }
}
