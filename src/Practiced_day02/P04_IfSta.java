package Practiced_day02;

import java.util.Scanner;

public class P04_IfSta {
    public static void main(String[] args) {
        /*
        /*
   2- Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
    Yıl sonu notunu vizeler %40 final % 60 olacak şekilde hesaplayıp
    Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler!
    50'den küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız
    Ad:
    Soyad:
    1.Vize:
    2. Vize:
    Final :
    Yıl Sonu Notu:
    Ders Durumu :
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Adınızı Giriniz: ");
        String name= scan.nextLine();
        System.out.print("Lütfen Soyadınızı Giriniz: ");
        String surname= scan.nextLine();
        System.out.println("Lütfen vize ve final notlarınızı giriniz");
        System.out.print("Vize 1: ");
        double vize1= scan.nextDouble();
        System.out.print("Vize 2: ");
        double vize2= scan.nextDouble();
        System.out.print("Final Notu");
        double finalNotu= scan.nextDouble();
        double yilSonuNotu= ((((vize1+vize2)/2)*40/100)+(finalNotu*60/100));
        System.out.println("Adınız: "+name);
        System.out.println("Soyadınız: "+surname);
        System.out.println("1. vize notu: "+ vize1);
        System.out.println("2. vize notu: "+ vize2);
        System.out.println("Final Notu: "+finalNotu);
        System.out.println("yıl sonu notu: "+ yilSonuNotu);
        if (yilSonuNotu>=50){
            System.out.println("Ders durumu: Geçtiniz Tebrikler");
        }
        if (yilSonuNotu<50){
            System.out.println("Ders durumu: Malesef kaldınız");
        }









    }
}
