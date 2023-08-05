package day13_stringManipulation_forLoop;

public class C02_ReplaceAll {
    public static void main(String[] args) {
        String str = "1Ja4va 8C9a2n5d1i1r.";

        str= str.replace("1", "");
        System.out.println(str); //Ja4va 8C9a2n5dir.

        // sayıların tamamından kurtulmak istersek replaca metodu yeterli olmaz
        // Javada sayılar, özel karakterler, lafabetik karatkerlerin tümüyle işelm yapmak
        // isterseniz replacaAll(istenenGrup, yeni değer)
        // bütün sayıların yerine "" atamak için


        str=str.replaceAll("\\d","");
        System.out.println(str); // Java Candir.
        /*
         // java da sayilar, ozel karakterler, alfabetik karalkterlerin
        // tumuyle islem yapmak isterseniz
        // replaceAll(istenenGrup, yeniDeger)
        // ornegin butun sayilarin yerine "" atamak icin
        str= str.replaceAll("\\d" ,"");
        System.out.println(str); // Java Candir.

        /*
        Regex (Regular Expressions)
            \\s : space     \\S : space olmayan hersey
            \\s+ : yanyana birden fazla space
            \\d : digits        \\D : digit olmayan hersey
            \\w : harf veya rakam   \\W : harf veya rakam olmayan hersey
         */

    }
}
