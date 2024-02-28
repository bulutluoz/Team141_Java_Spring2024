package day08_ternary_switchStatements;

public class C04_NestedTernary {

    public static void main(String[] args) {

        /*
            Ikiden fazla sonuc olasiligi olan gorevlerde
            Ternary pek tercih edilmez
         */

        // verilen sayi icin asagidaki 3 durumdan uygun olani yazdirin
        // - sayi pozitif
        // - sayi negatif
        // - 0 pozitif veya negatif degildir

        int sayi = -10;

        if (sayi>0){
            System.out.println("Sayi pozitif");
        } else if (sayi<0) {
            System.out.println("Sayi negatif");
        }else {
            System.out.println("0 pozitif veya negatif degildir");
        }

        System.out.println( sayi>0 ? "Sayi pozitif" : "Sayi 0 veya negatif olabilir" );


        System.out.println( sayi>0 ? "Sayi pozitif" : sayi == 0 ? "0 pozitif veya negatif degildir" : "Sayi negatif" );

    }
}
