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
    }
}
