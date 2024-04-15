package day36_encapsulation_inheritance;

public class C05_EncapsuleClass {
    /*
        1- Satis elemanlari, satis tutarina atama yapabilsin
           bu atanan satislar, otomatik olarak toplam satisa eklensin
           ama satis tutarina son atanan degeri, satis gorevlileri goremesin
        2- toplam satis tutari olarak hesaplanan deger
           herkes tarafindan gorulebilsin
           ama kimse toplam satis tutarina deger atayamasin

     */

    private int satisTutari; // setter
    private int toplamSatisMiktari; // getter

    private int encapsuleSayi;
    // hem getter hem setter

    public int publicsayi;

    /*
        Encapsulation bir mecburiyet degil,
        bize yardimci olmak icin Java'nin hazirladigi bir yontemdir

        EGER bir class uyesi icin READ ve WRITE yetkilerini ayirmak isterseniz
        ENCAPSULATION kullanabilirsiniz

        1- Adindan da anlasilacagi gibi
           once bu yetkileri ayirmak istedigimiz variable'lara
           normal yollarla erisimi ENGELLEMELISINIZ

        2- Sadece deger atamasi(WRITE) yapilmasini istedigimiz
           variable'lar icin SETTER
           Sadece gorunmesini (READ) istedigimiz
           variable'lar icin ise GETTER
           method'lari olusturalim
     */

    public int getToplamSatisMiktari() {
        return toplamSatisMiktari;
    }

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisMiktari+= satisTutari;
    }

    public int getEncapsuleSayi() {
        return encapsuleSayi;
    }

    public void setEncapsuleSayi(int encapsuleSayi) {
        this.encapsuleSayi = encapsuleSayi;
    }
}
