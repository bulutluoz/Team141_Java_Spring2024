package day19_arrays;

public class C05_ElemanArama {

    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //        ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {3,5,6,2,3,6,7,9,6,5,4,9,3,4,5};

        // bu array'de 4 var mi ve varsa kac tane ?
        elemanVarMi(arr,3); // Aranan sayi array'de 3 adet kullanilmistir

        elemanVarMi(arr,8); // Aranan eleman array'de yok

    }

    public static void elemanVarMi(int[] arr , int arananSayi){

        int bulunanAdet = 0 ;


        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] == arananSayi){
                bulunanAdet++;
            }
        }


        if (bulunanAdet == 0 ){
            System.out.println("Aranan eleman array'de yok");
        }else {
            System.out.println("Aranan sayi array'de " + bulunanAdet + " adet kullanilmistir");
        }


    }
}
