package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C02_IndirimHesaplama {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        //        Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen ürün adedi giriniz");
        int urunSayisi= scanner.nextInt();
        System.out.println("Lütfen liste fiyatını giriniz");
        double listeFiyati= scanner.nextDouble();
        System.out.println("Müşteri Kartınız var mı? \nE: Evet , H: Hayır");
        char kartVarMi= scanner.next().toUpperCase().charAt(0);
                // ana değişken kart var mı bilgisi olsun
        if (kartVarMi=='E'){ //kartı olanlar
            //müşteri kartı varsa 10 üründen fazla alırsa %20, yoksa %15 indirim yapın,
            if (urunSayisi>10){
                System.out.println("%20 indirimli toplam fiyat : " + urunSayisi*listeFiyati*80/100);
            }else {
                System.out.println("%15 indirimli toplam fiyat : " + urunSayisi*listeFiyati*85/100);
            }

        } else if (kartVarMi=='H') { //kartı olmayanlar
            // musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
            if (urunSayisi>10){
                System.out.println("%15 indirimli toplam fiyat : " + urunSayisi*listeFiyati*85/100);
            }else {
                System.out.println("%10 indirimli toplam fiyat : " + urunSayisi*listeFiyati*90/100);
            }

        }else {// hatalı kart bilgisi
            System.out.println("Kart bilgisi hatalı");
        }

    }
}
