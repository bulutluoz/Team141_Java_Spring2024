package day04_wrapperClass_MatematikselIslemler;

public class C08_Pre_PostIncrement {

    public static void main(String[] args) {

        int a = 20;

        // a'nin degerini olusturacaginiz bir b variable'ina atayin
        // sonra a'nin degerini 1 artirin

        int b = a;

        a++;

        System.out.println("a : " + a + ", b : " + b); // a : 21, b : 20


        int c = 20;

        // c'nin degerini 1 artirin,
        // sonra c'nin degerini olusturacaginiz d variable'ina atayin

        c++;

        int d = c ;

        System.out.println("c : " + c + ", d : " + d); // c : 21, d : 21


        int e = 20;

        // e'nin degerini yazdirin, sonra e'nin degerini 1 artirin

        System.out.println("e : " + e); // e : 20

        e++;
        // bu satira geldigimizde e 21 olur, ama artisdan once e'yi yazdirdigimiz icin e : 20


        int f = 20;

        // f'nin degerini 1 artirin, sonra f'nin degerini yazdirin

        f++;

        System.out.println("f : " + f);

        // bu satira geldigimizde f'nin degeri 21, yazdirmayi artisdan sonra yaptigimiz icin f : 21

    }
}
