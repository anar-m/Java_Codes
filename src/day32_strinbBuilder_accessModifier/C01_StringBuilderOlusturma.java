package day32_strinbBuilder_accessModifier;

import java.net.Socket;

public class C01_StringBuilderOlusturma {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();  // boş bir sb oluşturur

        System.out.println(sb1);  // hiçlik yazdırır.
        System.out.println(sb1.length()); // 0
        System.out.println(sb1.capacity()); // 16 karakterlik yer oluşturur

        StringBuilder sb2 = new StringBuilder("Java Candır.");
        System.out.println(sb2); // Java Candır
        System.out.println(sb2.length()); // 11
        System.out.println(sb2.capacity()); // 27

        StringBuilder sb3 = new StringBuilder(9);
        System.out.println(sb3); // hiçlik yazdırır.
        System.out.println(sb3.length()); // 0
        System.out.println(sb3.capacity()); // 9

        sb3.append("Java Candır.");
        System.out.println(sb3); // Java Candır.
        System.out.println(sb3.length()); // 12
        System.out.println(sb3.capacity()); // 20 = 2*9+2

        sb3.trimToSize();
        System.out.println(sb3); // Java Candır.
        System.out.println(sb3.length()); // 12
        System.out.println(sb3.capacity()); // 12
    }
}
