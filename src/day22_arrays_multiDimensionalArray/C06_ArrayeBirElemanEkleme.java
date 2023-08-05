package day22_arrays_multiDimensionalArray;

import java.util.Arrays;

public class C06_ArrayeBirElemanEkleme {
    public static void main(String[] args) {
        // verilen bir array'e verielen bir element'i ekleyin
        int[] arr = {3,7,8};
        int eklenecekSayi = 10;

        // 1- önce uzunluğu eski array den 1 fazla olan yeniarr olıuşturalım
        int[] yeniArr = new int[arr.length+1];

        // 2- arr'deki  var olan elementleri aynı indekslerle  yeni arr'ye kopyalayalım
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] = arr[i]; // [3, 7, 8, 0]
        }

        // 3- eklenecek elementi yeni array'in son indeksine atayalım
        yeniArr[yeniArr.length-1] = eklenecekSayi;

        // 4- eski arr'ye yeni değeri atayalım
        arr = yeniArr;
        System.out.println("arr'nin son hali : "+ Arrays.toString(arr)); // [3, 7, 8, 10]

        System.out.println(Arrays.toString(yeniArr)); // [3, 7, 8, 0]  // [3, 7, 8, 10]

    }
    public static int[] arrayeBirElemanEkle (int[] eskiArr, int eklenecekSayi){
        int[] yeniArr = new int[eskiArr.length+1];

        for (int i = 0; i < eskiArr.length; i++) {
            yeniArr[i] = eskiArr[i];
        }
        yeniArr[yeniArr.length-1] = eklenecekSayi;
        eskiArr = yeniArr;

        return yeniArr;
    }

}
