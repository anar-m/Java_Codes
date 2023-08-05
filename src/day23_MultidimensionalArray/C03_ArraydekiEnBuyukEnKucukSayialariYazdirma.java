package day23_MultidimensionalArray;

public class C03_ArraydekiEnBuyukEnKucukSayialariYazdirma {
    public static void main(String[] args) {
        // verilen 2 katlı bir array'deki en büyük ve en Küçük
        // sayıyı yazdıran bir method oluşturun
        int[][] arr = {{3,6,8},{2,5,9},{1,3},{12,23,34}};
        EnBuyukEnKucukYazdir(arr);
    }

    public static void EnBuyukEnKucukYazdir(int[][] arr){

        int enKucukSayi = arr[0][0];
        int enBuyukSayi = arr[0][0];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if ( arr[i][j] < enKucukSayi){
                    enKucukSayi = arr[i][j];
                }
                if (arr[i][j] > enBuyukSayi){
                    enBuyukSayi = arr[i][j];
                }
            }

        }
        System.out.println("En küçük sayı : " + enKucukSayi); // En küçük sayı : 1

        System.out.println("En Büyük sayı : " + enBuyukSayi); // En Büyük sayı : 34
    }

}
