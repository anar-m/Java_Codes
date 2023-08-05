package day26_ForEachLoop_constructor;

import java.util.Arrays;

public class C02_HarfkukkanimAdedi {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin,
        harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
         kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
         */
        String cumle = "Java her gecen gun daha zevkli hale geliyor";
        String harf = "e";

        String[] cumleArr = cumle.split("");
        System.out.println(Arrays.toString(cumleArr));

        int sayac = 0;

        for (String each: cumleArr
             ) {
            if (each.equals(harf)){
                sayac++;
            }

        }

        if (sayac ==0){
            System.out.println("Aradığınız harf cümlede kullanılmamıştır");
        }else {
            System.out.println("Aradığınız '" + harf + "' cümlede " + sayac + " kere kullanılmıştır");
        }
    }

}
