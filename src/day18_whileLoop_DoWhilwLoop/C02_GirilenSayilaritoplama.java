package day18_whileLoop_DoWhilwLoop;

import java.util.Scanner;

public class C02_GirilenSayilaritoplama {
    public static void main(String[] args) {
        // kullanıcıdan toplanmak üzere sayılar alın
        // Girilen sayıların toplamı 500 ü geçerse bu kadar
        // sayı yeter,girilen sayıların toplamı ... oldu yazdırın
        // girilen sayıların adedi 10 veya daha yüksek olursa
        // 10 dan fazla sayı giremezsin, girilen sasyıların toplamı ... oldu yazdırın
        // ve işlemi sonlandırın.

        Scanner scanner;
        int sayac = 0;
        int toplam = 0;
        int sayi;

        while (sayac<10 && toplam<500){ // while loop'un içi true oldukça çalışmaya devam edecek
        scanner = new Scanner(System.in);
            System.out.println("Lütfen toplamak üzere sayı girin");
            sayi = scanner.nextInt();

            toplam += sayi;
            sayac ++;
        }
        // while loop bitti ise
        // sartlardan biri saglanmadi

        if (sayac >= 10){
            System.out.println("10'dan fazla sayi giremezsin, girilen sayilarin toplami "+toplam+" oldu");
        }
        if (toplam>500){
            System.out.println("bu kadar sayi yeter, girilen sayilarin toplami " +toplam+ " oldu");
        }







    }

}
