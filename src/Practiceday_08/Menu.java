package Practiceday_08;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner scanner=new Scanner(System.in);
    static ArrayList<User> kullanicilar=new ArrayList<>();
    static Registration registration=new Registration();

    public static void menu(){
        /*
        -kayıt alma
        -şanslı kullanıcı
        -kullanıcıları listeleme
        -çıkış
         */
        boolean cikis=true;
        do {
            System.out.print("1. Kayıt İşlemi\n" +
                    "2. Kişi Listele\n" +
                    "3. Şanslı Kişiler\n" +
                    "4. Çıkış\n" +
                    "SEÇİMİZ: ");
            int secim=scanner.nextInt();
            switch (secim){
                case 1:
                    kullanicilar=Registration.register();
                    break;
                case 2:
                    registration.kullaniciListesi(kullanicilar);
                    break;
                case 3:
                    Registration.printHappyUsers(kullanicilar);
                    break;
                case 4:
                    cikis=false;
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız....");
                    break;
            }

        }while (cikis);
    }
}