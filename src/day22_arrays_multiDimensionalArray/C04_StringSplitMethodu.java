package day22_arrays_multiDimensionalArray;

import java.util.Arrays;

public class C04_StringSplitMethodu {
    public static void main(String[] args) {

        String str= "Java candır, Selenium heyecan";
          String[]kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); //[Java, candır,, Selenium, heyecan]

        String[] yeniArr = str.split(", ");
        System.out.println(Arrays.toString(yeniArr)); // [Java candır, Selenium heyecan] buradaki boşluk ve virgül array'den geliyor

        String[] karakterler =str.split("");
        System.out.println(Arrays.toString(karakterler)); // [J, a, v, a,  , c, a, n, d, ı, r, ,,  , S, e, l, e, n, i, u, m,  , h, e, y, e, c, a, n]


    }

}
