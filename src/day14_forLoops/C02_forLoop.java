package day14_forLoops;

import java.util.Scanner;

public class C02_forLoop {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar dahil
        olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri baslangic
        degerinden kucukse, uyari yazdirip islemi sonlandirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen başlangıç değeri için pozitif bir tam sayı giriniz");
        int baslangic = scanner.nextInt();

        System.out.println("Lütfen bitiş değeri için pozitif bir tam sayı giriniz");
        int bitis = scanner.nextInt();
        if (bitis< baslangic){
            System.out.println("Başlangıç değeri bitiş değerinden büyük olamaz");
        }else {
            int toplam = 0;
            for (int i = baslangic; i <= bitis; i++) {
                //toplam = toplam+i; acemei işi
                toplam +=i;

            }
            System.out.println("Sınırlar arasındaki tam sayıların toplamı : " + toplam);
        }



    }
}
