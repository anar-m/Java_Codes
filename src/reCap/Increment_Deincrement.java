package reCap;

import java.util.Scanner;

public class Increment_Deincrement {
    public static void main(String[] args) {
        /*
        Bir sayı değeri arrtırmak / azaltmak istediğimizde şu yöntemler kullanılır:
        sayı verable'ı tanımlanmış olsun
         */

        int sayi=100;
        sayi++;
        System.out.println(sayi); // sayı değeri bir arttırıldı

        sayi+=1;
        System.out.println(sayi); // sayı değeri bir arttırıldı

        sayi+=98;
        System.out.println(sayi); // sayı değeri eşitliğin sağındaki değer kadar arttırıldı

        sayi--;
        System.out.println(sayi); // sayı değeri bir azalttı.

        sayi-=98;
        System.out.println(sayi); // sayı değeri eşitliğin sağındaki değer kadar azaltıldı.

        // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bölünecek sayıyı giriniz: ");
        int bolunen = scanner.nextInt();
        System.out.print("Lütfen Böleceğiniz sayıyı giriniz: ");
        int bolen = scanner.nextInt();
        int sayac = 0;

        while (bolunen>=bolen){
            bolunen-=bolen;
            sayac++;
        }
        System.out.println("Kalan Sayı: " + bolunen);
        System.out.println("Bölüm: " +sayac);
    }

}
