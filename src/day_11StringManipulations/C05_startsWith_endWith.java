package day_11StringManipulations;

public class C05_startsWith_endWith {
    public static void main(String[] args) {

        String str = "Java cok guzel";
                // str Java ile mi başlıyor

        System.out.println(str.startsWith("Java"));  // true
        // str J ile mi başlar

        System.out.println(str.startsWith("J")); // true

        // str Ja ile mi başlıyor

        System.out.println(str.startsWith("Ja")); // true

        // str "Java cok guzel" mi başlıyor

        System.out.println(str.startsWith("Java cok guzel")); // true

        System.out.println(str.startsWith("")); // hiçlik true

        // 5. indexden sonrası c ile mi başlar?

        System.out.println(str.startsWith("c", 5)); // true

        // 6. indexden sonrası ok ile mi başlar?

        System.out.println(str.startsWith("ok",6)); // true

        //"Java cok guzel";
        // str guzel ile mi biter
        System.out.println(str.endsWith("guzel"));
        // str "el" ile mi biter

        System.out.println(str.endsWith("el"));
        // str "" ile mi biter

        System.out.println(str.endsWith(""));
        System.out.println(str.endsWith(" "));




    }
}
