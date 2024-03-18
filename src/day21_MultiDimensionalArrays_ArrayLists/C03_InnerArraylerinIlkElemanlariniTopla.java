package day21_MultiDimensionalArrays_ArrayLists;

public class C03_InnerArraylerinIlkElemanlariniTopla {

    public static void main(String[] args) {

        //Soru 1- Verilen 2 katli bir array’de
        //       her bir inner array'deki 0. index'de bulunan sayilari toplayip,
        //       sonucu yazdiran bir method olusturun.

        int[][] arr = {{3,6},{1,6,9},{8,0,2,1},{4}};

        ilkElemanlarinToplami(arr); // Ilk elementlerin toplami : 16
    }


    public static void ilkElemanlarinToplami( int[][] arr ){

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            toplam += arr[i][0];
        }

        System.out.println("Ilk elementlerin toplami : " + toplam);
    }

}
