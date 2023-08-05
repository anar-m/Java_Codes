package Day17_methodOlusturma_methodOverloading;

public class C05_MethodOverLoading {
    public static void main(String[] args) {

        String str = "Java gün geçtikçe güzelleşiyor";
      /*
       method overloading olan bir class'da
       hangi method'un calisacagina karar vermek icin
       asagidaki siralamaya gore method'lar incelenir
      1-isim
      2-parametre sayısı
      3-argument-parametre uyumu
       */
        toplama('s'); // tek int girilirse 2 kati yazilir : 230
        toplama(3,4); // iki int'in toplami : 7
        toplama('a', 'b'); // iki int'in toplamı // 195

        toplama(5,6,5.3); // 3 double'ın toplamı 16.3



    }
    public static void toplama(int sayi1, int sayi2){ // toplama int int
        System.out.println("iki int'in toplami : " + (sayi1+sayi2));
    }
    public static void toplama(double sayi1, double sayi2){ // doubel double
        System.out.println("double ile double'in toplami : " + (sayi1 + sayi2));
    }
    public static void toplama(double b, int a){ // toplama double int
        System.out.println("double ile int'in toplamı : " +(a+b));
    }
    public static void toplama(int sayi){
        System.out.println("tek int girilirse iki katı yazılır : "+ 2*sayi);
    }
    public static void toplama(int a, int b, int c){
        System.out.println("3 int'in tolamı: " +(a+b+c));
    }
    public static void toplama(double a, double b, double c){
        System.out.println(" 3 double'nin toplamı : " + (a +b + c));
    }
}
