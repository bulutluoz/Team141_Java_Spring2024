package day13_forLoop_nestedForLoop;

public class C10_NestedForLoop {

    public static void main(String[] args) {

        /*
            nested for loop ile asagidaki sekli olusturun

            *
            * *
            * * *
            * * * *
            * * * * *
         */


        for (int i = 1; i <=5 ; i++) { // satirlari kontrol eder

            for (int j = 1; j <=i ; j++) { // her satirdaki sutunlari kontrol eder

                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
