package practice_day04;

import java.util.Scanner;

public class P01_IfElseStatements {
    public static void main(String[] args) {

        /*
        kener değerleri girilen bir üçgenin dik üçgen olup olmadığını kontrol
        edip dönüt veren kod dizilimi yazınız.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kontrol edilecek üçgenin kenar uzunluklarını giriniz");
        System.out.print("birinci kenar giriniz : ");
        int a = scanner.nextInt();
        System.out.print("İkinci kenarı giriniz :");
        int b = scanner.nextInt();
        System.out.print("Üçüncü kenarı giriniz :");
        int c= scanner.nextInt();
        System.out.println("==============1. çözüm=============");
        if ((a*a)+(b*b)==(c*c)){
            System.out.println("Girdiğiniz değerlere sahip üçgen dik üçgendir");
        } else if ((a*a)+(c*c)==(b*b)) {
            System.out.println("Girdiğiniz değerlere sahip üçgen dik üçgendir");
        } else if ((b*b)+(c*c)==(a*a)) {
            System.out.println("Girdiğiniz değerlere sahip üçgen dik üçgendir");
        }else {
            System.out.println("Girdiğiniz değerlere sahip üçgen bir dik üçgen değildir");
        }

        System.out.println("=================== 2. çözüm=======================");
       if ((a*a)+(b*b)==(c*c)|| (a*a)+(c*c)==(b*b)|| (b*b)+(c*c)==(a*a)){
            System.out.println("Girdiğiniz değerlere sahip üçgen dik üçgendir");
        }else{
            System.out.println("Girdiğiniz değerlere sahip üçgen bir dik üçgen değildir");
        }

    }
}
