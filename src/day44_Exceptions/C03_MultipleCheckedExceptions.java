package day44_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_MultipleCheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        // deneme.txt dosyasindaki bilgilere ulasalim

        String dosyaYolu = "src/day44_Exceptions/deneme.txt";

        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

        // dosyadaki yazilari konsolda yazdirin

        int k=0;
        while((k= fileInputStream.read() ) != (-1)) { // dosyayi okuyup, bize getirme
            // Unhandled exception: java.io.IOException
            System.out.print((char) k);
        }


    }
}
