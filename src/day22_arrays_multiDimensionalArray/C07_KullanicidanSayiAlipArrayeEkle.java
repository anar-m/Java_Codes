package day22_arrays_multiDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class C07_KullanicidanSayiAlipArrayeEkle {
    public static void main(String[] args) {
        int[] arr = {3,5,8};
        // kullanıcıdan bir sayı alıp
        // arr'ye 4. element ekleyin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen array'e ekelemek istediğiniz sayıyı giriniz : ");

        int eklenecekSayi = scanner.nextInt();
        arr = C06_ArrayeBirElemanEkleme.arrayeBirElemanEkle(arr, eklenecekSayi); // [3, 5, 8, 9]

        // 5. eleman olarak 11 ekleyin
        System.out.println(Arrays.toString(arr));
        arr = C06_ArrayeBirElemanEkleme.arrayeBirElemanEkle(arr,11); // [3, 5, 8, 10, 11]
        System.out.println(Arrays.toString(arr));

    }
}
