package day44_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_CheckedExceptionsVeThrowsKeyword {


    public static void main(String[] args) throws FileNotFoundException {

        // Java bilgisayarimizdaki dosyalara erisim icin FileInputStream class'ini olusturmustur

        String dosyaYolu = "src/day44_Exceptions/deneme1111.txt";

        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

        //  Unhandled exception: java.io.FileNotFoundException

        /*

            CheckedException, java'nin daha kod yazilirken farkina vardigi exception'lardir

            Bir checked exception ile karsilastigimizda iki alternatifimiz olur

            1- Try-Catch ile kodu sarmalayip,
               exception'i handle etme (exception olustugunda javaya ne yapmasi gerektigini soyleme)
               boylece kod calismaya devam edecektir

            2- Eger boyle bir sorunla karsilastiginda yoluna devam etmesini istemiyorsak
               exception firlatmasini istiyorsak
               yani kodun bu haliyle calismasini istiyorsak
               java'ya sorumlulugun bizde oldugunu soylemek
               ve bu kodu sonradan inceleyecek olanlari exception konusunda uyarmak icin
               method deklarasyonunan "throws" keyword'u ile
               olusacak exception turunu yazariz
         */



    }
}
