package day41_abstractClasses_Interfaces;

import java.util.ArrayList;
import java.util.List;

public interface I08_Interface {

    public static final int SAYI = 10;
    public int A = 5;  // Modifier 'public' is redundant for interface members
    static int B = 13; // Modifier 'static' is redundant for interface fields
    final int C = 34; // Modifier 'final' is redundant for interface fields

    // bir interface icerisinde olan tum variable'lar
    // public, static ve final'dir
    // bu keyword'ler yazilsa da yazilmasa da farketmez

    int D = 23; // yazilmasa da d variable'i final static ve public'dir

    //private int e = 24; // Modifier 'private' not allowed here

    // interface icindeki tum variable'lar final olduklarindan
    // sonradan degeri degistirilemez
    // bundan dolayi deger atanmadan variable olusturulmasina izin verilmez
    // int e;


    // static final variable'lar icin buyuk harf ile isim verilir


    public abstract void method1();
    public void method2(); // Modifier 'public' is redundant for interface members
    abstract void method3(); // Modifier 'abstract' is redundant for interface methods

    // Interface'de olusturulan method'lar public ve abstract'tir
    // yazsak da yazmasak da farketmez

    List<Integer> sayilar = new ArrayList<>();
    // public class ArrayList<E> extends AbstractList<E>
    //        implements List<E>, RandomAccess, Cloneable, java.io.Serializable
    // Bir class sadece bir class'a extends edebilir
    // ANCAK istedigi kadar interface'i IMPLEMENT edebilir

}
