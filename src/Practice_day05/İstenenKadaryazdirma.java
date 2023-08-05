package Practice_day05;

import java.util.Scanner;

public class İstenenKadaryazdirma {
    public static void main(String[] args) {
        /*
          Kullanicidan 3 harften uzun bir kelime ve 10 dan kucuk bir sayi alin,
          Kelimenin son 2 harfini girilen sayi kadar yan yana yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz : ");
        String kelime = scan.nextLine();
        System.out.print("Lütfen bir rakam giriniz : ");
        int rakam = scan.nextInt();

        String son2Harf = kelime.substring(kelime.length()-2);
        if (rakam<9){
            for (int i = 0; i <= rakam; i++) {
                System.out.print(son2Harf);

            }
        }else{
            System.out.println("Girdiğiniz bir rakam değil sayıdır. RAkamlar 0,1,2,3,4,5,6,7,8,9 ile sınırlıdır");

        }


    }
}
