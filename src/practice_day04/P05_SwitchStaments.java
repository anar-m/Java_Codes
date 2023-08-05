package practice_day04;

import java.util.Scanner;

public class P05_SwitchStaments {
    public static void main(String[] args) {
        //KUllanıcıdan o günün hangi gün olduğunu isteyip
        //haftanın kaçıncı günü olduğunu yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bügün günlerden hangi gün");
        String gun = scanner.next();
        gun =gun.toLowerCase();
        switch (gun){
            case "pazartesi": // switch case durumunda eğer case sayı ise direkt yazılır case metin ise " " arasında yazdırılır
                System.out.println(gun+"Haftanın 1. günüdür");
                break;
            case "salı":
                System.out.println(gun+"Haftanın 2. günüdür");
                break;
            case "çarşamba":
                System.out.println(gun+"Haftanın 3. günüdür");
                break;
            case "perşembe":
                System.out.println(gun+"Haftanın 4. günüdür");
                break;
            case "cuma":
                System.out.println(gun+"Haftanın 5. günüdür");
                break;
            case "cumartesi":
                System.out.println(gun+"Haftanın 6. günüdür");
                break;
            case "pazar":
                System.out.println(gun+"Haftanın 7. günüdür");
                break;
            default:
                System.out.println("yanlış gün girdiniz");
        }

    }
}
