package Practiced_day02;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        /*
        3-Kullanıcıdan iki sayı alıp üçüncü bir değişken kullanmadan sayı değerlerini
        değiştirin (Swap)
        */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen iki adet sayı giriniz");
        System.out.print("Birinci Sayı: ");
        double sayi1= scan.nextDouble();
        System.out.print("İkinci Sayı: ");
        double sayi2= scan.nextDouble();
        System.out.println("Girdiğiniz 1. sayı: "+sayi1+"'dir\n"
            + "Girdiğiniz 2. sayı: "+sayi2+"'dir.");
        System.out.println("======= Hokus Pokus ======");

        // sayı1: 10 sayı2: 15
        sayi1=sayi1+sayi2; // sayı1:8
        sayi2=sayi1-sayi2;  // sayı2:5
        sayi1=sayi1-sayi2;
        System.out.println("Girdiğiniz değerler yer değiştirdi\n"+"1. Sayı: "+ sayi1+ "oldu\n"
            +"2. sayı: " + sayi2+ " oldu.");

    }
}
