package day22_arrays_multiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_binarySearch {
    public static void main(String[] args) {
        int[] arr = {0,13,4,7,10,2,1,23};

        System.out.println(Arrays.binarySearch(arr, 13)); // 8
        System.out.println(Arrays.binarySearch(arr, 7)); //3
        System.out.println(Arrays.binarySearch(arr, 10)); //-8
        System.out.println(Arrays.binarySearch(arr, 4)); //-2

        //Binary yapısı çok büyük dataları kolayca depolayabilmek
        // için javanın kullandığı bir yöntemdir.
        /*
        Binary mantığı aranan sayının kolayca bulunmasına dayanır.
        ortadan başlar. BinarySearch'ün sağlıklı işlewmesi için
        öncelikle array'i küçükten büyüye doğru sıralamalısınız
        Sıralama yapmadan BinarySearck yapılırsa sonuç için hiç bir şey diyemeyiz
        doğru da olabilir yanlış ta olabilir.
        yani cevap öngörülemez.
         */

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 4, 7, 10, 13, 23]

        System.out.println(Arrays.binarySearch(arr, 13)); // 6
        System.out.println(Arrays.binarySearch(arr, 7)); // 4
        System.out.println(Arrays.binarySearch(arr, 10)); // 5
        System.out.println(Arrays.binarySearch(arr, 4)); // 3

        // olmayan bir elementi aratırsak

        System.out.println(Arrays.binarySearch(arr, -5)); // -1
        System.out.println(Arrays.binarySearch(arr, 5));  // -5
        System.out.println(Arrays.binarySearch(arr, 25)); // -9
        System.out.println(Arrays.binarySearch(arr, 44)); // -9-1


    }
}
