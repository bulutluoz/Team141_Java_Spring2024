package day04_wrapperClass_MatematikselIslemler;

public class C09_Pre_Post_Increment {

    public static void main(String[] args) {

        // Java sayi++ ve sayi-- islemlerine ozel olarak
        //      ++sayi ve --sayi seklinde yazilabilme ozelligi vermistir
        //      sayi++ ve ++sayi sonuc olarak ayni islemi yapar ve sayiyi 1 artirir
        //      aralarindaki fark islemin yapildigi satirda, ikinci bir islem olursa ortaya cikar


        int sayi = 20;

        sayi++;

        // bir sonraki satirda yazdirirsak

        System.out.println(sayi); // 21


        int a = 20;

        ++a;
        // bir sonraki satirda yazdirirsak
        System.out.println(a); // 21


        int b = 20;
        System.out.println("b : " + b++); // b : 20

        int c = 20;
        System.out.println("c : " + ++c ); // c : 21

        // islemin yapildigi satirdan sonra aralarinda hic bir fark yoktur
        // ikisi de variable'lari 1 artirdi
        System.out.println("b : " + b + ",c : " + c); // b : 21,c : 21


        int d = 10;

        int e = ++d;

        System.out.println("d : " + d + ",e : " + e); // d : 11,e : 11


        int f = 20;

        int g = f++;

        System.out.println("f : " + f + ",g : " + g); // f : 21,g : 20

    }
}
