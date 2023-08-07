package day32_strinbBuilder_accessModifier;

public class C03_StringBuilder_StringMethodlari {
    public static void main(String[] args) {

        String str = "Java Candır";
        StringBuilder sb1 = new StringBuilder();
        // sb1 = str;
        // Non-primitive data türlerinde farklı data türleri arasında atama yapabilmek için
        // bu iki Non-primitive data türü arasında Parent-Child ilişkisi olmalıdır.

        sb1 = new StringBuilder(str);

        System.out.println(sb1); // Java Candır

        System.out.println(sb1.substring(0, 4)); // Java

        System.out.println(sb1); // Java Candır

        // sb1 J harfi içeriyor mu?
        System.out.println(sb1.toString().contains("J"));  // true
        // sb1 String Builder da olmayıp String de olan methodları kullanmak istersek
        //StringBuilder.toString() ile String'e geçiş yapabiliriz
        // bu durumda çalışan methodların sb'i kalıcı olarak değiştirmeyeceklerini UNUTMAMALIYIZ.


    }
}
