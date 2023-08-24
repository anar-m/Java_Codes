package practiceday10_AlanHacimInterface;

import java.util.Scanner;

public class Kup implements IAlan,IHacim{
    Scanner scanner = new Scanner(System.in);
    static double kenar,alan,hacim;
    @Override
    public void alanHesapla() {
        System.out.println("KÜPÜN KENAR UZUNLUĞUNU GİRİNİZ: ");
        kenar=scanner.nextDouble();
        alan=6*Math.pow(kenar,2);
        System.out.println("KÜPÜN ALANI :"+alan);
    }

    @Override
    public void hacimHesapla() {
        hacim=Math.pow(kenar,3);
        System.out.println("KÜPÜN HACMİ :"+hacim);

    }
    public void KupP(){
        System.out.println("KÜPÜN HESAPLANMASINI İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ\n" +
                "=============================================================================\n" +
                "1- ALAN HESAPLA\n" +
                "2- HACİM HESAPLA\n" +
                "3- MENÜ'YE DÖN\n" +
                "4- ÇIKIŞ\n" +
                "SEÇİMİNİZ: ");
        char secim =scanner.next().toUpperCase().charAt(0);
        switch (secim){
            case '1':{
                alanHesapla();
                KupP();
            }
            case '2':{
                hacimHesapla();
                KupP();
            }
            case '3':{
                Runner runner = new Runner();
                runner.run();
            }
            case '4':
                System.exit(0);
            default:
                System.out.println("HATALI GİRİŞ YAPTINIZ..");
                KupP();

        }
    }

}