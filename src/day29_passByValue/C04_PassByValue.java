package day29_passByValue;

public class C04_PassByValue {

    public static void main(String[] args) {

        int sayi = 30;

        method1(sayi);

        System.out.println("Method call'dan sonra main method'da sayi : " + sayi); //

    }


    public static void method1(int sayi){

        sayi = 3 * sayi ;

        System.out.println("method'da sayinin degeri : " + sayi); //
    }
}
