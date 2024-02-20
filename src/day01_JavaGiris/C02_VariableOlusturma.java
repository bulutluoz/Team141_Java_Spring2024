package day01_JavaGiris;

public class C02_VariableOlusturma {


    public static void main(String[] args) {

        int sayi = 10 ;

        // java'daki = isareti, matematikdeki ='den farkli calisir
        // java = isareti gorunce, once esitligin sag tarafindaki degeri hesaplar
        // bulunan islem sonucunu, sol taraftaki variable'a assign eder

        sayi = 2 * sayi ;

        System.out.println(  sayi  ) ; // 20

        sayi = 5 + sayi ;

        System.out.println(  sayi  ) ; // 25

        // 2 * sayi + 1 = 5 * sayi - 7 ;  Variable expected
        // esitligin sol tarafinda islem olmaz, sadece variable ismi olmalidir

        sayi = 5 * sayi - 7 ;

        // int sayi = 20; // Variable 'sayi' is already defined in the scope

        sayi = 40;
    }
}
