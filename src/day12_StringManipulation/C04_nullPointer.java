package day12_StringManipulation;

public class C04_nullPointer {
    public static void main(String[] args) {

        String str1;
       // System.out.println(str1);
       // str1.concat(" candır");



        str1="java";

        System.out.println(str1); // java
        System.out.println(str1.concat(" candır")); // java candır

        /*
        null bir değer değil pointerdır (işaretleyicidir)

        26. satır için
        str2 nin değeri veya str2 ye null değeri atanmış ifadeleri YANLIŞTIR

        doğru olan ifade
        str2'ye değer atamadık. bunun farkındayız null olarak İŞARETLEDİK.
         */
        String str2= null;
        System.out.println(str2); // null
        System.out.println(str2 + " candır"); // null candır

       // System.out.println(str2.concat(" candır")); // NullPointerException (Bir metodda kullanamazsın)
        // nonprimitive variable'ları null olarak işaretleyebiliriz. metodda kullanamayız

        str2 = "tava";
        System.out.println(str2); // tava
        System.out.println(str2.concat(" candır")); // tava candır

        String str3= null;
        String str4="";
        System.out.println(str4.isBlank()); // true "" veya space'lerden mi oluşuyor
        System.out.println(str4.isEmpty()); // true

       // System.out.println(str3.isEmpty()); // NullPointerException
        // System.out.println(str3.isEmpty()); // NullPointerException

    }
}
