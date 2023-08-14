package reCap;

import java.util.Scanner;

public class DataCasting {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir harf girmesini isteyip o harften sonra gelen ilk 3 harfi yazdıralım
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz: ");
        char harf = scanner.next().charAt(0);
        System.out.println("Girdiğiniz harften sonra gelen harfler sırasıyla : "+((char)(harf+1))+" "+
                ((char)(harf+2))+" "+ (char)(harf+3)+" dir.");
    }
}
