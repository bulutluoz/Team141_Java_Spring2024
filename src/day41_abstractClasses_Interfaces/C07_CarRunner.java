package day41_abstractClasses_Interfaces;

import java.util.ArrayList;
import java.util.List;

public class C07_CarRunner {

    public static void main(String[] args) {

        // Abstract class'lar class olduklari icin
        // constructorlari vardir AMA
        // abstract class'larda abstract method'lar oldugundan
        // abstract class'lardan OBJE OLUSTURULAMAZ

        // Data turu olarak abstract class'lar secilebilir
        // ancak contructor olarak concrete olan bir child class secilmelidir

        /*
        C01_AbstractCar car1 = new C01_AbstractCar();

        car1.geriGoruskamerasi();
        // Arabalar isterse geri gorus kamerasi kullanabilir

        car1.motor();
        car1.sanzuman();

         */

        C01_AbstractCar car1 = new C02_JavaCar();

        car1.geriGoruskamerasi();
        // Arabalar isterse geri gorus kamerasi kullanabilir
        car1.motor(); // JavaCar motor
        car1.sanzuman(); // JavaCar sanzuman



    }
}







