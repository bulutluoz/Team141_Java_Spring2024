package day38_inheritance;

public class C06_Runner {

    public static void main(String[] args) {

        C05_AvciKuslar kartalAvKus = new C05_AvciKuslar();
        System.out.println(kartalAvKus.omur); // H Yasar ve olurler

        System.out.println(kartalAvKus.solunum); // K Akcigerle
        System.out.println(kartalAvKus.cogalma); // K Yumurtayla
        System.out.println(kartalAvKus.kanat); // K Kanatlidir

        System.out.println(kartalAvKus.hareket); // AvK Ucarlar
        System.out.println(kartalAvKus.beslenme); // AvK etle beslenir
        System.out.println(kartalAvKus.gaga); // AvK Sivri gagalidir
        System.out.println(kartalAvKus.pence); // AvK Pencelidir

        System.out.println("====================");

        C04_Kuslar kartalKus = new C05_AvciKuslar();
        // Kuslar class'indaki Kartalin ozellikleri
        System.out.println(kartalKus.omur); // H Yasar ve olurler

        System.out.println(kartalKus.solunum); // K Akcigerle
        System.out.println(kartalKus.cogalma); // K Yumurtayla
        System.out.println(kartalKus.kanat); // K Kanatlidir

        System.out.println(kartalKus.hareket); // H hareket eder
        System.out.println(kartalKus.beslenme); // H beslenirler
        System.out.println(kartalKus.gaga); // K gagalidir
        // System.out.println(kartalKus.pence); // CTE kuslar veya hayvanlarda yok


        System.out.println("====================");

        C03_Hayvanlar kartalHayvan = new C05_AvciKuslar();
        // hayvanlar class'indaki kartalin ozellikleri
        System.out.println(kartalHayvan.omur); // H Yasar ve olurler

        System.out.println(kartalHayvan.solunum); // H Nefes alir
        System.out.println(kartalHayvan.cogalma); // H Cogalirlar
        //System.out.println(kartalHayvan.kanat); // CTE hayvanlarda yok

        System.out.println(kartalHayvan.hareket); // H hareket eder
        System.out.println(kartalHayvan.beslenme); // H beslenirler
        // System.out.println(kartalHayvan.gaga); // CTE hayvanlarda yok
        //System.out.println(kartalHayvan.pence); // CTE hayvanlarda yok


        System.out.println("====================");

        C04_Kuslar kus1 = new C04_Kuslar();
        // Kuslar class'indaki kusun ozellikleri
        System.out.println(kartalKus.omur); // H Yasar ve olurler

        System.out.println(kartalKus.solunum); // K Akcigerle
        System.out.println(kartalKus.cogalma); // K Yumurtayla
        System.out.println(kartalKus.kanat); // K Kanatlidir

        System.out.println(kartalKus.hareket); // H hareket eder
        System.out.println(kartalKus.beslenme); // H beslenirler
        System.out.println(kartalKus.gaga); // K gagalidir
        // System.out.println(kartalKus.pence); // CTE kuslar veya hayvanlarda yok


        System.out.println("====================");

        C03_Hayvanlar kusHayvan = new C04_Kuslar();
        // hayvanlar class'indaki kuslarin ozellikleri
        System.out.println(kusHayvan.omur); // H Yasar ve olurler

        System.out.println(kusHayvan.solunum); // H Nefes alir
        System.out.println(kusHayvan.cogalma); // H Cogalirlar
        // System.out.println(kusHayvan.kanat); // CTE hayvanlarda yok

        System.out.println(kusHayvan.hareket); // H hareket eder
        System.out.println(kusHayvan.beslenme); // H beslenirler
        //System.out.println(kusHayvan.gaga); // CTE hayvanlarda yok
        //System.out.println(kusHayvan.pence); // CTE hayvanlarda yok

        System.out.println("====================");

        C03_Hayvanlar hayvan = new C03_Hayvanlar();
        System.out.println(hayvan.omur); // H Yasar ve olurler

        System.out.println(hayvan.solunum); // H Nefes alir
        System.out.println(hayvan.cogalma); // H Cogalirlar
        //System.out.println(hayvan.kanat); // CTE hayvanlarda yok

        System.out.println(hayvan.hareket); // H hareket eder
        System.out.println(hayvan.beslenme); // H beslenirler
        //System.out.println(hayvan.gaga); // CTE hayvanlarda yok
        //System.out.println(hayvan.pence); // CTE hayvanlarda yok















    }
}
