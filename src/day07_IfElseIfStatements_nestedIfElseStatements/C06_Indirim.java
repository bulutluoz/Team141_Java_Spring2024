package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C06_Indirim {

    public static void main(String[] args) {
        //Soru 3- Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa 10 urunden fazla alirsa %20, az alirsa %15 indirim yapin,
        //        Musteri karti yoksa 10 urunden fazla alirsa %15, az alirsa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Aldiginiz urun adedini giriniz...");
        int urunAdedi = scanner.nextInt();

        System.out.println("Aldiginiz urunun indirimsiz fiyatini giriniz...");
        double indirimsizFiyat = scanner.nextDouble();

        double toplamFiyat = urunAdedi*indirimsizFiyat;

        System.out.println("Musteri kartiniz var mi ? E: Evet, H:Hayir");
        char kartVarMi = scanner.next().toUpperCase().charAt(0);

        if (kartVarMi=='E' && urunAdedi >10){
            System.out.println("%20 indirimli toplam fiyat : " + toplamFiyat*80/100);
        } else if (kartVarMi == 'E' ) { // && urunAdedi<=10  intelliJ yazmamizi gereksiz gordu
            System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat*85/100);
        } else if (kartVarMi == 'H' && urunAdedi>10) {
            System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat*85/100);
        } else if (kartVarMi == 'H' ) {// && urunAdedi <=10
            System.out.println("%10 indirimli toplam fiyat : " + toplamFiyat*90/100);
        }else{
            System.out.println("Bilgileri kontrol edip, yeniden deneyiniz");
        }


    }
}
