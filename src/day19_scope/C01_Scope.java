package day19_scope;

public class C01_Scope {
    static int classLevelStatic = 12;
    String strClassLevelStaticOlmayan = "Java Güzeldir";

    public static void main(String[] args) {
        int sayiMain=20;
        System.out.println(classLevelStatic);
        // System.out.println(strClassLevelStaticOlmayan);

        for (int i = 0; i < 10; i++) {
            int sayiForLoop=5;
            System.out.println(classLevelStatic);
            // System.out.println(strClassLevelStaticOlmayan);
        }

    }
    public static void staticMethod(){
    String strStaticMethod = "Java Candır";
        System.out.println(classLevelStatic);
        // System.out.println(strClassLevelStaticOlmayan);
    }

    public void staticOlmayanMethod(){
    boolean blStaticOlamayanMethod = true;
        System.out.println(classLevelStatic);
        System.out.println(strClassLevelStaticOlmayan);

    }
    /*
    Scopre temelde ikiye ayrılır.
    1-Local  variable'lar:
        A-Scopeları içinde oluştururldukları code bloğudur.
    bir methodta oluşturulan bir variable başka methodta kullanılamaz
        B-Loop Scope'u
        bir loop içerisinde kullanılabilir
        oluşturulduğu method'da loop'un dışında da KULLANILAMAZ

        NOT:local variable'ler değer verilmeden oluşturulabilir
        ama değer verilmeden KULLANILAMAZ

    2- Class Level Variable'ler
        Class Level Variable'ler methodların ve kod bloklarının dışında oluşturulur
        ve scopeları TÜM CLASS'tır.

        Class level variable'ların scope' u tüm class olsada static keyword ta
        veriable'lerin kullanıma etki eder.

        hastane ismi, başhekim adı, hastane adresi gib variable'ler
        herkes için ortak olmalıdır. bu tür variable'ler
        STATİC oalrak işaretlenir.

        personel ismi, personel adresi,  personel telefonu gib variable'ler ise
        tüm personel için tanımlı olmakla birlikte bu veriable'lerdeki değişm herkesi ETKİLEMEZ.
        sadece o personeli etkiler.
        bu tür variable'leri static yapmayız.
        static olmaayan class level'daki variable'lara "INSTANCE" variable'ler denir.

        C- Class level Static Variable'lar:
            bu variable lar static külübüne üye oldukları için her yere gideblirler
            her method ta kullanılabilirler

        D- Class level Instance variable'lar:
            variable static olmayınca üstünlüğü olmaz. bu durumda
            seçici olan method olur.

            Static method'lar instance methodların girmesine izin vermez
            static olamayan yani instance variable!ları kabul eder.
     */


}
