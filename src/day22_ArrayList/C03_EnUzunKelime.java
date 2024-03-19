package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_EnUzunKelime {

    public static void main(String[] args) {

        // Verilen bir String List'deki
        // en uzun kelimeyi yazdirin
        // en uzun kelimenin harf sayisina esit,
        // birden fazla kelime varsa en sonuncuyu yazdirin

        List<String> isimler =
                new ArrayList<>(Arrays.asList("Seher","Sumeyra","Meltem","Ramazan","Mustafa"));

        System.out.println(isimler); // [Seher, Sumeyra, Meltem, Ramazan]

        String enUzunKelime = isimler.get(0);

        for (int i = 0; i <isimler.size() ; i++) {

            if (isimler.get(i).length() >= enUzunKelime.length()){
                enUzunKelime = isimler.get(i);
            }
        }

        System.out.println(enUzunKelime);

    }
}
