package practice_day04;

import java.util.Scanner;

public class P03_NestedIfElseStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kontrol etme istediğiniz üçgenin kenar deperlerini giriniz: ");
        System.out.print("Kenar-1: ");
        double kenar1 = scanner.nextDouble();
        System.out.print("Kenar-2: ");
        double kenar2 = scanner.nextDouble();
        System.out.print("Kenar-3: ");
        double kenar3 = scanner.nextDouble();

        if (kenar1>0 && kenar2 >0 && kenar3>0){
            if (kenar1 == kenar2 || kenar1==kenar3 || kenar2==kenar3){
                System.out.println("Girdiğiniz değerler ikiz kenar üçgene aittir");
            }else {
                System.out.println("Girdiğiniz değerler ikiz kenar üçgene ait değildir");
            }
        }else {
            System.out.println(" yanlış giriş yaptınız");
        }


    }
}
