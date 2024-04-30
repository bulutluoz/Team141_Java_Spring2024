package day46_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

    public static void main(String[] args) {
        // Queue (kuyruk) icin en onemli ozellik FIFO
        // tum ozellikler FIFO'ya gore duzenlenmistir
        // yani eklenenler sona eklenir, cikacaklar bastan cikar

        Queue<Integer> sayilar = new LinkedList<>();

        sayilar.add(3);
        sayilar.add(9);
        sayilar.add(2);

        System.out.println(sayilar); // [3, 9, 2]

        // 9 ile 2'nin arasina 5 ekleyin
        // queue'da araya ekleme yok

        // 1.index'deki 9'u silin
        sayilar.remove();
        // queue'da FIFO oldugundan, remove() dedigimizde en basdakini siler

        System.out.println(sayilar); // [9, 2]

        sayilar.add(5);
        sayilar.add(7);

        System.out.println(sayilar); // [9, 2, 5, 7]

        sayilar.offer(10);
        // Eger sayilarda kapasite sinirlamasina uygunsa, verilen sayiyi ekler
        // add()'den farki : add() direk ekler, offer() eklemeyi teklif eder , kapasite uygunsa ekler

        System.out.println(sayilar); // [9, 2, 5, 7, 10]

        System.out.println(sayilar.poll()); // 9
        // Retrieves and removes the head of this queue, or returns null if this queue is empty.
        // queue'nun basindaki elementi siler ve bize dondurur, eger queue bossa null dondurur

        System.out.println(sayilar); // [2, 5, 7, 10]

        Queue<Integer> bosQueue = new LinkedList<>();
        System.out.println(bosQueue.poll()); // null

        System.out.println(sayilar.element()); // 2
        // Retrieves, but does not remove, the head of this queue.
        // This method differs from peek only in that it throws an exception if this queue is empty.
        // queue'nun ilk elementini silmeden bize getirir
        // bos bir queue'da calistirilirsa exception firlatir
        System.out.println(sayilar); // [2, 5, 7, 10]
        // System.out.println(bosQueue.element()); // NoSuchElementException


        System.out.println(sayilar.peek()); // 2
        // Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        // queue'nun ilk elementini silmeden bize getirir, bos bir queue'da calistirilirsa null getirir
        System.out.println(bosQueue.peek()); // null



    }
}
