package day20_Arrays;

import java.util.Arrays;

public class C01_ArrayOlusturma {
    public static void main(String[] args) {

        int[] sayilar= {2,4,6,8};
        String harfler[] ={"a","f","e"};
        System.out.println(sayilar[1]); //4
        System.out.println(harfler[2]); //e

        String [] ogrenciList ={"mustafa", "ramazan", "samet", "senol"};
        System.out.println(ogrenciList[0]); //mustafa

        // 5 kişilik sınıf oluşturun
        String[] sinifListesi1 = {null, null, null, null, null };

        String[] sinifListesi2 = new String[5];

        // bir array oluşturulurken 2 şey mutlaka belirtilmelidir
        // 1- içine konulacak data türleri
        // 2- Array'in uzunluğu (bir Array'e yazılırken oluşturulan yazılan uzunluğundan daha fazla element konulamaz.
        //bir array'in bütünü nasıl yazdırılır?
        System.out.println(sayilar);// [I@6acbcfc0

        // döngü ile yazdıralım
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]+ " "); // 2, 4, 6, 8
        }
        System.out.println("");

        //array'in tamamını yazdırmak isterseniz
        //Array class'dan hazır method kullanırız
        System.out.println(Arrays.toString(sayilar));// [2, 4, 6, 8]
        // for loop ile elementleri yazdırırız.
        // Arrays.toString() ise bize Array'in kendisini yazdırı.
        System.out.println(Arrays.toString(harfler)); // [a, f, e]
        System.out.println(Arrays.toString(sinifListesi1)); // [null, null, null, null, null]
        System.out.println(Arrays.toString(sinifListesi2)); // [null, null, null, null, null]
        int[] notlar = new int[4];
        System.out.println(Arrays.toString(notlar)); // [0, 0, 0, 0]

        boolean[] blList = new boolean[8];
        System.out.println(Arrays.toString(blList)); // [false, false, false, false, false, false, false, false]

    }
}
