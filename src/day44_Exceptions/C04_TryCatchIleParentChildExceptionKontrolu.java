package day44_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_TryCatchIleParentChildExceptionKontrolu {

    public static void main(String[] args) {


        // Tek try multiple catch yapalim


        try {
            // deneme.txt dosyasindaki bilgilere ulasalim

            String dosyaYolu = "src/day44_Exceptions/deneme.txt";

            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

            // dosyadaki yazilari konsolda yazdirin

            int k=0;
            while((k= fileInputStream.read() ) != (-1)) { // dosyayi okuyup, bize getirme
                // Unhandled exception: java.io.IOException
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya yolu hatali, dosya bulunamadi");

        } catch (IOException e){
            System.out.println("Dosya Input/Output sorunu var");
        }


        // 2- Tek try - kapsamli tek catch

        try {
            // deneme.txt dosyasindaki bilgilere ulasalim

            String dosyaYolu = "src/day44_Exceptions/deneme.txt";

            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

            // dosyadaki yazilari konsolda yazdirin

            int k=0;
            while((k= fileInputStream.read() ) != (-1)) { // dosyayi okuyup, bize getirme
                // Unhandled exception: java.io.IOException
                System.out.print((char) k);
            }
        } catch (IOException e) {
            System.out.println("Dosya yolu hatali, dosya bulunamadi");

        }
    }
}
