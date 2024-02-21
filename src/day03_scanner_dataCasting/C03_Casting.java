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

        // 2- Daha genis data turundeki degeri, daha dar kapsamli variable'a atamak isterseniz
        //    Java bunu otomatik yapmaz,
        //    data kayiplari veya farkli sonuclar olabilecegi icin
        //    sorumlulugu bizim almamizi ister (Explicit Narrowing)
        //    sorumlulugu almak icin, daraltmak istediginiz degerin onune
        //    parantez icerisinde, donusturmek istediginiz data turunu yazmalisiniz

        dbl = byt1; // Auto Widening
        dbl = tamsayi; // // Auto Widening
        dbl = flt1; // Auto Widening

        flt1 = byt1;// Auto Widening
        flt1 = tamsayi;// Auto Widening
        flt1 = (float) dbl1; //Explicit Narrowing

        tamsayi = byt1;// Auto Widening
        tamsayi = (int)flt1;//Explicit Narrowing
        tamsayi = (int)dbl;//Explicit Narrowing

        byt1 = (byte)tamsayi;//Explicit Narrowing
        byt1 = (byte)flt1;//Explicit Narrowing
        byt1 = (byte)dbl;//Explicit Narrowing
    }
}
