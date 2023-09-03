package day44_maps;

import java.util.Map;

public class C05_KeyIleValueyaUlasma {

    public static void main(String[] args) {

        // numarasi verilen ogrencinin isim, soyisim, sinif ve subesini yazdirin

        Map<Integer, String> ogrenciMap = day44_maps.MethodDeposu.ogrenciMapOlustur();

        System.out.println(ogrenciMap.get(102)); // Veli-Cem-10-K-TM
        System.out.println(ogrenciMap.get(105)); // Sevgi-Cem-11-M-TM
        System.out.println(ogrenciMap.get(123)); // null

        day44_maps.MethodDeposu.numaraIleOgrenciBilgisiyazdirma(ogrenciMap,103);
    }
}
