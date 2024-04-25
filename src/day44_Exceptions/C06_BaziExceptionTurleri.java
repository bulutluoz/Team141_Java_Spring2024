package day44_Exceptions;

public class C06_BaziExceptionTurleri {

    public static void main(String[] args) {

        // 1 - NullPointerException
        // non-primitive bir variable null olarak isaretlendiginde
        // bir method ile o variable'i kullanmak istersek
        // Java NullPointerException firlatir

        String  str = null; // str'a deger atanmamis, null olarak isaretlenmistir

        System.out.println(str); // null

        // System.out.println(str.length()); // NullPointerException
        // System.out.println(str.substring(1)); // NullPointerException
        // System.out.println(str.startsWith("n")); // NullPointerException

        // 2- StringIndexOutOfBoundsException
        // 3- ArrayIndexOutOfBoundsException
        // bir String veya array'de index ile islem yaparken
        // olmayan bir index kullanilmak istenirse
        // Java bu exception'lari firlatir

        // 4 - InputMissmatchException
        // Scanner ile bir deger alirken, aldigimiz deger ile kullandigimiz method
        // uyumlu degilse olusur

        // 5- FileNotFoundException : dosya bulunamdi
        // 6- IOException : dosya okuma veya yazma ile ilgili genel exception

        // 7- ArithmeticException : matematiksel islemlerde karsilasilir
        // 8- RunTimeException : Run time'da ortaya cikan tum exception'larin parent'i
        // 9- Exception : tum exception'larin parent'i

        // 10 - NumberFormatException
        String sayiStr = "23#";
        // int sayi = Integer.parseInt(sayiStr) * 2; // NumberFormatException


        // 11- ClassCastException : class'lari birbirine cevirirken olusur
        String a = "Java";

        // Integer b = a ; // Required type: Integer   Provided:String

        Object obj = a;  // Object String'in parent'i oldugundan kabul eder
        Integer b = (Integer) obj; // direk kabul etmez, ama Integer Object'nin child'i oldugundan cast edilebilir
        System.out.println(b);

    }
}
