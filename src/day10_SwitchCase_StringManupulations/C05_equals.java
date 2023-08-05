package day10_SwitchCase_StringManupulations;

public class C05_equals {
    public static void main(String[] args) {
    String str1 = "Mehmet";
    String str2 = "MEHMET";
    String str3 = "mehmet";
    String str4 = "MEHmet";

        System.out.println(str1 == str2); //false

        System.out.println(str3 == str4.toLowerCase()); //mehmet == mehmet

        System.out.println(str2 == str3.toUpperCase()); // MEHMET == MEHMET

        /*
            String'lerde == beklediğimiz sonuçları DÖNMEYEBİLİR
            bunun sebebi String class'ını oluştururken yapılan bazı özellilllerdir.
            bu konu ileride detaylı anlatılacaktır.

            Verilen iki String in metinsel olarak aynı olup olmadığını kontrol etmek için ==
            yerine equals metodu kullanılır.

            Equals ()'u birebir aynı olan iki metin için true,
            farklı metimler için false sonucu döndürür.
            bu karşılaştırmada metnin aynı olması yanında
            büyük küçük harf durumunu da kontrol eder(case sensitive)

            EĞER case sensitive olmadan metinleri karşılaştırmak isterseniz
            equalsIgnoreCase()'u kullanılır

         */

        System.out.println(str1.equals(str2)); // Mehmet--MEHMET false

        System.out.println(str3.equals(str4.toLowerCase())); // mehmet == mehmet

        System.out.println(str2.equals(str3.toUpperCase())); // MEHMET == MEHMET

        System.out.println(str1.equalsIgnoreCase(str2)); // Mehmet -- MEHMET

        System.out.println(str1.equalsIgnoreCase(str3)); // Mehmet -- mehmet

        System.out.println(str3.equalsIgnoreCase(str4)); // mehmet-- MEHmet


    }
}
