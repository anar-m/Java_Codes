package day18_whileLoop_DoWhilwLoop;

public class C07_DoWhileLoop {
    public static void main(String[] args) {
        /*
        3 çeşit Loop gördük.
        hepsinin avantajlı ve dezavantajlı kısımları var
        1- for Loop başlangıç ve sonucu belirli sayı olan durumlarda
        veya kaç kere tekrar edeceğimizi bildiğimiz durumlarda avantajlı

        2-while loop; kac kere tekrar edecegini bilmedigimiz
          islemleri yapmak icin avantajli

        3- do-while loop kullanıcıdan değer alarak yaptığımız işlemlerde
        ilk değer atamasını kod yazan kişinin değil de kullancının
        yapması açısından avantajlı
         */
        int bas = 10;
        int bit = 20;
        int toplam = 0;

        // while loop ie başlangıç değeri ile bitiş değeri arasındaki
        // sayıları toplayıp yazdırın (sınırlar dahil)
        // başlangıç değeri bitiş dğerinden büyükse, toplama olmamalı

        while (bas<= bit){
            toplam += bas;
            bas ++;
        }
        System.out.println("while loop ile aradaki sayilarin toplami : " + toplam);

        // simdi de do while loop ile yapalim
            bas = 4;
            bit = 20;
            toplam = 0;

        do {
            toplam +=bas;
            bas++;

        }while (bas <= bit);

        System.out.println("do while loop ile arasındaki sayıların toplamı : "+ toplam);


    }


}
