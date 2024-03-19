package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_TekrarsizHaleGetirme {

    public static void main(String[] args) {

        //Soru 1- Verilen bir array’de
        //        tekrar eden elementler icin,
        //        mukerrer olanlari silip,
        //        tum elemanlardan sadece 1 tane yapip
        //        array'i bize dondurecek bir method olusturun

        int[] arr = {3,5,3,5,6,5,3,4,6,5,2,3,6,4,3,7};
        arr = uniqueHaleGetir(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] uniqueHaleGetir(int[] arr){

        List<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (!uniqueList.contains(arr[i])){

                uniqueList.add(arr[i]);
            }
        } // UniqueList : [3, 5, 6, 4, 2]

        // biz listeyi unique olarak olusturduk
        // simdi array'i listedeki elementlerin oldugu hale donusturmeliyiz

        int[] yeniArr = new int[uniqueList.size()]; // [0, 0, 0, 0, 0]


        for (int i = 0; i < yeniArr.length ; i++) {

            yeniArr[i] = uniqueList.get(i);
        }

        arr = yeniArr;

        return arr;
    }
}
