package Practice_day05;

import java.util.Scanner;

public class CokCokDahaBasitForLoop {
    public static void main(String[] args) {
    /*
        Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Başlangıç değerini giriniz : ");
        int baslangicDegeri = scanner.nextInt();
        System.out.print("Bitiş değerini giriniz : ");
        int bitisDegeri = scanner.nextInt();

        int toplam = 0;
        if (baslangicDegeri>bitisDegeri){
            System.out.println("Başlangıç değeri bitiş değerinden büyük olamaz");
        }else {
            for (int i = baslangicDegeri; i <=bitisDegeri ; i++) {
                toplam+=i;

            }
            System.out.println("Girilen değerler arasındaki sayıların toplamı : "+toplam);
        }


    }
}
