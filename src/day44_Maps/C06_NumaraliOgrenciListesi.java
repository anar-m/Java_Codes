package day44_Maps;

import java.util.Map;

public class C06_NumaraliOgrenciListesi {
    public static void main(String[] args) {
        // tüm öğrencileri öğrenci No: , isim, soyisim olarak yazdırın

        Map<Integer, String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        // bizden istenen bilgi hem key hem de value ile çalışmamızı gerektiriyor
        // bunun için öncelikle key'leri kaydedelim
        // sonra her bir key'i ve o key 'e ait value'dan istenen değerleri yazdıralım

        MethodDeposu.numaraliOgrenciListesiYazdir(ogrenciMap);
    }
}
