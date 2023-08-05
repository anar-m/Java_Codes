package day22_arrays_multiDimensionalArray;

import java.util.Arrays;

public class C05_varOalanArrayeYeniDegerAtamak {
    public static void main(String[] args) {

        /*
        ar olan bir array'e length olarak belirelenenden
        daha fazla element ATANAMAZ.

         */
        int[] arr ={3,4,5,6,8,1};
        System.out.println(arr.length); // 6
        // 7. elementi bu array'e atyabilir miyiz?
        // arr[6] = 13; // ArrayIndexOutOfBoundsException

        arr = new int[8];
        System.out.println(Arrays.toString(arr));  // [0, 0, 0, 0, 0, 0, 0, 0]


        String[] harfler = {"a","n","y"};
        String[] yeniHarfler = {"k", "l", "m", "n"};
        harfler = yeniHarfler;
        System.out.println(Arrays.toString(harfler)); // [k, l, m, n]

        System.out.println(Arrays.toString(yeniHarfler)); // [k, l, m, n]


        // eğer var olan bir array'e yeni bir değer ataması için
        // liste yazmak istiyorsak aşağıdaki gibi atama yapabiliriz
        // Ancak var olan bir array'e
        harfler = new String[]{"x" };
        System.out.println(Arrays.toString(harfler)); // [x]

    }
}
