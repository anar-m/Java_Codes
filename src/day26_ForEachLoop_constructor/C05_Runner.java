package day26_ForEachLoop_constructor;

import java.util.*;

public class C05_Runner {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        Random random = new Random();
        Set<Integer> ogrenciListesi = new HashSet<>();
        String str = new String("Java Candır");


             C04                  obje      =         new       C04();
        // class adı / data türü  isim atama işareti  keyword   constructoroble.
        System.out.println(obje.hiz); //0
        System.out.println(obje.kapasite); //0
        System.out.println(obje.ogrenciIsmi); // null
        System.out.println(obje.sayi); // 10
        obje.method1(); // method1 çalıştı
    }

    /*
    her hangi bir class'ın içinden başka bir class'daki
    class üyelerine (variable,method) ulaşmak isterseniz
    hedef class'dan bir obje oluşturabilirsiniz

    Java da bir class'ta obje oluşturmak istediğinizde
    MUTLAKA bir constructor çalışır

    Java'da objeler class'larda üretilir
    class'larda obje üretilebilmesi için CONSTRUCTOR olmalıdır.
    Java bunu bildiği için oluşturulan her class'a obje oluşturılmasını
    sağlayan DEFAULT CONSTRUCTOR yerleştirir.

    default CONSTRUCTOR görünmez
    Parametresizdir ve Body'sinde kod yoktur.

    ÖNEMLİ:
    Bir class'ta görünür bir constructor yoksa
    o class'ta default CONSTRUCTOR verdır.
    Görünür bir constructor varsa,
    Java default constructor'ı siler.


    DEFAULT kelimesi birlikte anıldığı kelime ile anlar kazanır
    default deger : class level da oluşturulan variable'lara bir değer
                     atamazsak Java default değerler atar.
    default case : switch statements da hiç bir case ile uyumlu olmayan
                   değerler için tanımlanan kodladır.

    default access modifier : içinde bulunulan class ve içinde bulunulan
                        package'da erişilebilen class üyelerini belirler

    default constructor :
     */
}
