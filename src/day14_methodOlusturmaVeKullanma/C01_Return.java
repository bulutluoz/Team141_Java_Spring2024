package day14_methodOlusturmaVeKullanma;

public class C01_Return {

    public static void main(String[] args) {

        /*
            Her method bir is yapmak icin olusturulur
            Biz method'larin yaptiklari islem sonucunda
            bize ne döndürdüklerine bakariz

            method'larin islem sonucu, verilen parametrelere gore degisecegi icin
            return kelimesi daha cok data turunu belirtir

         */

        String str = "Java kolaydir";


        System.out.println(str.substring(3)); // a kolaydir

        System.out.println(str.indexOf("a")); // 1 int

        System.out.println(str.indexOf("x")); // -1

        System.out.println(str.contains("Java")); // true

        str.substring(7);  // bu bir sey yazdirmadi
        // substring method'u bize String dondurur
        // 28.satirdaki kod calisir ve bize "laydir" return eder
        // ancak donen "laydir"'i biz hicbir islem yapmadigimiz icin goremeyiz

        // bize sonuc return eden bir method kullandigimizda,
        // sonucu kullanmak icin 2 alternatifimiz var

        // 1- direk yazdirip konsolda sonucu gorebiliriz
        System.out.println(str.substring(7)); // laydir

        // 2- gorevde yazdirmamiz istenmiyorsa
        //    ilerde kullanilmak uzere bir variable'a kaydedebiliriz

        String strinIlkYarisi = str.substring(0,str.length()/2);

        System.out.println(strinIlkYarisi); // Java k


        System.out.println(str.substring(6));

    }
}
