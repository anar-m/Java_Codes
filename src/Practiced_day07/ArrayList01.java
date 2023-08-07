package Practiced_day07;

import java.util.ArrayList;

public class ArrayList01 {
    // Bir ArrayList oluşturun ve içine 5 adet isim ekleyin.
    // Daha sonra bu isimleri sondan başlayarak ekrana yazdırın.

    // Örnek çıktı:
    // Son isim: Ahmet
    // Son ikinci isim: Mehmet
    // ...

    public static void main(String[] args) {
        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("Mustafa");
        isimler.add("Meryem");
        isimler.add("Yüksel");
        isimler.add("İpek");
        isimler.add("Betül");

        for (int i = isimler.size()-1; i >= 0 ; i--) {
            System.out.println("Sondan " + (isimler.size()-i) + " .isim " + isimler.get(i));
        }
    }
}
