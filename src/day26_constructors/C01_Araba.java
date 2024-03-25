package day26_constructors;


public class C01_Araba {

    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    int yil = 1900;
    int fiyat;


    @Override
    public String toString() {
        return "Araba ozellikler ==> " +
                "marka : '" + marka + '\'' +
                ", model : '" + model + '\'' +
                ", yil : " + yil +
                ", fiyat=" + fiyat;
    }
}
