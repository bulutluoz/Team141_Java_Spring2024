package day12_stringManipulations_forLoop;

public class C01_StringdenSayiToplama {

    public static void main(String[] args) {

        //Soru 2 : Kullanicinin belirli bir formatta verdigi
        //         String fiyatlari toplayip yazdirin.
        //		input1 : “15.30 €” , input2 : “11.45 €”
        //		output : 26.75 €


        String fiyatStr1 = "15.30 €";
        String fiyatStr2 = "11.45 €";

        System.out.println(fiyatStr1 + fiyatStr2); // 15.30 €11.45 €

        fiyatStr1 = fiyatStr1.replaceAll("\\D","");
        fiyatStr2 = fiyatStr2.replaceAll("\\D","");

        System.out.println(fiyatStr1 + fiyatStr2); // 15301145

        System.out.println( "Verilen fiyatlarin toplami : " +
                            (Double.parseDouble(fiyatStr1) + Double.parseDouble(fiyatStr2))/100 +
                            " €"
        );

    }
}
