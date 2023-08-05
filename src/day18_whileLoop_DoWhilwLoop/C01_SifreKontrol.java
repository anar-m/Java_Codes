package day18_whileLoop_DoWhilwLoop;

import java.util.Scanner;

import static Day17_methodOlusturma_methodOverloading.C07_WhileLoop.sifreKontrolEt;

public class C01_SifreKontrol {
    public static void main(String[] args) {
        //Soru 4 : Main method'da kullanicidan bir sifre isteyip,
        //         oluşturacağımız bir method'da asagidaki sartlari kontrol edin
        //          method'dan true veya false döndürün.
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         tum sartlari saglanincaya kadar tekrar deger isteyin
        //         ve sartlar saglaninca , "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali

        /*
        bu soruyu dat17'de çözdük
        ama java'da daha profesyonel kodlama için
        iki düzeltme yapacağız.
        1-
        While loop'un önündeki parantezin içi true
        olduğu müddetçe loop çalışır.

        bu soruda sonuç variable'da boolean sonuç içeriyor.
        sorunun mantığı açısından sonuş false olduğu müddeçe loop çalışor.
        2-
        While loop her çalıştığında  Scanner scanner = new Scanner(System.in);
        String sifre = scanner.nextLine();
        çalışıyor ve yeni bir scanner objesi oluşturur.
        bunun yerine daha güzel olanı loop tan önce objeyi oluşturup
        loop un içerisinde sadece değer atamsı yapmaktır.
         */

        boolean sonuc = false;
        Scanner scanner;
        String sifre;

        while (! sonuc){ // sonuç ==false
            scanner = new Scanner(System.in);
            System.out.println("Lütfen şifrenizi giriniz");
            sifre = scanner.nextLine();
            sonuc = sifreKontrolEt(sifre);
        }
        System.out.println("Şifreniz başarıyla kaydedildi");



    }
}
