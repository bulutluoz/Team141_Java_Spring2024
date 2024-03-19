package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_IndexOf_LastIndexOf {

    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>(Arrays.asList("a","d","a","y","a","d","m"));

        System.out.println(harfler); // [a, d, a, y, a, d, m]

        // eleman <==> index

        // Eger index verip, o index'deki elemani gormek istersek

        System.out.println(harfler.get(2)); // a

        // Eger harfi verip index'ini istersek

        System.out.println(harfler.indexOf("a")); // 0

        System.out.println(harfler.lastIndexOf("a")); // 4

        System.out.println(harfler.indexOf("y")); // 3

        System.out.println(harfler.lastIndexOf("y")); // 3

        System.out.println(harfler.lastIndexOf("k")); // -1


    }
}
