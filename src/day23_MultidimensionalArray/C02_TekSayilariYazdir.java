package day23_MultidimensionalArray;

public class C02_TekSayilariYazdir {
    public static void main(String[] args) {
        int[][] arr = {{3,6,8},{2,5,9},{1,3},{12,23,34}};
        // verilen array'deki tek sayıları
        // aralarında bir boşluk bırakarak yan yana yazdırın
        // en sona da "toplam ... sayı yazdırıldı" şeklinde açıklama yazdırın

        int toplam = 0;
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) { // ilk forLoop outer arrayi kobntrol eder

            for (int j = 0; j < arr[i].length; j++) { // içerideki inner arrayi kontrol eder

                // arr[i][j] tüm elementleri bize getirir
                if (arr[i][j] % 2==1){

                    System.out.print(arr[i][j] + " "); // 3 5 9 1 3 23  Toplam 6adet sayı yazdırıldı.
                    sayac ++;
                }
            }
        }

        System.out.println("\nToplam " + sayac + " adet sayı yazdırıldı.");

    }
}
