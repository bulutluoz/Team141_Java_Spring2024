package day21_MultiDimensionalArrays_ArrayLists;

public class C02_CiftSayilarinToplami {

    public static void main(String[] args) {

        //Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip,
        //        sonucu yazdiran bir method olusturun.

        int[][] arr = {{3,6},{1,6,9},{8,0,2,1},{4}};
        ciftsayilariTopla(arr);
    }


    public static void ciftsayilariTopla(int[][] arr ){


        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) { // outer array

            for (int j = 0; j <arr[i].length ; j++) { // inner array

                if ( arr[i][j] % 2 == 0 ){
                    toplam += arr[i][j];
                }

            }

        }
        System.out.println("Array'deki cift sayilarin toplami : " + toplam);
        // Array'deki cift sayilarin toplami : 26
    }
}
