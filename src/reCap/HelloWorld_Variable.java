package reCap;

import java.util.logging.SocketHandler;

public class HelloWorld_Variable {
    public static void main(String[] args) {
        String a ="Wise Quarter";
        int sayi = 12;
        double sayi2 = 12.2;
        System.out.println("Have a nice day" + a + " " + sayi+" " + sayi2 );
        long sayi3 = Long.MIN_VALUE;
        long sayi4 = Long.MAX_VALUE;
        System.out.println("LONG_MIN: "+sayi3); // LONG_MIN: -9223372036854775808
        System.out.println("LONG_MAX: "+sayi4); // LONG_MAX: 9223372036854775807

        long sayi5 =4;
        System.out.println(sayi5);

        int sayi6 =Integer.MAX_VALUE;
        System.out.println(sayi6); // 2147483647

        byte sayi8 = Byte.MAX_VALUE; // 127
        System.out.println(sayi8);

       // int sayi7=2147483648;
        long sayi7 = 2147483648L;
        System.out.println(sayi7);

    }
}