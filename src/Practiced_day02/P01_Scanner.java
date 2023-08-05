package Practiced_day02;

import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {
      /*
    1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
    sisteme kaydedildiğini aşağıdaki formatta yazdırın.
     *****       KAYIT BAŞARILI      *****
    Adınız: Tarık
    Soyadınız: Yiğit
    Yaşınız:42
    Mail Adresiniz:tarik@yigit.com
    Şifreniz: A2e365
    şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
    */
        Scanner scan= new Scanner(System.in);
       // || System.out.println("Lütfen aşağıdaki bilgileri Giriniz");
       // || System.out.print("Adınız: ");
       // || String name= scan.nextLine();
       // || System.out.println("");
       // || System.out.print("Soyadınız: ");
       // || String surname= scan.nextLine();
       // || System.out.println();
       // || System.out.println("Yaşınız: ");
       // || int yas= scan.nextInt();
       // || System.out.println();
       // || System.out.println("Mail Adresinizi: ");
       // || String mail= scan.next();
       // || System.out.println();
       //  System.out.println("Şifrenizi: ");
       //  String pass= scan.next();
       //  System.out.println("*****      KAYIT BAŞARILI     *****");
       //  System.out.println("Adınız: "+name);
       // System.out.println("Soyadınız: "+surname);
       //   System.out.println("Yaşınız: "+yas);
       //  System.out.println("Mail Adresiniz: "+mail);
       //  System.out.println("Şifreniz: "+pass);
       //  System.out.println("şeklinde sistemimize kaydınız başarıyla tamamlanmıştır");

        /*
        2- Kullanıcıdan üçgenin kenarını ve o kenarın yüksekliğini girmesini isteyerek
        üçgenin alanını hesaplayıp yazdırı
         */
        System.out.println("Lütfn alanı hesaplanacak olan üçgenin ilgili ayrıt değerlerini giriniz");
        System.out.println("üçgenin bir kenar uzunluğunu giriniz: ");
        double kenar= scan.nextDouble();
        System.out.println("O kenara ait yükseklik giriniz: ");
        double yukseklik= scan.nextDouble();
        System.out.println("======== Bilgileri Girilen Üçgenin Alan Hesabı Sonucu ======== ");
        System.out.println("Üçgenin alanı: "+ ((kenar*yukseklik)/2));




    }
}
