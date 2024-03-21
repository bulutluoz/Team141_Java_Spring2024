package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ForEachLoop {

    public static void main(String[] args) {

        //Soru 1- Verilen bir array’de
        //        tekrar eden elementler icin, mukerrer olanlari silip,
        //        tum elemanlardan  sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.

        int[] arr = {3,3,4,4,5,4,3,2,3,6,5,4,3,2};

        List<Integer> benzersizList = new ArrayList<>();

        for ( int each : arr
             ) {
            if (!benzersizList.contains(each)){
                benzersizList.add(each);
            }

        }

        System.out.println(benzersizList); // [3, 4, 5, 2, 6]

        // array'den eleman silemedigimiz icin
        // istedigimiz elementlere sahip yeni bir array olusturalim

        arr = new int[benzersizList.size()]; // [0, 0, 0, 0, 0]

        // array'e index olmadan atama yapamayacagimiz icin
        // for loop kullanalim

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = benzersizList.get(i);
        }

        System.out.println("array'in son hali : " + Arrays.toString(arr));












    }
}
