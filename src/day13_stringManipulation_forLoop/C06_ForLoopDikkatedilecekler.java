package day13_stringManipulation_forLoop;

public class C06_ForLoopDikkatedilecekler {
    public static void main(String[] args) {
        // verdiğimiz başlangıç değeri bitiş şartını sağlamazsa;
        // forLopp çalışır ANCAK forLoop body si DEVREYE GİRMEZ
        for (int i = 0; i > 10; i++) {
            System.out.println(i);
        }

        // başlangıç değeri ve değişim şekli hiç bir zaman bitiş değerine ulaşmazsa;
        // sonsuz loop oluşur

        /*
         for (int i = 0; i>=0; i++);
         */
        // kullanıcının verdiği başlangıç vebitliş değerleri dahil olarak
        // bu sayıların arasında aranan sayıya tam bölüne bilen bir sayı  varsa
        // "aranan sayı ile tam bölünebilen bir sayı var yazdırın
        int baslangic= 201;
        int bitis= 237;

        int arananSayi= 43;

        for (int i = baslangic; i <= bitis ; i++) {
            System.out.println(i);
            if (i % arananSayi == 0){
                System.out.println("aranan sayı ile tam bölünebilen bir sayı var");
                break;
            }

        }

    }
}
        /*
            bir loop devam ederken
            eger bir degerde istedigimiz islem gerceklesir
            ve loop'un geri kalanina ihtiyacimiz olmazsa
            orada break kullanabiliriz
            Java break; komutunu gordugunde loop'u calistirmayi birakir
        */