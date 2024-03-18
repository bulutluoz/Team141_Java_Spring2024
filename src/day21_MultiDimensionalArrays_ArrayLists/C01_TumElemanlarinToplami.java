package day21_MultiDimensionalArrays_ArrayLists;

public class C01_TumElemanlarinToplami {

    public static void main(String[] args) {

        // Verilen iki katli integer bir array'deki
        // tum sayilarin toplamini yazdiran bir method olusturun

        int[][] arr = {{3,6},{1,6,9},{8,0,2,1},{4}};

        elemanlarinToplaminiYazdir(arr); // Verilen array'deki elementlerin toplami : 40
    }

    public static void elemanlarinToplaminiYazdir(int[][] arr){

        // Eger hic bir sart olmaksizin
        // 2 katli array'deki tum elementlere ulasmak isterseniz
        // 2 katli nested bir loop olusturmaliyiz
        int toplam =0;

        for (int i = 0; i < arr.length ; i++) { // outer arr'yi kontrol eder

            for (int j = 0; j < arr[i].length ; j++) { // herbir inner array'i kontrol eder

                toplam += arr[i][j];
            }
        }

        System.out.println("Verilen array'deki elementlerin toplami : " + toplam);

    }
}
