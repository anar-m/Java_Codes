package day16_metodOlusturma_Kullanma;

public class C01_methodOlusturma {
    public static void main(String[] args) {
        /*
        Soru 1- Kullanicidan input olarak verilen bir String,
         baslangic ve bitis indexlerine gore
         baslangic index’i dahil, bitis index’i haric
         olacak sekilde aradaki harfleri yazdiran bir method olusturun.

        - kullanici baslangic degeri olarak,
         bitis degerinden buyuk bir sayi girerse, hata mesaji verin
        - kullanici str’da olan index’lerden daha buyuk bir index girerse hata mesaji yazdirin.
         */
       // String str = "Java güzeldir";
       // int basIndex = 3;
       // int bitIndex = 7;

        altString("Java güzeldir",3,7);
        altString("Biraz sabır lütfen",5,4);
        // başlangıç indexi bitiş indexinden büyük olamaz

        altString("buda mı gol değil",11,33);
        // verilen index sınırların dışında

        String str = "aramız bozulmasın";
        altString(str,5,10);

    } // main metod sonu
    public static void altString(String metin, int basIndex, int bitIndex){
        if (basIndex>bitIndex){
            System.out.println("Başlangıç indexi bitiş indexinden büyük olamaz");
        } else if (basIndex>metin.length() || bitIndex>=metin.length()) {
            System.out.println("Verilen index sınırların dışında");
        }else {
            for (int i = basIndex; i <bitIndex ; i++) {
                System.out.print(metin.charAt(i));
            }
        }
        System.out.println("");
    }



} // class sonu
