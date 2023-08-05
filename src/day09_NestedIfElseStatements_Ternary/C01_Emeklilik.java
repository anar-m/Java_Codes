package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C01_Emeklilik {
    public static void main(String[] args) {
        // Kullanıcıdan cinsiyetini ve yaşını alınız
        // Kadın, 60 yaş ve üzeri, Erkek 65 yaş ve üzeri emekli olabilir.
        // Cinsiyet ve yaşını dikkate alarak "Emekli olabilirsin"
        // veya "Emekli olmak için .. yıl daha çalışman gerekir" yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz E: Erkek, K: Kadın");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yaşınızı giriniz");
        double yas = scanner.nextDouble();

        if (yas < 10 || yas > 80) {
            System.out.println("Geçersiz yaş");
        } else if (yas < 60) { // kimse emekli olamaz
            if (cinsiyet == 'K') {
                System.out.println("Kadın emekli olabilmek için daha " + (60 - yas) + " yıl daha çalışmalı");
            } else if (cinsiyet == 'E') {
                System.out.println("Erkek emekli olabilmek için daha " + (65 - yas) + " yıl daha çalışmalı");
            } else {
                System.out.println("cinsiyet hatalı");
            }
        } else if (yas < 65) { //sadece kadınlar emekli olabilir
            if (cinsiyet == 'K') {
                System.out.println("Kadın emekli olabliri");
            } else if (cinsiyet == 'E') {
                System.out.println("Erkek emekli olabilmek için daha " + (65 - yas) + " yıl daha çalışmalı");
            } else {
                System.out.println("cinsiyet hatalı");
            }

        }else { //herkes emekli olabilir
            if (cinsiyet=='K'|| cinsiyet=='E') {
                System.out.println("Emekli olabilir");
            }else {
                System.out.println("cinsiyet hatalı");
            }
        }

    }
}
