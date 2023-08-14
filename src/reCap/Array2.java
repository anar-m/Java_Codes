package reCap;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    /*
    Kullanıcıdan array'in boyutunu ve elemenlarını alıp
    array'i oluşturup bize döndüren bir method oluşturun
     */
    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayOlustur()));
    }
    public static int[] arrayOlustur(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen oluşturulacak Array'in boyutunu giriniz: ");
        int length = scanner.nextInt();
        int [] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Array için tam sayı olan bir eleman giriniz: ");
            array[i]= scanner.nextInt();

        }
        return array;

    }
}
