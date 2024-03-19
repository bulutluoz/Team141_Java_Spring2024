package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ListRemoveMethodu {

    public static void main(String[] args) {

        List<String > harfler = new ArrayList<>(Arrays.asList("a","r","a","t","a","s"));

        // remove(istenenObject) ==> listede varsa siler ve liste degisir
        //                           listede yoksa silemez, liste de degismez
        System.out.println(harfler); // [a, r, a, t, a, s]

        harfler.remove("a");

        System.out.println(harfler); // [r, a, t, a, s]

        harfler.remove("x");

        System.out.println(harfler); // [r, a, t, a, s]

        // remove method'u calistiginda asil amaci olan silme islemini yapar
        // delil olarak da sildi ise true, bulamadi ise false dondurur
        System.out.println(harfler.remove("s")); // true

        System.out.println(harfler); // [r, a, t, a]

        System.out.println(harfler.remove("y")); // false





    }
}
