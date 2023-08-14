package reCap;

import java.util.Scanner;

public class IfStatements {
    /*
        * kullanıcıdan aşağıdaki koşullarda bir şifre oluşturmasını isteyin.
        * 1 özel karakter içermeli
        * 1 büyük harf içermeli
        * 1 küçük harf içermeli
        * 1 sayi içermeli
        * Şifre uzunluğu en az 8 karakter olmalıdır
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir şifre oluşturunuz.");
        System.out.println("Şifrenizin içinde en az bir adet \nBüyük harf\nKüçük harf\nRakam" +
                "\nözel karakterler"+"(!'^$%'^*+-,/)"+"\nolmalıdır.");

        String sifre = scanner.next();
        int sayacBH=0;
        int sayacKH=0;
        int sayacRkm=0;
        int sayacOKrk=0;
        boolean pass = true;

        for (int i = 0; i < sifre.length(); i++) {
            if (sifre.charAt(i)>='A' && sifre.charAt(i)<='Z'){
                sayacBH++;
            } else if (sifre.charAt(i)>='a' && sifre.charAt(i)<='z') {
                sayacKH++;
            } else if (sifre.charAt(i)>='0' && sifre.charAt(i)<='9') {
                sayacRkm++;
            } else if (sifre.charAt(i)>='!' && sifre.charAt(i)<='/') {
                sayacOKrk++;
            }else {
                System.out.println("Lütfen verilen koşulları sağlayınız.");
            }
        }
        if (sifre.length()<8){
            System.out.println("Şifreniz 8 karakterli olmalıdır.");
            pass = false;
        }
        if (sayacBH==0){
            System.out.println("Şifreniz en az bir büyük harf içermeldir.");
            pass = false;
        }
        if (sayacKH==0){
            System.out.println("Şifreniz en az bir küçük harf içermeldir.");
            pass = false;
        }
        if (sayacRkm==0){
            System.out.println("Şifreniz en az bir rakam içermeldir.");
            pass = false;
        }
        if (sayacOKrk==0){
            System.out.println("Şifreniz en az bir özel karakter içermeldir.");
            pass = false;
        }
        if (pass){
            System.out.println("Şifreniz başarıyla oluşturuldu.");
        }
    }


}
