package day26_constructors;

public class C02_ArabaRunner {

    public static void main(String[] args) {

        C01_Araba araba1 = new C01_Araba();

        System.out.println(araba1);
        // Araba ozellikler ==> marka : 'Marka belirtilmedi', model : 'Model belirtilmedi', yil : 1900, fiyat=0


        C01_Araba araba2;

        // System.out.println(araba2.fiyat); // Variable 'araba2' might not have been initialized
        // bir constructor calismadan
        // objeye ilk deger atamasi YAPILAMAZ
        // ilk deger atamasi yapilmadan da kullanilamaz


        System.out.println(new C01_Araba().fiyat); // 0
        // esitligin sadece sag tarafi olursa
        // Constructor calistigi icin
        // class'a gidip yeni bir obje olusturup, bize getirir
        // ANCAK getirdigi objeyi kaydetmedigimiz icin
        // O Obje sadece o satir icin VAR OLUR
    }

}
