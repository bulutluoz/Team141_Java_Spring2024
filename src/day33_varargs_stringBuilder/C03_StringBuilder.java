package day33_varargs_stringBuilder;

public class C03_StringBuilder {

    public static void main(String[] args) {

        String str = "String guzeldir";

        String s = new String("String non primitive'dir");

        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.length()); // 0
        System.out.println(sb1.capacity()); // 16


        StringBuilder sb2 = new StringBuilder("Deneme");
        System.out.println(sb2.length()); // 6
        System.out.println(sb2.capacity()); // 16+6 =>22


        StringBuilder sb3 = new StringBuilder(7); // 7 karakter alabilen
        System.out.println(sb3.length()); // 0
        System.out.println(sb3.capacity()); // 7
    }
}
