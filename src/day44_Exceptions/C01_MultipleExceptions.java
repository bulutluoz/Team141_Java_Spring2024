package day44_Exceptions;

public class C01_MultipleExceptions {

    public static void main(String[] args) {

        /*
            java'da ogrenemeyecegimiz kadar cok exception turu vardir

            1-             Exception  : tum exception'larin babasi
            2-  RunTimeException(UnChecked)             Diger exceptionlar (en cok karsilasilan Compile Time/ Checked Exceptions )
                NullPointerException                    IOExceptions (dosya okuma yazma ile ilgili exceptionlar)
                ArrayIndexOutOfBoundsException          FileNotFoundException
                ArithmeticException
                StringIndexOutOfBoundsException
                InputMismatchException

            Eger kodumuzda birden fazla exception olusma riski varsa
            - 2 farkli try-catch
            - 2 exception'i da kapsayan tek catch olabilir
            - tek try 2 catch
            - nested(ic ice try catch)


            Bazen ortaya cikmasi mumkun olan exception'lar
            birbirinin parent-child'i olabilir
            bu durumda biraz daha dikkatli olmaliyiz

            parent exception'lar yakalama acisindan daha kapsamlidir ve daha cok exception yakalar
            eger alt-alta yazarken en uste parent exception'i yazarsaniz
            altdaki child exception'lara yakalanacak bir sey kalmaz

            - ya sadece parent'i yazabiliriz
            - veya yakalanan hatayi detaylandirmak istersek
              once child, sonra parent exception'i yazabiliriz


         */

    }
}


















