package Practiced_day07;

import java.util.ArrayList;

public class forEachloop01 {
    // Bir ArrayList oluşturun ve içine 3 adet meyve ekleyin.
    // Daha sonra bu meyveleri büyük harflerle ekrana yazdırın.

    // Örnek çıktı:
    // Meyveler: ELMA ARMUT ÇİLEK
    public static void main(String[] args) {
        ArrayList<String> meyveler = new ArrayList<>();
        meyveler.add("Elma");
        meyveler.add("armut");
        meyveler.add("ÇİLEK");

        for (String meyve:meyveler) {
            System.out.println(meyve.toUpperCase());
        }

    }
}
