package day14_methodOlusturmaVeKullanma;

public class C03_MethodOlusturma {

    public static void main(String[] args) {

        // verilen bir metni tersten yazdiran bir method olusturun

        terstenYazdir("Method olusturma guzelmis..."); // ...simlezug amrutsulo dohteM

        terstenYazdir("123454321"); // 123454321

        terstenYazdir("Emrah"); // harmE

    }

    public static void terstenYazdir(String metin){


        for (int i = metin.length()-1 ; i >=0 ; i--) {

            System.out.print(metin.charAt(i));
        }
        System.out.println("");
    }
}
