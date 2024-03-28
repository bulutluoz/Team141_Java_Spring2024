package day29_passByValue;

public class C01_StaticBlocks {

    /*
        static bloklar tum method'lardan ve kod bloklarindan once calisir
        (main method'dan bile once calisir)

        class calismaya baslamadan yapilmasi gereken
        herhangi bir islem varsa
        static block'lar kullanilabilir

        Eger birden fazla static block varsa
        kendi iclerinde ustteki blok daha once calisir
     */

    C01_StaticBlocks(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {

        System.out.println("main method calisti");

        C01_StaticBlocks obj = new C01_StaticBlocks();

    }

    public static void method1(){
        System.out.println("method1 calisti");
    }

    static {
        System.out.println("static block1 calisti");
    }

    static {
        System.out.println("static block2 calisti");
    }
}
