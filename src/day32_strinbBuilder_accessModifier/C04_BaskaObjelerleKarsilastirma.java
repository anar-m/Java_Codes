package day32_strinbBuilder_accessModifier;

public class C04_BaskaObjelerleKarsilastirma {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        System.out.println(sb1==sb2); // false
        System.out.println(sb1.equals(sb2));  //  false

        //SB'da equals method'u yerine comparateTo() kullanılır

        System.out.println(sb1.compareTo(sb2));  // 0= hiç fark yok demektir.

       // System.out.println(sb1 == str);
        System.out.println(sb1.equals(str)); // itiraz etmez ama false döner

        // equals sadece objenin kendisi ile karşılaştıırıldığı durumda true döner.

        System.out.println(sb1.equals(sb1)); // true


    }
}
