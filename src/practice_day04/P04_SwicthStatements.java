package practice_day04;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class P04_SwicthStatements {
    public static void main(String[] args) {
        /*
        Kullanıcının doğduğu ayı girmesini isteyip hangi ayda doğduğu yazdırın kod dizisini yazdırın
                */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen doğum tarihinizin ay hanesindeki sayıyı yazınız");
        int month= scanner.nextInt();

        switch (month){
            case 1:
            System.out.println("ocak ayında doğmuşsunuz");
            break;
            case 2:
                System.out.println("şubatayında doğmuşsunuz");
                break;
            case 3:
                System.out.println("mart ayında doğmuşsunuz");
                break;
            case 4:
                System.out.println("nisan ayında doğmuşsunuz");
                break;
            case 5:
                System.out.println("mayıs ayında doğmuşsunuz");
                break;
            case 6:
                System.out.println("haziran ayında doğmuşsunuz");
                break;
            case 7:
                System.out.println("temmuz ayında doğmuşsunuz");
            case 8:
                System.out.println("ağustos ayında doğmuşsunuz");
            case 9:
                System.out.println("eylül ayında doğmuşsunuz");
                break;
            case 10:
                System.out.println("ekim ayında doğmuşsunuz");
                break;
            case 11:
                System.out.println("kasım ayında doğmuşsunuz");
                break;
            case 12:
                System.out.println("aralık ayında doğmuşsunuz");
                break;
            default:
                System.out.println(month + "olarak girdiğiniz sayıda bir ay yoktur. Yanlış giriş yaptınız");
        }




    }
}
