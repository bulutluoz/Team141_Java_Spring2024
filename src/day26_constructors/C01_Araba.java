package day26_constructors;


public class C01_Araba {

    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    int yil = 1900;
    int fiyat;

    C01_Araba(){
        // Biz bir class'da gorunur bir constructor olusturdugumuzda
        // Java default constructor'i SILER
        // Bu durumda daha onceden default cons.'i kullanarak
        // olusturulan objeler CTE verir
        // Kodun problem yasamamasi icin
        // gorunur bir cons olusturdugumuzda
        // HEMEN default cons. yerine de
        // gorunur bir parametresiz cons. olusturmaliyiz
    }

    C01_Araba(String mrk, String mdl ,int yl , int fyt){
        marka = mrk;
        model = mdl;
        yil = yl;
        fiyat = fyt;
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
