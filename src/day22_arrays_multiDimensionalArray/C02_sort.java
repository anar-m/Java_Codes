package day22_arrays_multiDimensionalArray;

import java.util.Arrays;

public class C02_sort {
    public static void main(String[] args) {

        String[] harfler = {"L","a","P","d","T","t"}; // [L, a, P, d, T, t]
        System.out.println(Arrays.toString(harfler));

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler)); // [L, P, T, a, d, t]
        /*
        Arrays.sort() array'deki harfleri Natural Order'a göre sıralar

        Array'lerde ve bundan sonra göreceğimiz ArrayList'lerde
        method kullanıldığında Array ve ArrayListjalıcı olarak değişir
        */

        String[] isimler ={"Ayşe","Yusuf","Buğra","Burak", "Abdullah", "Nergiz", "Mustafa",};
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler)); //[Abdullah, Ayşe, Buğra, Gülay, Mustafa, Nergiz, Yusuf]
                        //[Abdullah, Ayşe, Burak, Buğra, Gülay, Mustafa, Nergiz, Neslihan, Yusuf]
                        //[Abdullah, Ayşe, Burak, Buğra, Mustafa, Nergiz, Yusuf]
        int[] sayilar = {4,78,4,2,98,3,7,1};
        Arrays.sort(sayilar,3,6);
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar)); // [1, 2, 3, 4, 4, 7, 78, 98]


    }
}
