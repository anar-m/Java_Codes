package Day17_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C01_AsalSayiBulma {
    /*
    Soru 3- Kullanicidan main method icinde 2'den büyük pozitif bir tamsayi alin.
    Girilen sayinin asal sayi olup olmadigini kontrol edip,
     sonuc olarak “true” veya “false”
     sonuclarini donduren bir method olusturun.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Asal sayı kontrolü için pozitif bir tam sayı girin: ");
        int sayi = scanner.nextInt();

        System.out.println(asalSayiMi(sayi));

    }
    public static boolean asalSayiMi(int sayi){
       String flag = "Asal sayı";
        for (int i = 2; i <sayi ; i++) {
            if (sayi % i ==0){
                flag ="asal sayı";
               break;
            }
        }

        if (sayi == 2){
            return true;

        }else if (flag.equals("asal sayı")){
            return true;
        }else {
            return false;
        }

    }


}
