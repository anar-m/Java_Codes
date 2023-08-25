package day44_Maps;

import java.util.Map;

public class C04_IsimSoyisimIleOgrenciBulma {
    public static void main(String[] args) {
        // Öğrenci Map'inde verilen isim ve soyisim'e sahip öğrencileri
        // isim , soyisim , sınıf ve şubelerini yazdırın.

        Map<Integer, String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        MethodDeposu.isimSoyisimIleOgrenciBul(ogrenciMap,"ALI", "CAN");
    }
}
