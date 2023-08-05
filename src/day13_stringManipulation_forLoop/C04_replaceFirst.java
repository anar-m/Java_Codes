package day13_stringManipulation_forLoop;

public class C04_replaceFirst {
    public static void main(String[] args) {
        String str= "Java Candır, kendisini çok seviyoruz123";
        // sadece ilk a'yı BÜYÜK yapın

        System.out.println(str = str.replaceFirst("a", "A")); // JAva candır

        // ilk space yi iki space haline gtir
        System.out.println(str.replaceFirst(" ", "  ")); //JAva  Candır, kendisini çok seviyoruz

        // ilk sayıyı space haline dönüştürün

        System.out.println(str.replaceFirst("\\d", " ")); // JAva Candır, kendisini çok seviyoruz 23

        // ilk özel karakeri * oalrak değiştirin
        System.out.println(str.replaceFirst("\\W", "*")); //JAva*Candır, kendisini çok seviyoruz123
    }
}
