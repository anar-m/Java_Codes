package day23_MultidimensionalArray;

public class C01_TumElementleriToplama {
    public static void main(String[] args) {
       int[] arrTek = {3,7,1,9,2};
        // bu array'in tüm elementlerini toplayın
        int toplam = 0;
        for (int i = 0; i < arrTek.length; i++) {
            // arrTek[i] index değiştikçe bize array'deki tüm elementleri sırasıyla getirir.
            toplam += arrTek[i];
        }
        System.out.println("arrTek'in elementleri toplamı : " + toplam);
        int[][] sayilar = {{1,2,5,},{7,4},{9},{3,0,1,6,8}};
        // arr[i] inner array'şeri getirir
        // arr[i][j]bize int elementleri verir
        // yani kat sayısı kadar index'e yani for loop 'a ihtiyacımkz var

        toplam = 0;
        for (int i = 0; i < sayilar.length ; i++) { // dışarıdaki forloop outer array'i kontrol eder
            for (int j = 0; j < sayilar[i].length ; j++) {  // içerideki forloop inner array'leri kontrol eder

                // sayılar[i][j] sırasıyla her bir int elementi getirir
                toplam += sayilar[i][j];
            }

        }
        System.out.println(" sayılar array'inin elementleri toplamı : "+ toplam);
    }
}
