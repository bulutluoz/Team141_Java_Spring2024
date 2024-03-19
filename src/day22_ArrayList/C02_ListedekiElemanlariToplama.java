package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ListedekiElemanlariToplama {

    public static void main(String[] args) {

        // Verilen Integer bir listedeki
        // tum elemanlari toplayip , sonucu yazdirin

        List<Integer> list = new ArrayList<>(Arrays.asList(3,6,8,1,3,5,6));

        System.out.println(list); // [3, 6, 8, 1, 3, 5, 6]

        int toplam = 0;

        for (int i = 0; i < list.size() ; i++) {

            toplam += list.get(i);

        }

        System.out.println(toplam);

    }
}
