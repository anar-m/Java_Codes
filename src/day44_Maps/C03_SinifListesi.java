package day44_Maps;

import java.util.Map;

public class C03_SinifListesi {
    public static void main(String[] args) {
        /*
        ÖğrenciMap'te sınıf ve şube verdiğimizde
        o sınıfta bulunan öğrenci isim ve soyisimlerini yazdırın
         */
        Map<Integer, String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        MethodDeposu.sinifSubedekiOgrenciListesiYazdir(ogrenciMap, 11, "h");







    }

}
