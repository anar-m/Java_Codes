package reCap;

import java.util.Scanner;

public class Basamak_Yazdirma {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 3 basamaklı bir sayı girmesini isteyin
        Daha sonra bu sayının sırasıyla
        Birler Basmağı:
        Onlar Basamağı:
        Yüzler Basamağı:
        basamaklarını yazdırınız.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz: ");
        int sayi= scanner.nextInt();

        int birlerBasamagi= sayi % 10;
        sayi/=10;
        int onlarBasamagi = sayi % 10;
        sayi/=10;
       // yuzlerBasamagi = sayi;
        int yuzlerBasamagi = sayi % 10;

        int enYakinYuzluk = sayi*100;

        System.out.println("Birler Basamağı: "+birlerBasamagi+"\nOnlar Basamağı: "+onlarBasamagi+"\nYüzler Bsamağı: "+yuzlerBasamagi);

    }
}
