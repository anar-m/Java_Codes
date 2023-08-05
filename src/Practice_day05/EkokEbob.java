package Practice_day05;

import java.util.Scanner;

public class EkokEbob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif iki tam sayı giriniz : ");
             int num1= scanner.nextInt();
             int num2= scanner.nextInt();

            int flag=0;
            System.out.println("Girdiğiniz sayılar sırasıyla: "+num1+"-"+num2);

            //Önce EBOB hesaplaması yapalım
            //ilk olarak küçük sayıyı ebob değişkenine atıyorum
            //30 ve 40 için ebob'u ilk oalrak 30 atadaık.

            int limitEbob=0;

            if (num1<num2){
            limitEbob=num1;
            }else{
             limitEbob=num2;
            }
        //Atanan limitEbob değerini birer azaltarak en büyük ortak böleni buluyoruz
        //30 değerinden başlayıp 1'er azaltarak ikisini de bölebilecek en büyük sayıyı arıyor

        for (int i=limitEbob ; i>=2; i--){
            if (num1%i==0 && num2%i==0){
                System.out.println("Bu sayıların EBOB değeri: "+ i);
                flag++;
                break;
            }
        }
        //flag değerinin hiç artmaması ortak bölen bulamadığı anlamına gelir

        // girilen sayıların en küçük ortak katını (Ekok) bulunuz
        flag = 0;
        System.out.println("Lütfen Ekok değeri olabilecek maksimum limiti giriniz : ");
        // fo Loop yazarken birden başlayıp bir limit koyarak i değerini birer artırarak ilerleyeceğiz
        for (int i = 1; i < (num1*num2) ; i++) {
            if (i%num1==0 && i%num2==0 ){
                System.out.println("Girdiğiniz sayıların Ekok değeri : "+i);
                flag++;
                break;
            }
        }
        if (flag==0){
            System.out.println("Girdiğiniz sayıların belirtiğiniz limit değerinden küçük bir Ekok değeri yoktur.");
        }
    }
}
