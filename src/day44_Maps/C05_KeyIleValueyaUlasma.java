package day44_Maps;

import java.util.Map;

public class C05_KeyIleValueyaUlasma {
    public static void main(String[] args) {

        // numarası verilen öğrencinin isim, soyisim, sınıf ve şubesini yazdırın

        Map<Integer, String> ogrencimap = MethodDeposu.ogrenciMapOlustur();

        System.out.println(ogrencimap.get(102)); // Veli-Cem-10-K-TM
        System.out.println(ogrencimap.get(105)); // Sevgi-Cem-11-M-TM
        System.out.println(ogrencimap.get(123)); // null

        MethodDeposu.numaraIleOgrenciBilgisiYazdirma(ogrencimap,103);

    }
}
