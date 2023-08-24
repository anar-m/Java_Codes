package practiceday10_AlanHacimInterface;

import java.util.Scanner;

public class Kure implements IAlan,IHacim{
    Scanner scanner = new Scanner(System.in);
    static double yariCap,alan,hacim;
    @Override
    public void alanHesapla() {
        System.out.println("KÜRENİN YARIÇAPINI GİRİNİZ: ");
        yariCap=scanner.nextDouble();
        alan=4*Math.PI*Math.pow(yariCap,2);
        System.out.println("KÜRENİN ALANI :"+alan);
    }

    @Override
    public void hacimHesapla() {
        hacim=(4/3)*Math.PI*Math.pow(yariCap,3);
        System.out.println("KÜRENİN HACMİ :"+hacim);

    }
    public void kureP(){
        System.out.println("KÜRENİN HESAPLANMASINI İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ\n" +
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
                kureP();
            }
            case '2':{
                hacimHesapla();
                kureP();
            }
            case '3':{
                Runner runner = new Runner();
                runner.run();
            }
            case '4':
                System.exit(0);
            default:
                System.out.println("HATALI GİRİŞ YAPTINIZ..");
                kureP();

        }
    }
}