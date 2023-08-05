package day13_stringManipulation_forLoop;

import java.util.Scanner;

public class C03_ReplacaAll {
    public static void main(String[] args) {
        //Kullanıcıdan bir metin isteyin
        // metindeki tüm sayıları ve space dışındaki özel karakterleri temizleyin
        // metnin sonuna da . koyun
        // örnek input: J1*2av4.a C67//an=+dir--_
        //      output: "Java Candir"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen istediğiniz mesajı girin: ");
        String metin = scanner.nextLine();

        // önce sayılardan kurtulalım
        metin = metin.replaceAll("\\d", ""); // J*av.a C//an=+dir--_ \\d : digits        \\D : digit olmayan hersey

        // ozel karakterlerden kurtulmak istedigimizde, space de kaybolur
        // bunun icin once space'i korumaya almaliyiz
        // artik metnimizde sayi yok, onun icin space yerine herhangi bir sayiyi atayalim

        metin = metin.replaceAll("\\s", "1"); // J*av.a1C//an=+dir--_ \\s : space     \\S : space olmayan hersey

        // ozel karakterlerden kurtulalim
        metin = metin.replaceAll("\\W", ""); // Java1Candir_  \\w : harf veya rakam   \\W : harf veya rakam olmayan hersey

        // space yerine atadigimiz 1'i yeniden space yapalim
        metin = metin.replaceAll("1", " "); // Java Candir_

        metin= metin.replace("_","");
        metin = metin + ".";

        System.out.println(metin); // Java Candir.

    }
}
