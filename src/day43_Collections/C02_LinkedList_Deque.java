package day43_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList_Deque {
    public static void main(String[] args) {
        /*
        Deque : Double ended queue demektir. Çift başlı kuyruk.
        iki baştan da işlem yapıldığı için pek çok metho'un first ve last şeklinde 2 versiyonu olur.
         */
        Deque<String> isimler = new LinkedList<>();

        isimler.add("Cemil"); // List'teki add gibidir sona ekler
        isimler.addFirst("Resul");  // [Resul, Cemil]
        isimler.addLast("Mustafa"); // [Resul, Cemil, Mustafa]
        isimler.addLast("Resul");
        isimler.add("Eyyüp");
        isimler.add("Kaan");


        System.out.println(isimler.removeLast()); // sonuncu elementi silip sildiği elementi yazdırır.- Kaan
        // [Resul, Cemil, Mustafa, Resul, Eyyüp]

        System.out.println(isimler.removeLastOccurrence("Resul")); // true -[Resul, Cemil, Mustafa, Eyyüp]
        System.out.println(isimler.removeLastOccurrence("Hilal")); // false

        System.out.println(isimler.pollFirst()); // Resul
            // [Cemil, Mustafa, Eyyüp]

        System.out.println(isimler.pop()); // Cemil
            // [Mustafa, Eyyüp]

        System.out.println(isimler.offerFirst("Buğra")); // ekleyecek true
            // [Buğra, Mustafa, Eyyüp]

        System.out.println(isimler.peekFirst()); // Buğra
        // [Buğra, Mustafa, Eyyüp]

        System.out.println(isimler.element());  // Buğra
        // [Buğra, Mustafa, Eyyüp]

        System.out.println(isimler.hashCode()); // -1245004800

        isimler.clear();
        System.out.println(isimler.hashCode()); // 1
        isimler.add("Kahraman");
        System.out.println(isimler.hashCode());

        System.out.println(isimler);
    }
}


