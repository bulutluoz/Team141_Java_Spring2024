package day08_ternary_switchStatements;

public class C02_TernaryOperatoru {

    public static void main(String[] args) {

        // verilen bir tamsayinin cift sayi veya tek sayi oldugunu yazdirin

        int sayi = 40 ;

        if ( sayi % 2 == 0){
            System.out.println("Sayi cift");
        }else {
            System.out.println("Sayi tek");
        }

        // Ternary operatoru
        // if else ile yapilabilecek BASIT islemler icin kullanilan
        // alternatif bir kod blogudur

        System.out.println( sayi % 2 == 0 ? "Sayi cift" : "Sayi tek" );


        // verilen sayi 0'dan buyukse "pozitif" , 0'dan buyuk degilse "pozitif degil" yazdirin

        if (sayi > 0){
            System.out.println("pozitif");
        }else {
            System.out.println("pozitif degil");
        }

        System.out.println( sayi > 0 ? "pozitif" :   "pozitif degil"     );

        // sayi 10'dan buyukse sayinin degerini 2 azaltin
        // sayi 10'dan buyuk degilse sayinin degerini 5 artirin

        if ( sayi > 10){
            sayi -= 2;
        }else {
            sayi += 5;
        }

        System.out.println("If ile sayinin yeni degeri : " + sayi); // 38

        sayi = sayi>10 ? sayi-2 : sayi+5 ;

        System.out.println("Ternary ile sayinin yeni degeri : " + sayi); // 36


        // Ternary operatoru bir sonuc urettigi icin
        // bu sonuc YA yazdirilmali YA DA bir variable'a atanmalidir.
        // sayi>10 ? sayi-2 : sayi+5 ;

    }
}
