package day21_arrays;

public class C03_pozitifElementleriTopla {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        sonucu bize donduren bir method yaziniz.
         */
        int[] arr={-4,5,2,0,3}; // beklenen output : 3 pozitif elementin toplamı :10


    }
    public static int pozitifElementleriTopla(int[] arr){

    int toplam =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                toplam +=arr[i];
            }

        }
        return toplam;

    }


}
