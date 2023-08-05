package day14_forLoops;

import java.util.Scanner;

public class C01_SifreKontrol {
    public static void main(String[] args) {
    /*
         Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        basariyla kaydedildi" yazdirin
        - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
-        uzunlugu en az 10 karakter olmali
     */
        // flag yöntemi kullanalım
        // flag'ı başta true yapalım. her uygun olmayan durumda false değeri atayalım

        boolean flag = true;
        // şartlar birbirinden bağımsız olduğundan bağımsız if cümleleri kullanalım
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz: ");
        String sifre = scanner.nextLine();


        //- ilk harf kucuk harf olmali
        char ilkHarf= sifre.charAt(0);
        if (!(ilkHarf>='a' && ilkHarf<='z')) {
            System.out.println("İlk karakter küçük harf olmalı");
            flag = false;
        }


        // - son karakter rakam olmali
        char sonKarakter = sifre.charAt(sifre.length()-1);
        if (!(sonKarakter>='0' && sonKarakter<= '9')){
            System.out.println("Son karakter rakam olmalı");
            flag = false;
        }

        //  - sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("Şifre boşluk içermemeli");
            flag = false;
        }
        //uzunlugu en az 10 karakter olmali
        if (!(sifre.length()>=10)){
            System.out.println("Şifrenin uzunluğu en az 10 karakter olmalı");
            flag = false;
        }

        if (flag){
            System.out.println("Şİfre başarılı şekilde kaydedildi");
        }


    }
}
