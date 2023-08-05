package day18_whileLoop_DoWhilwLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
        // kullanıcıdan toplanmak üzere pozitif sayılar isteyin.
        // kullanıcı islemi bitirmek için sıfıra basmalıdır.
        // kullanıcı sıfıra bastığında kaç pozitif sayı girdiğini
        // ve toplamlarının kaç olduğunu yazdırın

        /* whilw Loop ile yapalım

        Scanner scanner;
        int sayac =0;
        int toplam = 0;
        int girilenSayi=999;

        while (girilenSayi !=0){
            scanner = new Scanner(System.in);
            System.out.println("Lütfen toplanmak üzere pozitif sayı giriniz");
            girilenSayi = scanner.nextInt();

            if (girilenSayi !=0){
                toplam += girilenSayi;
                sayac++;
            }
        }

        System.out.println("Girilen " +sayac+" adet sayının toplamı : " +toplam); */

        // do while Loop ile yapalım

        Scanner scanner;
        int sayac =0;
        int toplam = 0;
        int girilenSayi;

        do {
            scanner = new Scanner(System.in);
            System.out.println("Lütfen toplanmak üzere pozitif sayı giriniz");
            girilenSayi = scanner.nextInt();

            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayac++;
            }

        }while (girilenSayi !=0);

            System.out.println("Girilen " + sayac + " adet sayının toplamı : " + toplam);
    }

}