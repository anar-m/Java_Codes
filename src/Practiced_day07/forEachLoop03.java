package Practiced_day07;

import java.util.ArrayList;
import java.util.Scanner;

public class forEachLoop03 {
    // Kullanıcıdan 5 adet not alarak bir ArrayList oluşturun.
    // Bu notların ortalamasını hesaplayarak ekrana yazdırın.

    // Örnek çıktı:
    // Notların ortalaması: 78.5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sizden istenen not bilgilerini sırasıyla giriniz: ");
        ArrayList<Double> notlar = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + ". dersinizin Notu : ");
            double not = scanner.nextDouble();
            notlar.add(not);
        }
        double toplam = 0;
        for (double not:notlar) {
            toplam+=not;
        }
        double GANO = toplam/notlar.size();
        System.out.println("Genel Akademik Not Ortalamanız : " + GANO);
    }
}
