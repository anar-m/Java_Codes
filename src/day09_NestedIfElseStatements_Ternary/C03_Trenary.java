package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C03_Trenary {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz");
        int sayi= scanner.nextInt();
        if (sayi %2==0){
            System.out.println("Çift sayı");
        }else {
            System.out.println("Tek sayı");}

        System.out.println("===============");

        System.out.println(sayi %2==0 ? "çift sayı" : "Tek sayı");
    }
}
