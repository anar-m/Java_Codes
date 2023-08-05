package Day17_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        // 1'den 100'e kadar (sınırlar dahil) sayıları
        // for loop ile hesaplayın

        int toplam=0;
        for (int i = 1; i <=100 ; i++) {
            toplam +=i;
        }
        System.out.println( "for loop ile toplama : " +toplam); //for loop ile toplama : 5050

        toplam =0;
        int i= 1;

        while (i<=100){
            toplam +=i;

            i++;
        }
        System.out.println("while loop ile toplama : " +toplam); //while loop ile toplama: 5050
    }
}
