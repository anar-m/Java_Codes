package practice_day04;

import java.util.Scanner;

public class P06_ForLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan pozitif bir tam sayı alın
        1'den o sayıya kadar olan sayılardan
        4 ile bölünebilenleri yazdırın
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int girilenSayi= scanner.nextInt();

        if (girilenSayi<=0){
            System.out.println("Yanlış giriş yaptınız. Lütfen pozitif bir tamsayı giriniz");
        }else {
            for (int i = 1; i <=girilenSayi ; i++) {
                if (i%4==0){
                    System.out.print(i+"-");
                }
            }
        }



    }
}
