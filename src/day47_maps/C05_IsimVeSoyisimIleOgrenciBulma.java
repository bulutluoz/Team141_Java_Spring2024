package day47_maps;

public class C05_IsimVeSoyisimIleOgrenciBulma extends OgrenciMapClass{

    public static void main(String[] args) {

        mapeOgrenciEkle();

        // verilen isim ve soyisimdeki tum ogrencilerin
        // numara, sinif, sube bilgilerini yazdirin
        // Orn input : Veli Cem , output : 102 10 K

        isimVeSoyisimIleOgrenciBulma("veli","CEM"); // 102 10 K

        // isim soyismi Ali Can olan ogrenci bilgileri

        isimVeSoyisimIleOgrenciBulma("Ali","Can"); // 101 11 H

        // isim soyismi Seren Ganbarov olan ogrenci bilgileri

        isimVeSoyisimIleOgrenciBulma("Seren","Ganbarov"); // bos satir

        // bu method'a aranan isim soyisme uygun kimse bulunamazsa
        // verilen isimde kimse yok yazdirsin


    }
}
