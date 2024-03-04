package day11_stringManipulations;

public class C04_NullPointer {

    public static void main(String[] args) {

        String str1;

        // System.out.println(str1); // Variable 'str1' might not have been initialized

        // Main method icinde olusturulan bir String'e
        // deger atamadan kullanamazsiniz



        // Sirf yazdirabilmek icin "" atasak

        String str2 = "";
        System.out.println(str2); // bos bir satir yazdirir

        // bu durumda yazdirabiliriz ama
        // hiclik de olsa bu variable'a bir deger atandigindan
        // Java bu variable'i bos olarak kabul etmez



        // Java deger atamadan da variable'lari kullanabilmemiz icin
        // Null Pointer'i olusturmustur.
        // Null Pointer bir deger degil isaretcidir
        // str3'un bir degerinin olmadigini isaretler
        // ve str3'u yazdirmak istedigimizde onun null olarak isaretlendigini yazdirir
        // yazdirmak disinda hic bir String method'unu calistiramazsiniz
        // calistirmak isterseniz NullPointerException verir

        String str3 = null ;

        System.out.println(str3); // null

        String str4 = "Java";

        System.out.println(str3 + str4); // nullJava

        // System.out.println(str3.length()); // NullPointerException

        // System.out.println(str3.isEmpty()); // NullPointerException

        str3 = "Seren";
        System.out.println(str3); // Seren
        System.out.println(str3.length()); // 5
        System.out.println(str3.isEmpty()); // false
    }
}
