package day44_Exceptions;

public class C05_CatchBloktakiEninGorevi {

    public static void main(String[] args) {

        /*
            try blogu icindeki kodlarda bir exception olusursa
            ve olusan exception catch blogunda yazan exception turu ile uyumlu ise
            olusan exception catch blogunda yakalanir
            ve hata e objesine kaydedilir
            e ismi mecburi degildir , farkli isimler de verilebilir ama genelde e kullanilir
            catch blogu icerisinde kendi istedigimiz bir kodu calistirabilecegimiz gibi
            e objesinde kaydedilmis olan bilgileri de kullanabiliriz
         */

        int a = 20;
        int b = 0;

        try {
            System.out.println(a/b);

        } catch (ArithmeticException e) {

            // System.out.println("Bolecek sayi 0 olamaz");
            // System.out.println(e.getMessage()); //      / by zero
            // e.printStackTrace();
            // kod normal calisip bitti, ama tum hatayi konsola yazdirdi
            //java.lang.ArithmeticException: / by zero
            //	at day44_Exceptions.C05_CatchBloktakiEninGorevi.main(C05_CatchBloktakiEninGorevi.java:21)
            //System.out.println(e.toString());
            //java.lang.ArithmeticException: / by zero
            System.out.println(e.getCause()); // null
        }


    }
}
