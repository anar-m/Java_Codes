package Practiced_day07;

public class multiDimensionalArray01 {
    /*
       Bir okulun öğrencilerinin matematik sınav notlarını saklamak için
       bir program yapmanız gerekmektedir. Her öğrenci için
       iki dönemlik (örneğin, ilk ve ikinci dönem) sınav notlarını saklamak için
       kullanmanız gerekmektedir. öğrencilere ait notları ve dönem ortalamasını hesaplayan
       Java programını yazınız:
        */
    // MultiDiomensional Array : iç içe array={{5. sınıföğrencileri},{6. sınıf öğrencileri}}
    // arr={{{5A},{5B},{5C}}{{6A},{6B}}}
    // [][] : çoklu array tanımlamasıdır. her array için bir [] kullanılır

    public static void main(String[] args) {
       // sınav notları için her bir öğrenci içn bir dönem notunu ekleyeceğimiz içiçe 2'li array oluşturalım
        int[][] sinavNotlari = {
                {80,100}, // 1. öğrencinin dönem notları
                {75,90},  // 2. öğrencinin dönem notları
                {100,100},  // 3. öğrencinin dönem notları
                {60,60},  // 4. öğrencinin dönem notları
                {30,90}  // 5. öğrencinin dönem notları
        };
        for (int i = 0; i < sinavNotlari.length; i++) {
            int ilkDonemNotu = sinavNotlari[i][0];
            int ikinciDonemNotu = sinavNotlari[i][1];

            System.out.println(i+1 + " Öğrencinin notları"); // İndex 0'dan başladığı için index'i sıfır olan öğrenci 1. öğrencidir.
            System.out.println("Birinci dönem notu: " + ilkDonemNotu);
            System.out.println("İkinci dönem Notu : "+ ikinciDonemNotu);

            // iç içe array'leri çağırıyoruz
            // {{0,1,2,3,4},{0,1,2,3},{0,1}} [0][3]--->3

            double yilSonuNotu = (ikinciDonemNotu+ilkDonemNotu)/2.0;
            System.out.println("Yıl sonu ortalaması : " + yilSonuNotu);
            System.out.println("--------------------------------------------------------");
        }






    }
}
