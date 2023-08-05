package day21_arrays;

import java.util.Arrays;

public class C01_arrayinTumElementleriniArtirma {
    public static void main(String[] args) {
        // bir array'in tüm elementlerini 2 artırın
        /*
        Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip
        bize donduren bir method olusturun.
        Eski array’i yeni haliyle kaydedin.
         */

        int[] arr = {3,4,6,8,1};
        arr=arrayElementlerini2Artir(arr);
        // System.out.println(arr); //[I@6acbcfc0
        System.out.println(Arrays.toString(arr)); //[5, 6, 8, 10, 3]

    }
    public static int[] arrayElementlerini2Artir(int[] arr){
        for (int i = 0; i < arr.length; i++) {

           // arr[i]=arr[i] +2;
            arr[i]+=2;
        }
        return arr;

        
    }



}
