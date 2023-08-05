package day10_SwitchCase_StringManupulations;

import java.util.Scanner;

public class C02_SwitchStatements {
    public static void main(String[] args) {
    //Soru 5- Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("Gün numarası giriniz");
        int gunNo= scan.nextInt();
        switch (gunNo){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hatfa içi");
                break;
            case 6:
            case 7:
                System.out.println("Hatfa sonu");
                break;
            default:
                System.out.println("Gün sayısı1-7 arasında olmalıdır");
        }
    }
}
