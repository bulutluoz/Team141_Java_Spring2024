package day03_scanner_dataCasting;

public class C03_Casting {
    public static void main(String[] args) {

        boolean bl1 = true;
        char chr1 = '$';
        byte byt1 = 23;
        int tamsayi = 20;
        float flt1 = 45.2f;
        double dbl = 44.1;
        String str = "Java Candir";


        // Bir data turundeki bir variable'a
        // baska data turunden deger atamaya denir

        int sayi = 20;

        double dbl1 = sayi;

        System.out.println(dbl1); // 20.0

        // Bazi data turlerine baska turden deger atayamazsiniz
        // bl1 = str;
        // bl1 = chr1;
        // bl1 = dbl1;

        // str = tamsayi;
        // str = chr1;
        // str = dbl;


        // Sayi barindiran variable data turleri arasinda gecis olabilir
        // Ancak her data turundeki deger, her data turune ATANAMAZ

        // 1- Kucuk data turundeki deger, buyuk data turundeki variable'a atanirsa
        //    java bunu otomatik olarak yapar (Auto Widening)

        dbl = byt1;
        dbl = tamsayi;
        dbl = flt1;

        flt1 = byt1;
        flt1 = tamsayi;
        //flt1 = dbl1;

        tamsayi = byt1;
        //tamsayi = flt1;
        //tamsayi = dbl;

        //byt1 = tamsayi;
        //byt1 = flt1;
        //byt1 = dbl;
    }
}
