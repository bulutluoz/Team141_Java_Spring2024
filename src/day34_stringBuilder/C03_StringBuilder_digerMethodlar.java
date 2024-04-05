package day34_stringBuilder;

public class C03_StringBuilder_digerMethodlar {

    public static void main(String[] args) {

        // Bize StringBuilder dondurmeyen method'lar
        // StringBuilder'da kalici degisiklik yapmaz

        StringBuilder sb = new StringBuilder("Java Candir");

        System.out.println(sb.indexOf("a")); // 1

        System.out.println(sb); // Java Candir

        System.out.println(sb.substring(2, 4)); // va

        System.out.println(sb); // Java Candir

        System.out.println(sb.charAt(0)); // J

        System.out.println(sb); // Java Candir

        // Eger StringBuilder'da olmayan fakat String'de olan bir method'u kullanmak isterseniz
        // once toString() ile StringBuilder'i String'e cevirip, sonra String method'larini kullanabiliriz
        // Bu yontem ile yapilan degisiklikler KALICI OLMAZ

        // sb Can icerir mi ?
        System.out.println(sb.toString().contains("Can")); // true

        // sb Java ile mi basliyor?
        System.out.println(sb.toString().startsWith("Java")); // true

        // sb'yi buyuk harfe cevirin

        // sb = sb.toString().toUpperCase();

        sb = new StringBuilder(sb.toString().toUpperCase());

        System.out.println(sb); // JAVA CANDIR


    }
}
