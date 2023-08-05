package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_get_set {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Cemil");
        isimler.add("Ömer");
        isimler.add("Mustafa");

        isimler.add(2,"Burhan");
        System.out.println(isimler); // [Cemil, Ömer, Burhan, Mustafa]

        // set ile add arasındaki fark budur.
        // add() araya ekler kalanları kaydeder
        // set() ise update eder. Var olan elementin değerini değiştirir.

        isimler.set(2,"Ayşe");
        System.out.println(isimler); // [Cemil, Ömer, Ayşe, Mustafa] // Burhan'ı Ayşe olarak update eder.

        System.out.println(isimler.get(1));  // Ömer sadece bilgi verdi
        System.out.println(isimler); // [Cemil, Ömer, Ayşe, Mustafa]


    }
}
