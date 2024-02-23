package day05_concatenation_mantiksalKarsilastirmalar;

public class C03_KarsilastirmaOperatorleri {

    public static void main(String[] args) {

        int a = 5;

        System.out.println( 2*a+4 == 14); // true

        System.out.println( a+4 == 2*a-1 ); //    9 == 9 ==> true

        int b = 3;

        System.out.println( b = 3 * a - 7) ; // 8

        System.out.println( "b : " + b); // b : 8

        System.out.println( b == 2 * a +8); // 8 == 18 ==> false


        // java'da esit degildir karsilastirmasi icin != kullanilir
        // a : 5     b :8

        System.out.println( a + 3  != 2 * b -1); //   8   !=  15  ==> true

        System.out.println( 2 * a != b + 2 ); //  10  != 10 ==> false


        // matematikteki < ve > Java'da da vardir

        System.out.println( 2 * a < b - 3 ); //  10   <  5 ==> false

        System.out.println(   !(a + 7 > b+8)  ); //   !( 12 > 16 ) ==>  !(false) ==> true

        // ONEMLI NOT : Java'da basa yazilan ! mantiksal degeri tersine cevirir

        System.out.println(!true); // false

        System.out.println(   ! (5<8)   ); // !true ==> false


        // <= ve >= de kullanilabilir

        System.out.println( 8 <= 8   ); // true
        System.out.println( 5 <= 8   ); // true
        System.out.println( 10<= 8   ); // false


        int c = 15;

        System.out.println( 15 >= c++     ); // true

        System.out.println(c);

    }
}
