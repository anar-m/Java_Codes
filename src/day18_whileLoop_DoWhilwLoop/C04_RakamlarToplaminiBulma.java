package day18_whileLoop_DoWhilwLoop;

import java.util.Scanner;

public class C04_RakamlarToplaminiBulma {
    public static void main(String[] args) {
    // while loop kullanarak

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen rakamlar toplamını bulmak istediğiniz sayıyı yazınız");
        int girilenSayi= scanner.nextInt();

        int sayi= girilenSayi;
        int birlerBasamagi = 0;
        int rakamlarToplami= 0;

        while (sayi>0){
            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;
        }
        System.out.println("Girilen " + girilenSayi + "nin rakamlar toplamı : " + rakamlarToplami);
    }


}
