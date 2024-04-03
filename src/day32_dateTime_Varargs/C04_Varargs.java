package day32_dateTime_Varargs;

public class C04_Varargs {

    public static void main(String[] args) {

        // verilen farkli adetlerdeki sayilarin
        // ilki haric geriye kalanlari toplayip
        // ilk sayi ile bu toplami carpip yazdiran bir method olusturun

        islem(2);
        islem(2,3,4);
        islem(2,4,5,6,7);
        islem(0,2,3,4,5,6,7,8,9,5);

    }

    public static void islem(int ilkSayi, int... kalanSayilar){


    }

}
