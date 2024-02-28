package day08_ternary_switchStatements;

public class C03_Ternary {

    public static void main(String[] args) {

        /*
            Ternary'de iki olasilik olur
            eger bu iki olsilikdan birinde atama yapmamiz,
            digerinde yazdirmamiz isteniyorsa
            ternary yerine if tercih edilebilir
         */

        int sayi = 20 ;

        // verilen sayi 10'dan buyukse degerini 3 azaltin
        // 10'dan buyuk degilse "Bu sayi cok kucuk" yazdirin

        if (sayi>10){
            sayi -=3 ;
        }else{
            System.out.println("Bu sayi cok kucuk");
        }

        System.out.println("If-else'den sonra sayi : " + sayi); // 17


        // bunu ternary ile yaparsak

        System.out.println(sayi > 10 ? sayi = sayi - 3 : "sayi cok kucuk");

        System.out.println("Ternary'den sonra sayi : " + sayi); // 14
    }
}
