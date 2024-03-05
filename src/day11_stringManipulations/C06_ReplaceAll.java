package day11_stringManipulations;

public class C06_ReplaceAll {

    public static void main(String[] args) {

        // verilen String'deki tum ozel karakterleri,
        // sayilari ve yanyana birdenfazla olan space'leri temizleyin
        // ornek  input : J10a6%v*a     C^7an@90dir
        //        output: Java Candir

        String input = "J10a6%v*a++000     C^7___an_@90###90dir";

        // birden fazla olan space'leri tek space'e indirelim
        input = input.replaceAll("\\s+" , " ");

        // tum sayilari yok edelim
        input = input.replaceAll("\\d","");

        // space'i koruma altina almak icin
        // space yerine hic kullanilmayan bir karakter atayalim
        input = input.replaceAll("\\s", "5");

        // ozel karakterleri de yok edelim
        // dedigimizde space de gidiyor
        input = input.replaceAll("\\W" , ""); // harfler,rakamlar ve _ disindaki hersey

        // W _'yi kapsamadigindan, _'yi ozel olarak yok etmemiz lazim
        input= input.replace("_","");


        // space yerine atadigimiz 5'i eski haline dondurelim
        input = input.replaceAll("5"," ");

        System.out.println(input);

    }
}
