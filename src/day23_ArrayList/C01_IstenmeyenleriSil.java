package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_IstenmeyenleriSil {

    public static void main(String[] args) {

        //Soru 3- Verilen String bir listede
        //        istenmeyen harf iceren elementleri silip,
        //        kalan kismini list olarak bize donduren bir method olusturun

        List<String> isimler = new ArrayList<>(Arrays.asList("Seher", "Seren", "Meltem","Bekir","Sait","Hasan"));
        String istenmeyenHarf = "e";

        System.out.println(isimler); // [Seher, Seren, Meltem, Bekir, Sait, Hasan]

        System.out.println(istenmeyenHarfleriSil(isimler, istenmeyenHarf));
        // [Sait, Hasan]

    }

    public static List<String> istenmeyenHarfleriSil(List<String> isimler, String istenmeyenHarf){

        for (int i = 0; i <isimler.size() ; i++) {

            if (isimler.get(i).contains(istenmeyenHarf)){

                isimler.remove(i);
                i--;
            }
        }

        return isimler;
    }
}
