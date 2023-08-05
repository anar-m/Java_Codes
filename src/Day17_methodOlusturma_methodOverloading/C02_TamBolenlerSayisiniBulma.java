package Day17_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C02_TamBolenlerSayisiniBulma {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan main method icinde bir tamsayi alin.
         Girilen sayinin pozitif tam bolenleri sayisini bulup
          bize donduren bir method olusturun.
          Örnek :20 pozitif bölenleri : 1,2,4,5,10,20 ptbs:6
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif tam bölenlerini bulmak istediğiniz sayıyı giriniz");

        int sayi = scanner.nextInt();
        System.out.println(tamBolenlerSayisi(sayi));


    }
    public static int tamBolenlerSayisi (int sayi){
        int sayac =0;
        for (int i = 1; i <=sayi ; i++) {
            if (sayi % i== 0);{
                sayac++;
            }

        }

        return sayac;
    }


}
