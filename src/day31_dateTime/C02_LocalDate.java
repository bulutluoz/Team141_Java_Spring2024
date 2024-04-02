package day31_dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class C02_LocalDate {

    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        System.out.println(tarih); // 2024-04-02

        // Japanya'daki tarihi yazdiralim

        LocalDate japaonyaTarih = LocalDate.now(ZoneId.of("Japan"));
        System.out.println("Japonya tarih : " + japaonyaTarih); // 2024-04-03

        // istenen tarihi olusturma

        LocalDate dogumtarihi1 = LocalDate.of(1995,10,23);
        LocalDate dogumtarihi2 = LocalDate.of(1995, Month.OCTOBER,20);

        System.out.println(tarih.plusYears(5).plusMonths(7).plusDays(10));
        // 2029-11-12

        // verilen iki dogum tarihinden eski olani yazdirin

        System.out.println(dogumtarihi1.isBefore(dogumtarihi2) ? dogumtarihi1 : dogumtarihi2); // 1995-10-20

        // verilen yilin artik yil olup olmadigini yazdirin

        System.out.println(dogumtarihi1.isLeapYear()); // false

    }
}
