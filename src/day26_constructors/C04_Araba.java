package day26_constructors;

public class C04_Araba {

    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    int yil = 1900;
    int fiyat;

    /*
        EGER
        Constructor icinde instance variable'lara atama yapmak istersek
        constructor'a parametre yazabiliriz

        - parametre isimleri instance variable isimlerinden farkli ise
          marka = mrk
          bu atamada mrk'nin parametre, model'in ise instance variable oldugu
          acikca belli oldugundan java ekstra bilgiye ihtiyac duymaz

        - parametre isimleri ile instance variable isimleri ayni ise
          marka = marka
          bu atama anlamsiz olur
          icinde oldugumuz scope'da marka variable oldugundan
          Java class level'daki instance varible'lara bakmaz

          Objeye ait(instance) marka'yi belirtmek icin
          this. kullanilmalidir

          this. kullanildiginda
          java icinde bulundugumuz scope'a bakmadan
          direk class level'a bakar
     */


    C04_Araba(){

    }

    C04_Araba(String mrk , int fyt){
        marka = mrk;
        fiyat= fyt;
    }

    public C04_Araba(String marka, String model, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Araba ozellikler ==> " +
                "marka : '" + marka + '\'' +
                ", model : '" + model + '\'' +
                ", yil : " + yil +
                ", fiyat=" + fiyat;
    }
}
