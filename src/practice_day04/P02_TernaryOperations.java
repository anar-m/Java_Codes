package practice_day04;

import java.util.Scanner;

public class P02_TernaryOperations {
    public static void main(String[] args) {
        /*
        Soru : Kenar değerleri verilen üçgenin ikiz kenar olup olmadığını
        kontrol edip dönüt veren kod dizisi yazınız.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kontrol etmek istediğiniiz üçgenin kenar değerlerini giriniz: ");
        System.out.print("Kenar 1 : ");
        double kenar1 = scanner.nextDouble();
        System.out.print("Kenar 2 : ");
        double kenar2 = scanner.nextDouble();
        System.out.print("Kenar 3 : ");
        double kenar3 = scanner.nextDouble();

        System.out.println(kenar1>0 && kenar2>0 && kenar3>0?
                (kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3?
                        "Girdiğiniz değerler bir ikizkenar üçgene aittir" :
                        "Girdiğiniz değerler bir ikizkenar üçgene ait değildir"):
                        "Yanlış değer girdiniz ");

    }
}
