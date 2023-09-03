package day44_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C02_IsimListesi {
    public static void main(String[] args) {

        // öğrenci map'inde bulunaan öğrencilerin isim ve soyisimlerini
        // sıra numaralı bir liste olarak yazdırın

        // Map'ler kompleks bilgiler barındırabilir
        // Barındıtdığı bilgi ne kadar kompleks olursa
        // o bilginin detaylarına ulaşmak da o kadar aşama gerektirebilir.
        // bu tür kompleks işlemleriher seferinde yeniden kodlamak yerine
        // ilk istendiğinde method olarak oluşturup
        //ihtiyaş durumunda o method'u kullanmak daha mantıklı olur.

        /*
        Bir Map ile işlem yapmak istediğimiz de ilk bakacağımız şey istenen bilgnin Key'mi
        yoksa value'da mı bulunduğudur

        Eğer sadece value' de olan bir bilgiyi arıyorsak

        1-Tüm value'leri bir collection olarak kaydedelim
        2- bir for-each loop ile her bir value'yu ele alalım
        3- Value'lar belirli bir ayıraç ile birleştirilen String'lerden oluştuğu için bu
        ayıraç kullanılarak split() ile bir Array'a dçnüştürülebilir
        4-Artık bir array ve içerisinde value oluşturan bilgiler mevcut.
        istenen bilgiyi array'den index ile alabiliriz
         */

        Map<Integer,String> ogrenciMap = day44_maps.MethodDeposu.ogrenciMapOlustur();
        ogrenciMap.put(110,"Kaan-Can-12-MF");
        //{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF,
        // 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 110=Kaan-Can-12-MF}
        System.out.println(ogrenciMap);

        day44_maps.MethodDeposu.isimSoyisimListesiYazdir(ogrenciMap);
    }
}
