package day10_SwitchCase_StringManupulations;

public class C03_StringManipulations {
    public static void main(String[] args) {
        /*
        String Manipulation;
        verilen bir string üzerinde HAZIR METODLAR kullanaraK
        -değişiklik yapmak
        -veya string üzerindeki bir bilgiyi,almak için yaptığımız tüm işlemlerdir.

        String üzerinde yapılan manipulation işlemleri String i kalıcı olarak değiştirmez.

        eğer yapılan işlem sonucundaki yeni hailn kalıcı olmasını istersek
        ATAMA yapmalıyız.

         */

        String str="Java Candır";
        // str ın ilk harfini yazdırın
        System.out.println(str.charAt(0));
        //str ı tüm harfleri büyük olacak şekilde yazdırın
        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); //Java Candır

        // str ı tamamen küçük hafrlerden oluşan metne çevirin

        str = str.toLowerCase();
        System.out.println(str);



    }
}
