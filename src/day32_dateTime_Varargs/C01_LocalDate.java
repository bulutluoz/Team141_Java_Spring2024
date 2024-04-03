package day32_dateTime_Varargs;

import java.time.LocalDate;
import java.time.Period;

public class C01_LocalDate {

    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate dogumTarihi = LocalDate.of(1990,10,23);

        System.out.println(dogumTarihi.until(bugun)); // P 33Y 5M 11D

        // verilen zamanlar arasindaki farki bir variable'a kaydetmek isterseniz
        Period yasim = dogumTarihi.until(bugun);
        System.out.println(yasim.getYears()); // 33

        System.out.println(dogumTarihi.until(bugun).getYears()); // 33

        System.out.println(bugun.lengthOfMonth()); // 30
        System.out.println(bugun.lengthOfYear()); // 366
        // verilen tarihin yilin kacinci gunu oldugunu dondurur
        System.out.println(bugun.getDayOfYear()); // 94


    }
}
