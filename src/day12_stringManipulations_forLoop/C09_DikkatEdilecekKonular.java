package day12_stringManipulations_forLoop;

public class C09_DikkatEdilecekKonular {

    public static void main(String[] args) {

        // i'ye atanan ilk deger icin
        // loop body calisma sarti false oluyorsa
        // loop body'si hic calismadan loop biter

        for (int i = 10; i <0 ; i++) {

            System.out.println(i);

        }

        // i'nin degisimi ile
        // hic bir zaman loop sarti false olmuyorsa
        // buna sonsuz loop denir

        for (int i = 0; i <10 ; i--) {

            System.out.print(i);

        }


    }
}
