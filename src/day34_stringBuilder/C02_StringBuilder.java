package day34_stringBuilder;

public class C02_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.insert(2,"t");

        System.out.println(sb); // Jatva

        String str = "Candir";
        sb.insert(3,str,0,4);

        System.out.println(sb);// JatCandva

        sb.delete(3,6);

        System.out.println(sb);// Jatdva

        sb.deleteCharAt(2);

        System.out.println(sb);// Jadva

        System.out.println(sb.deleteCharAt(2)); // Java
        System.out.println(sb);// Java

        sb.replace(2,4,"ka Candir");

        System.out.println(sb);// Jaka Candir

        System.out.println(sb.replace(2, 3, "v")); // Java Candir

        System.out.println(sb.reverse());  // ridnaC avaJ

        System.out.println(sb); // ridnaC avaJ

        sb.reverse();

        System.out.println(sb); // Java Candir


    }
}
