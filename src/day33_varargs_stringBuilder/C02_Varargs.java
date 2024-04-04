package day33_varargs_stringBuilder;

public class C02_Varargs {


    public static void main(String[] args) {

        method1("Ali"); // 3+0 =>3
        method1("Ilgar","Ulvi","Nuran"); // 5 + 2 => 7
        method1("a","b","c","d","e"); // 1 + 4 ==> 5


    }


    public static void method1(String s, String... t ){

        System.out.println(s.length() + t.length);
    }
}
