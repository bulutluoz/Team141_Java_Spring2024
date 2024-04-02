package day31_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C01_LocalTime {

    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();
        // saat variable'i canli bir kronometre veya saat degil
        // 9.satirin calistigi anda, bilgisayarimizin saatini kaydeden bir variable'dir

        System.out.println(saat); // 20:35:53.806515


        for (int i = 0; i <100000000 ; i++) {
            String str = i+"";
        }

        System.out.println("saat : "+saat); // 20:35:53.806515
        // saat sabit bir variable oldugu icin islem icin sure gecse de
        // saat degeri degismez

        LocalTime bitisSaati = LocalTime.now();
        System.out.println("bitis saati : "+bitisSaati);


        LocalTime japonyaSaati = LocalTime.now(ZoneId.of("Japan"));
        System.out.println("Japonya saati : " + japonyaSaati);

        LocalTime istenenSaat = LocalTime.of(12,10,23);
        System.out.println("istenen saat : " + istenenSaat);


        // plus ve minus method'lari saate ekleme veya cikarma yapar
        System.out.println(saat.plusMinutes(267).plusHours(456)); // 01:14:15.652697

        System.out.println(saat.minusSeconds(10500)); // 17:53:03.882815

        // with method'lari saatin istedigimiz bolumune farkli deger atamamizi saglar
        System.out.println(saat.withHour(17)); // 17:49:42.902129
        System.out.println(saat.withSecond(0).withNano(0)); // 20:50

        // iki zamani karsilastirmak icin
        System.out.println(saat.isBefore(bitisSaati)); // true
        System.out.println(saat.isAfter(bitisSaati)); // false

        // get method'lari saatin istedigimiz bolumlerini bize getirir
        System.out.println(saat.getNano()); // 909363000

        // gece 00:00'dan suana kadar gecen saniye veya nanosaniyeyi verir
        System.out.println(saat.toNanoOfDay()); // 75322325181000
        System.out.println(saat.toSecondOfDay()); // 75322

        // asagidaki loop'un toplam islem suresini yazdirin

        LocalTime loopBaslangic = LocalTime.now();
        Long loopBaslangicNano = LocalTime.now().toNanoOfDay();

        for (int i = 0; i <1000000000 ; i++) {
            String str = i+"";
        }

        LocalTime loopBitis = LocalTime.now();
        Long loopBitisNano = LocalTime.now().toNanoOfDay();

        System.out.println("Loop baslangic : " + loopBaslangic);
        System.out.println("Loop bitis : " + loopBitis);

        System.out.println("Loop islem suresi nano saniye olarak : " + (loopBitisNano-loopBaslangicNano));
    }
}
