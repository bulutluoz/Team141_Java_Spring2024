package day32_dateTime_Varargs;

public class C03_Varargs {

    public static void main(String[] args) {
        // Eger bir method'da ayni cinsten istendigi kadar parametre kabul etmesini istiyorsak
        // parametre olarak varargs (variety of arguments) kullaniriz
        // varargs sadece parametre olarak kullanilir
        // ve array altyapisi ile calisir

        topla(3,5); // Method'da 8
        topla(3,5,7);// Method'da 15
        topla(3,5,7,2); // Method'da 17
        topla(5); // Method'da 5
        topla(1,2,3,4,5,6); // Method'da 21
        topla(1,2,3,4,5,6,7,8,9); // Method'da 45
        topla(1,2,3,4,5,6,7);// Method'da 28

    }

    public static void topla(int... sayilar){

        int toplam = 0;

        for (int each : sayilar
             ) {
            toplam+=each;
        }
        System.out.println(toplam);
    }



    public static void topla(int a , int b){
        System.out.println(a+b);
    }

    public static void topla(int a , int b,int c){
        System.out.println(a+b+c);
    }

    public static void topla(int a , int b, int c, int d){
        System.out.println(a+b+c+d);
    }
}
