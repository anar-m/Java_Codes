package day31_dateTime;

import java.time.LocalDateTime;

public class C02_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat); // 2023-08-04  T 21:10:51.866111900

        System.out.println(tarihSaat.getDayOfWeek()); // FRIDAY

        // bir for loop oluşturup 1!den 10000'e kadar olan sayıları toplayın
        // işlem süresini nanosaniye olarak yazdırın

        LocalDateTime baslamaZamani = LocalDateTime.now();
        int baslangicZamani = baslamaZamani.getNano();
        int toplam=0;
        for (int i = 1; i <100000 ; i++) {
            toplam += i;
        }
        LocalDateTime bitirmeZamani = LocalDateTime.now();
        int bitisZamani = bitirmeZamani.getNano();
        System.out.println("Islem suresi : " + (bitisZamani - baslangicZamani)); // 1036100


    }
}
