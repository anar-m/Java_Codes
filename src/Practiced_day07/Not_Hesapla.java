package Practiced_day07;

import java.util.ArrayList;
import java.util.Scanner;

public class Not_Hesapla {
     double vize1 = 0;
     double vize2 = 0;
     double fnl;
    String isim="";
     static ArrayList<Not_Hesapla> notlar= new ArrayList<>();

    public Not_Hesapla(double vize1, double vize2, double fnl, String isim) {
        this.vize1 = vize1;
        this.vize2 = vize2;
        this.fnl = fnl;
        this.isim = isim;
    }

    public Not_Hesapla() {
    }

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        öğrenci notlarını final vize1 ve vize2 olarak alıp harf notuna dönüştüren bir program yazın
        */



        int sayac=0;
        while (sayac<1) {
            System.out.println("Lütfen isminizi giriniz: ");
            String isim = scanner.next();

            System.out.println("Lütfen vize 1 notunuzu giriniz");
            double vize1 = scanner.nextDouble();
            System.out.println("Lütfen vize 2 notunuzu giriniz");
            double vize2 = scanner.nextDouble();
            System.out.println("Lütfen final notunuzu giriniz");
            double fnl = scanner.nextDouble();
            Not_Hesapla obj = new Not_Hesapla(vize1, vize2, fnl, isim);
            notlar.add(obj);
            sayac++;
        }
        for (Not_Hesapla each:notlar
             ) {
            double sonuc = each.vize1 * 0.3 + each.vize2 * 0.3 + each.fnl * 0.4;
            if (sonuc > 80) {
                System.out.println(each.isim + " HArf notunuz: " + "AA");
            } else if (sonuc > 70) {
                System.out.println(each.isim + " HArf notunuz: " + "BB");
            } else if (sonuc > 60) {
                System.out.println(each.isim + " HArf notunuz: " + "CB");
            } else if (sonuc > 50) {
                System.out.println(each.isim + " HArf notunuz: " + "CC");
            } else {
                System.out.println(each.isim + " Bu sefer olmadı tekrar dene");
            }
        }
    }
}
