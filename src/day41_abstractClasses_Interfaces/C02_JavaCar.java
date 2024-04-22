package day41_abstractClasses_Interfaces;

public class C02_JavaCar extends C01_AbstractCar{


    @Override
    public void motor() {
        System.out.println("JavaCar motor");
    }

    @Override
    public void yakit() {
        System.out.println("JavaCar yakit");
    }

    @Override
    public void sanzuman() {
        // parent abstract class'daki
        // abstract method'lari child class'a
        // IMPLEMENT (uyarlama) etmek zorundayiz
        System.out.println("JavaCar sanzuman");
    }

    public void sunroof(){
        // parent class'daki concrete method'lar ise
        // child class'lar tarafindan IMPLEMENT edilmek ZORUNDA DEGILDIR
        // child class isterse parent class'daki concrete method'u direk kullanir
        // isterse @override edip kendisine uyarlar
        System.out.println("JavaCar sunroof");
    }
}
