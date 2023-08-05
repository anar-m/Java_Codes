package day_11StringManipulations;

import java.util.Scanner;

public class C02_length {
    public static void main(String[] args) {

        String isim= "Ramazan Uzunkavaklaraltındayataruyumazoglu";
        System.out.println("İsim uzunluğu : " +isim.length()); // 42
        System.out.println("son harf : "+ isim.charAt(isim.length()-1)); //u

        //sondan 5. harf
        System.out.println("sondan 5. harf : "+ isim.charAt(isim.length()-5));

        // kullanıcıdan ismini alın
        // ve ortadaki yazdırın
        // ismin uzunluğu çift sayı ise orta kısımdaki iki harfi yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi yazınız");
        String girilenIsim = scan.nextLine();

        int uzunluk = girilenIsim.length(); // uzunluk çift ise

        if (uzunluk % 2 ==0){
            System.out.println("Uzunluk çift, ortadaki harf: "
                    + girilenIsim.charAt(uzunluk/2 -1)
                    + girilenIsim.charAt(uzunluk/2));

        }else { // uzunluk tekse
            System.out.println("Uzunluk tek, ortadaki harf : "
                    + girilenIsim.charAt((uzunluk - 1) / 2));
        }
    }
}