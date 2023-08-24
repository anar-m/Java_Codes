package practiceday10_AlanHacimInterface;

import java.util.Scanner;

public class Runner {
    Scanner scanner = new Scanner(System.in);
    void run(){
        System.out.println("HESAPLAMAK İSTEDİĞİNİZ GEOMETRİK CİSMİ SEÇİNİZ\n" +
                "==============================================================\n" +
                "1- DİKDÖRTGENLER PRİZMASI\n" +
                "2- KÜP\n" +
                "3- KÜRE\n" +
                "Q- ÇIKIŞ\n" +
                "SEÇİMİNİZ: ");
        char secim =scanner.next().toUpperCase().charAt(0);
        switch (secim){
            case '1':{
                DikdortgenlerPrizmasi dikdortgenlerPrizmasi = new DikdortgenlerPrizmasi();
                dikdortgenlerPrizmasi.dikdortgenP();
            }
            case '2':{
                Kup kup = new Kup();
                kup.KupP();

            }
            case '3':{
                Kure kure = new Kure();
                kure.kureP();
            }
            case 'Q':
            default:
                System.out.println("HATALI GİRİŞ YAPTINIZ..");
                run();
        }
    }
}