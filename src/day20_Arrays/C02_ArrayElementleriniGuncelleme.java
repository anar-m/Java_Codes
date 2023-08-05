package day20_Arrays;

import java.util.Arrays;

public class C02_ArrayElementleriniGuncelleme {
    public static void main(String[] args) {
     int[] sayilar = new int[6];

        System.out.println(Arrays.toString(sayilar)); //[0, 0, 0, 0, 0, 0]
        // ikinci indexteki elementi 5 yapın
        sayilar[2]=5;
        System.out.println(Arrays.toString(sayilar)); // [0, 0, 5, 0, 0, 0]
        // ikinci indexteki sayıyı 7 yapın
        sayilar[2]=7;
        System.out.println(Arrays.toString(sayilar)); //[0, 0, 7, 0, 0, 0]
        // index kullanmadan bir elemente atama yokmak MÜMKÜN DEĞİLDİR
        //5. indextedi elementi 8 yapın
        sayilar[5]=8;
        System.out.println(Arrays.toString(sayilar)); // [0, 0, 7, 0, 0, 8]

        // 6. indexe yeni bir element ekleyelim
        // sayilar[6=20];
        System.out.println(Arrays.toString(sayilar));
        // run dedikten sonra bu hata oluştuğu için Run Time Error denilir (RTE)
        /*
        uzunluğu verilen bir Array'de var olan
        elelmentler index ile update edilebilir.
        ANCAK
        yeni element ekleyip uzunluğunu değiştirmek isterseniz
        Run Time Error oluşur
         */


    }
}
