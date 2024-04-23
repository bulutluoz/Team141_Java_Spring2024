package day42_interfaces;

public class C_ChildOf2Interfaces implements B_ParentInterface02{

   // parent'i olan tum abstract yapilardaki
   // concrete olmayan method'lari
   // implement etmek ZORUNDADIR


  public void method1(){

  }


  public String method2(){

    return null;
  }

  public String method3(){
    // bir class birden fazla parent edinirse
    // (bir class ve/veya istedigi kadar interface)
    // ve bu parent'larda ayni isimde method'lar varsa
    // - parent class'lardaki ayni isimde olan method'larin
    //   return type'lari ayni ise sorun olmaz
    // - return type'lari farkli ise iki parent'i da mutlu etme sansi olmadigindan
    //   ya parent'lardan birinden vazgecmelisiniz
    //   ya da parent'larda degisiklik yapmalisiniz

    // parent edilnilen interface'lerde degisiklik yapmak
    // o interface'i daha once implement eden pek cok class'da
    // degisikliklere sebep olacagindan
    // ZORUNLU KALMADIKCA tercih edilmez

    return null;
  }

  public int method4(){
    return 8;
  }























}
