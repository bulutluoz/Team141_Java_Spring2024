package day34_stringBuilder;

public class C01_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.length()); // 0
        System.out.println(sb1.capacity()); // 16


        StringBuilder sb2 = new StringBuilder("Deneme");
        System.out.println(sb2.length()); // 6
        System.out.println(sb2.capacity()); // 16+6 =>22


        StringBuilder sb3 = new StringBuilder(7); // 7 karakter alabilen
        System.out.println(sb3.length()); // 0
        System.out.println(sb3.capacity()); // 7


        // Java non-primitive data turleri icin baslangicta
        // data turune ve data turunun kapasitesine uygun bir alan ayirir
        // eger variable'in tuttugu bilgi degisirse
        // Java'da hafizada tuttugu alani degistirir

        sb3.append("Java");
        System.out.println(sb3); // Java
        System.out.println(sb3.length()); // 4
        System.out.println(sb3.capacity()); // 7

        sb3.append(" Candir");
        System.out.println(sb3); // Java Candir
        System.out.println(sb3.length()); // 11
        System.out.println(sb3.capacity()); // 7 * 2 + 2 = 16

        sb3.append(false);
        sb3.append(44);

        System.out.println(sb3); // Java Candirfalse44
        System.out.println(sb3.length()); // 18
        System.out.println(sb3.capacity()); // 16 * 2 + 2 = 34

        sb3.trimToSize();
        // kapasiteyi lengt'e indirger
        System.out.println(sb3); // Java Candirfalse44
        System.out.println(sb3.length()); // 18
        System.out.println(sb3.capacity()); // 18

        // StringBuilder String gibi metin ifadeler barindirir
        // dolayisiyla method'lar da benzerdir ama
        // ismi ayni olan her method, ayni sekilde calismayabilir

        String str = "Malatya";

        sb3.append(str,4,6); // Java Candirfalse44ty
        System.out.println(sb3.length()); // 20
        System.out.println(sb3.capacity()); // 18*2+2 = 38



    }
}
