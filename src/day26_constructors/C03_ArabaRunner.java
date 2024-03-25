package day26_constructors;

public class C03_ArabaRunner {

    public static void main(String[] args) {

        C01_Araba araba1 = new C01_Araba();
        araba1.marka = "BMW";
        araba1.model = "5.20";
        araba1.yil = 2001;
        araba1.fiyat = 4000;

        System.out.println(araba1);
        // Araba ozellikler ==> marka : 'BMW', model : '5.20', yil : 2001, fiyat=4000


        C01_Araba araba2 = new C01_Araba("Tofas","Sahin",1990,150000);
        System.out.println(araba2);
        // Araba ozellikler ==> marka : 'Tofas', model : 'Sahin', yil : 1990, fiyat=150000

        C01_Araba araba3 = new C01_Araba("Nissan","Note",2020,20000);
        System.out.println(araba3);
        // Araba ozellikler ==> marka : 'Nissan', model : 'Note', yil : 2020, fiyat=20000


        C01_Araba araba4 = new C01_Araba("Opel","Corsa",2010,4500);

        /*
        Bir obje olusturuldugunda
        ya class'daki standart ozelliklere sahip olur
        ve sonradan tek tek bu ozelliklere deger atamasi yapilir
        araba1 gibi

        Ya da
        tasimasini istedigimiz ozellikler
        parametre olarak constructor'a yollanip
        constructor icerisinde atamalar yapilir
        boylece objenin olusturuldugu satirda
        istedigimiz ozelliklere sahip bir obje olusmus olur

     */



    }


}
