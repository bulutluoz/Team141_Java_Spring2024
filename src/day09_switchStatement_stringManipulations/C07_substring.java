package day09_switchStatement_stringManipulations;

public class C07_substring {

    public static void main(String[] args) {

        String str = "Java guzeldir";  // length yani karakter sayisi 13

        System.out.println(str.substring(2)); // va guzeldir

        System.out.println(str.substring(0)); // Java guzeldir

        System.out.println(str.substring( str.length()-1   )); // r

        System.out.println(str.length()); // 13 , son index 12

        System.out.println(str.substring(13)); // "" verir, bos satir yazdirir

        // System.out.println(str.substring(  str.length()+1  ));
        // StringIndexOutOfBoundsException
        // length()-1   son index'deki harfi verir
        // length()     son harften sonraki hicligi yazdirir
        // length()+1 ve daha buyuk sayilar StringIndexOutOfBoundsException


        // System.out.println(str.substring(-3)); // StringIndexOutOfBoundsException


        // son 3 harfi yazdirin

        System.out.println(str.substring(str.length() - 3)); // dir

    }
}
