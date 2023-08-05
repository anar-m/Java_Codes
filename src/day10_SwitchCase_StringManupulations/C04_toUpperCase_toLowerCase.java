package day10_SwitchCase_StringManupulations;

import java.util.Locale;

public class C04_toUpperCase_toLowerCase {
    public static void main(String[] args) {

        String str = "Java Candır";
        System.out.println(str.toUpperCase()); // JAVA CANDIR

        str = str.toUpperCase(); // JAVA CANDIR

        System.out.println(str.toLowerCase()); //java candir

        // eğer yerel bir dile göre büyük küçük harf değişimi yapmak istersek

        System.out.println( str.toLowerCase(Locale.forLanguageTag("Tr"))); // java candır

    }
}
