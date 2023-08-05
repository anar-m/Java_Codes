package day14_forLoops;

import java.util.Scanner;

public class C04_Faktoryel {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.
        Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20'den küçük bir tam sayı giriniz");
        int sayi = scanner.nextInt();

        int carpim =1;
        for (int i = 1; i <= sayi; i++) {
            carpim *= i;
        }
        System.out.println(" Girilen sayı olan "+ sayi +" ! = "+ carpim);



    }
}
