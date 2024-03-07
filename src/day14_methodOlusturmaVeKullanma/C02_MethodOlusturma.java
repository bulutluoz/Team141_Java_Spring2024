package day14_methodOlusturmaVeKullanma;

public class C02_MethodOlusturma {

    public static void main(String[] args) {

        // Verilen iki sayidan, buyuk olani yazdiran bir method olusturun
        // eger sayilar esitse, "esit sayilarda buyuk olan yoktur"

        buyukOlaniYazdir(7,8); // Sayilardan buyuk olan : 8
        buyukOlaniYazdir(7,5); // Sayilardan buyuk olan : 7
        buyukOlaniYazdir(5,5); // esit sayilarda buyuk olan yoktur

    }

    // method class icinde ama diger method'larin disinda olusturulmalidir


    public static void buyukOlaniYazdir(int sayi1 , int sayi2){

        if (sayi1 > sayi2){
            System.out.println("Sayilardan buyuk olan : " + sayi1);
        } else if (sayi2 > sayi1) {
            System.out.println("Sayilardan buyuk olan : " + sayi2);
        }else{
            System.out.println("esit sayilarda buyuk olan yoktur");
        }
    }

}
