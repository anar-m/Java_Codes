package day_11StringManipulations;

import java.util.Scanner;

public class C06_Soru {
    public static void main(String[] args) {
        /*
        SORU : kullanicidan bir mail alin
  - mail @ icermiyorsa “gecersiz mail”
  - mail @gmail.com icermiyorsa, “mail gmail olmali”
  - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
 yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println(" Lütfen mail adresini giriniz");
        String mail = scan.nextLine();

        if (!mail.contains("@")){
            System.out.println("Geçersiz mail");

        } else if (!mail.contains("@gmail.com")){
            System.out.println("mail gmail olmalı");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");

        }

    }
}
