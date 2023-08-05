package day09_NestedIfElseStatements_Ternary;

public class C04_Ternary {
    public static void main(String[] args) {

        // input oalrak verilen bir sayının 3 ile tam
        // bölünüp bölünmediğini bulunuz.
        int input=20;
        // input%3==0 ? "3 ile tam bölünüyor" : "3 ile tam bölünmüyor"
        // bu soruda ternary bize bir string döndürüyor
        // bunu YA direk yardırmalısınız
        // bunu VEYA bir String variable a atamalısınız
      //  System.out.println(input%3==0 ? \"3 ile tam bölünüyor\" : \"3 ile tam bölünmüyor\"");
        String sonuc= input%3==0 ? "3 ile tam bölünüyor" : "3 ile tam bölünmüyor";
        System.out.println(sonuc);

        // verilen input çift sayı ise "çift sayı" ,
        //input tek sayı ise 2 * input sonucunu veren bit ternary yazın

       System.out.println(input % 2==0 ? "çift sayı" : 2*input); ;
        // String sonuc2= input % 2==0? "çift sayı" : 2*input
        /*
        eğer ternary de true durumu ile false durumu bize
        farklı data türünde sonuçlar döndürüyorsa sonucu bir variable atayamayız.
        ama direk yazdırabiliriz
         */

    }
}
