package practiceday10_AlanHacimInterface;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class DikdortgenlerPrizmasi implements IAlan,IHacim{
    static Scanner scanner = new Scanner(System.in);
    static double kenar1,kenar2,kenar3,alan,hacim;
    @Override
    public void alanHesapla() {
        System.out.println("DİKDÖRTGENLER PRİZMASININ 3 KENARINI GİRİNİZ :");
        kenar1=scanner.nextDouble();
        kenar2=scanner.nextDouble();
        kenar3=scanner.nextDouble();
        alan=2*(kenar1*kenar2+kenar1*kenar3+kenar2*kenar3);
        System.out.println("DİKDÖRTGENLER PRİZMASININ ALANI :"+alan);
    }

    @Override
    public void hacimHesapla() {
        hacim=kenar1*kenar2*kenar3;
        System.out.println("DİKDÖRTGENLER PRİZMASININ HACMİ :"+hacim);

    }
    public void dikdortgenP(){
        System.out.println("DİKDÖRTGENLER PRİZMASININ HESAPLANMASINI İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ\n" +
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
                dikdortgenP();
            }
            case '2':{
                hacimHesapla();
                dikdortgenP();
            }
            case '3':{
                Runner runner = new Runner();
                runner.run();
            }
            case '4':
                System.exit(0);
            default:
                System.out.println("HATALI GİRİŞ YAPTINIZ..");
                dikdortgenP();

        }
    }
}