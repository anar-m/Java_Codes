package reCAP;

import java.util.ArrayList;
import java.util.List;


public class ArraysListe3 {
    public static void main(String[] args) {
        /*
        Verilen bir array içinde tekrar eden elementleri bulup mükerrer olanı silip
        her bir elemandan sadece 1 tane içeren(unique) bir array
        oluşturup bize döndüren method oluşturunuz
        arr={3,1,2,4,1,2,3,4,5,10,2,7}
         */
        int[] arr={3,1,2,4,1,2,3,4,5,10,2,7};
        System.out.println("Tekrarsız array: "+tekrarlariSil(arr));

    }

    public static List<Integer> tekrarlariSil(int[] arr) {
        List<Integer> duzenliarr=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!(duzenliarr.contains(arr[i]))){
                duzenliarr.add(arr[i]);
            }

        }

        return duzenliarr;
    }
}