package day_11StringManipulations;

public class C04_Contains {
    public static void main(String[] args) {
        String str = "Java gün geçtikçe güzelleşiyor";
        //str java içeriyor mu?
        System.out.println(str.contains("Java")); // true

        // str java içeriri mi?
        System.out.println(str.contains("java")); // false

        // str a içerir mi?
        System.out.println(str.contains("a")); // true (sadece var yok der)

        //contains metodu aranan metnin sayısıyla ilgilenmez.
        // sadece var veya yok sonucu döndürür.






    }
}
