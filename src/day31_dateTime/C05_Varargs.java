package day31_dateTime;

public class C05_Varargs {
    public static void main(String[] args) {
        toplama(3,5); //  verilen int sayıların toplamı : 8
        toplama(3,5,7); //  verilen int sayıların toplamı : 15
        toplama(3,5,1,2); //  verilen int sayıların toplamı : 11
        toplama(3,6,8,1,3); //  verilen int sayıların toplamı : 21
        toplama(2,4,5,6,7,8); //  verilen int sayıların toplamı : 32

        /*
        int... uzunluğu esnek bir array olan varargs'i temsil eder
        argument olarak kaç tane int verirsek verelim
        varargs hepsini bir array olarak bünyesine alır.
         */
    }
    public static void toplama( int... sayi1){

        int toplam = 0;
        for (int i = 0; i < sayi1.length; i++) {
            toplam += sayi1[i];
        }

        System.out.println("verilen int sayıların toplamı : "+toplam);

    }



}
