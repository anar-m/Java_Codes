package Practiced_day07;

import java.util.ArrayList;
import java.util.Scanner;

public class Not_Hesabı {

double vize1;
double vize2;
double finl;
String isim;

static ArrayList<Not_Hesabı> not = new ArrayList<>();

public Not_Hesabı(double vize1, double vize2, double finl, String isim){
    this.vize1 = vize1;
    this.vize2 = vize2;
    this.finl = finl;
    this.isim = isim;

}
public Not_Hesabı(){
    }
static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int sayac=0;
        while (sayac<2){
            System.out.println("Lütfen isiminizi giriniz: ");
            String isim = scanner.next();

            System.out.println("Lütfen vize1 notunuzu giiriniz: ");
            double vize1 = scanner.nextDouble();
            System.out.println("Lütfen vize2 notunuzu giiriniz: ");
            double vize2 = scanner.nextDouble();
            System.out.println("Lütfen Final notunuzu giiriniz: ");
            double finl = scanner.nextDouble();

            Not_Hesabı obj = new Not_Hesabı(vize1, vize2, finl, isim);
            not.add(obj);
            sayac++;

        }
        for (Not_Hesabı each: not
             ) {
            double sonuc = each.vize1*0.3 + each.vize2*0.3 + each.finl * 0.4;

            if (sonuc>80){
                System.out.println(each.isim + " Harf notunuz: " + "AA");
            } else if (sonuc>70) {
                System.out.println(each.isim + " Harf notunuz: " + "BB");
            }else if (sonuc>60) {
                System.out.println(each.isim + " Harf notunuz: " + "CB");
            }else if (sonuc>55) {
                System.out.println(each.isim + " Harf notunuz: " + "CC");
            }else {
                System.out.println(each.isim + " bu sefer olmadı biraz daha gayret et!!");
            }
        }
    }

}
