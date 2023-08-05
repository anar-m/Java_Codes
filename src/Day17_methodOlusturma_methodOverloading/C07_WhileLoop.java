package Day17_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C07_WhileLoop {
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


        boolean sonuc = false;
        while (sonuc == false){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen şifrenizi giriniz");
            String sifre = scanner.nextLine();
            sonuc = sifreKontrolEt(sifre);
        }
        System.out.println("Şifreniz başarıyla kaydedildi");

    }
    public static boolean sifreKontrolEt (String sifre){
       int sayac = 0; // sayac hataları saysın

        //         - ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);
        if (!(ilkHarf>= 'a' && ilkHarf <='z')){
            System.out.println("ilk karakter küçük harf olmalı");
            sayac++;
        }
       char sonKarakter = sifre.charAt(sifre.length()-1);
        //         - son karakter rakam olmali
        if (!(sonKarakter>='0' && sonKarakter<='9')){
            System.out.println("Son karakter rakam olmalı");
            sayac ++;
        }
        //         - sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("Şifre boşluk içermemeli");
            sayac ++;
        }
        if (sifre.length()<10){
            System.out.println("şifrenin uzunluğu en az 10 karakter olmalı");
            sayac ++;
        }
        //         - uzunlugu en az 10 karakter olmali

        if (sayac == 0){
            return true;
        }else {
            return false;
        }
    }


}
