package day16_metodOlusturma_Kullanma;

import java.util.Scanner;

public class C03_MethodOlusturma {
    /*
    Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
     Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
     isim bosluk soyisim seklinde bize donduren bir method olusturun

    input : isim : Ali soyisim :YILMAZ.    output : Ali Yilmaz
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz: "); // tek isim istiyoruz
        String isim = scanner.next();

        System.out.println("Lütfen Soyisminizi giriniz: ");
        String soyisim= scanner.next();

         System.out.println(isimDuzenle(isim,soyisim));
         String duzenliIsim = isimDuzenle(isim,soyisim);
         //istersek
    }
    public static String isimDuzenle(String isim, String soyisim){

        isim = isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
        soyisim = soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase();

        String istenenFormattaIsimSoyisim = isim+" "+soyisim;

        return istenenFormattaIsimSoyisim;
    }

}
