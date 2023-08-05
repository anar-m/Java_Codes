package Day17_methodOlusturma_methodOverloading;

public class C04_MethodOverLoading {
    public static void main(String[] args) {
        /*
        biz bir method call yaptığımızda java öncelikle method ismini kontrol eder.
        sonra argument olarak verilen değerler ile parametre oalrak yazılan variable'ları karşılaştırır.
        ve uyumlu ise method u çalıştırır.
        argumentler ile parametreler uyumlu değilsi CTE verir.

        java da aynı data türüne ve parametre sayısına sahip birden
        fazla method oluşturamazsınız.

        farklı data türlerinde parametreler varsa
        dizilişleri değiştirildiğinde java farklı
         */
        toplama(4,6); //10
        toplama(5.3,6); //11.3
        tolama(5,2.4);  //7.4
        toplama(4.3,2.4);  // 6.699999999999999

        toplama(3.4f,5); // 8.400000095367432
        toplama(2.3f,5f);  // 7.299999952316284
    }

    public static void toplama(int sayi1, int sayi2){ // toplama int int
        System.out.println("iki int'ın toplamı : "+ (sayi1+sayi2));
    }
    public static void tolama(int a, double b){ // toplama int double
        System.out.println("int ile double'ın toplamı : "+ (a+b));
    }
    public static void toplama(double b, int a){ // toplama double int
        System.out.println("double ile int'in toplamı : " +(a+b));
    }
    public static void toplama(double sayi1, double sayi2){ // doubel double
        System.out.println("double ile double'nin toplamı : " + (sayi1+sayi2));
    }

    /*
    method ismi + parametrelerin data türlerine method signature denir.
    Java aynı class'ta signature 'ı aynı olan iki method'a izin vermez

    bir class'ta ismi aynı fakat signature'ı farklı birden fazla method oluşturabilir.
    birden fazla method oluşturulmasına "METHOD OVERLOAADİNG" denir.
     */
}
