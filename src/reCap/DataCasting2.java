package reCap;

import java.util.Scanner;

public class DataCasting2 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 sayı alıp iki sayıyı birbirine böldürüp sonucu
        tam sayı olarak yazdırın.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir ondalıklı sayı giriniz: ");
        double sayi1= scanner.nextDouble();
        System.out.println("Lütfen bir ondalıklı sayı giriniz: ");
        double sayi2= scanner.nextDouble();

        //double sonuc =sayi1 / sayi2;
        //System.out.println("Girdiğiniz sayıların bölümü: "+(int) sonuc);

        int sonuc =(int) (sayi1/ sayi2);
        System.out.println("Girdiğiniz sayıların bölümü: "+(int) sonuc);
    }
}
