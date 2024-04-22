package day41_abstractClasses_Interfaces;

public abstract class C04_AbstractParent extends C03_AbstractGrandParent{
    // bir class abstract yapildiginda
    // child class'lari bazi method'lari uyarlamaya
    // ZORUNLU KILMAK icin olusturulur

    // bir abstract class parent'i olan abstract class'lardaki
    // abstract method'lari kendisine uyarlamak ZORUNDA DEGILDIR
    // isterse kendisine uyarlayabilir,
    // isterse uyarlamadan yeni concrete veya abstract method'lar ekleyebilir

    public void method1(){
        System.out.println("Parent method1");
    }

    public abstract void method5();


    public int method6(){
        return 0;
    }


}
