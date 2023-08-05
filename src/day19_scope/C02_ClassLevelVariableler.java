package day19_scope;

public class C02_ClassLevelVariableler {
    static boolean bls;
    static boolean bli;

    static String strs="Java";
    static String stri;
    static int sayis;
    static int sayii = 23;
    static char chrs = 'a';
    static char chri;

    public static void main(String[] args) {
        System.out.println(bls);  // false
        System.out.println(strs); // Java
        System.out.println(sayis); // 0
        System.out.println(chrs); // a

        C02_ClassLevelVariableler obj = new C02_ClassLevelVariableler();
       System.out.println(bli); // false
       System.out.println(stri); // null
       System.out.println(sayii); // 23
        System.out.println(chri); // a


    }

    /*
     Class level kurallar
        1- class level variable'lara deger atanmasa da
           hem olusturulabilir, hem de kullanilabilir.
           deger atamasi yapmadiysak, java onlara default olan degerleri atar
           boolean ==> false
           sayisal variabler ==> 0
           non-primitive variable'lar ==> null
           char ==> '' char olarak hiclik
        2-  instance variable'lara static method'lar icinden direk ULASILAMAZ
            Eger static method icinde, instance variable kullanmamiz gerekirse
            O class'dan bir obje olusturup
            o obje uzerinden instance variable'lara ulasabiliriz
        3- Baska class'daki class level variable'lara ulasmak istersek
            static variable'lar icin classIsmi.staticVariableIsmi
            yazarak ulasabiliriz
            instance variable'lara ulasmak icin ise
            variable'larin oldugu class'dan obje olusturmaliyiz

            eger static bir variable'a obje uzerinden ulasmak isterseniz
            Java otomatik olarak getirmez
            ama elle yazarsaniz kabullenir

            intellij static variable'a insatance gibi obje uzerinden ulasirsaniz
            kodu sariya boyayarak sizi uyarir

     */
}
