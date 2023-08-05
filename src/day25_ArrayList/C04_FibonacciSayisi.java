package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_FibonacciSayisi {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen pozitif bir n tamsayisini alarak,
         bize ilk n tane tane Fibonacci sayisini
         bir list olarak dönduren bir method olusturun.
         */
        // Fibonacci serisi : 0 1 1 2 3 5 8 13 21 34 55 89 144 233
        System.out.println(fibonacciListesiOlustur(19));


    }
    public static List<Integer> fibonacciListesiOlustur(int fibonacciSayiAdedi){

        List<Integer> fiboncacciSerisi = new ArrayList<>();
        int ilk = 0;
        int ikinci = 1;
        int temp;
        
        if (fibonacciSayiAdedi <= 0){
            System.out.println("Lütfen gıcıklık yapmayınız");
        }else if (fibonacciSayiAdedi == 1){
            fiboncacciSerisi.add(0);
            return fiboncacciSerisi;
        }else {
           fiboncacciSerisi.add(ilk);
           fiboncacciSerisi.add(ikinci);
            for (int i = 1; i <= fibonacciSayiAdedi-2 ; i++) {
                fiboncacciSerisi.add(ilk + ikinci);
                temp = ilk + ikinci;
                ilk = ikinci + temp;
            }
            
        }
        return fiboncacciSerisi;
    }


}
