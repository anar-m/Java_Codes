package day21_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C06_BaskaClasstanMethodKullanma {
    public static void main(String[] args) {

        int[] arr = {2,4,6,8};
        System.out.println("eski array : "+ Arrays.toString(arr)); //[2, 4, 6, 8]

        int[] yeniArr =C02_ArrayinElementleriniIstenenKadarArtirma.elementleriArtir(arr,4);

        System.out.println(" yeni array : "+Arrays.toString(arr)); // [6, 8, 10, 12]

        System.out.println(C03_pozitifElementleriTopla.pozitifElementleriTopla(arr)); //

        C04_ElementSay.elemanSay(arr,6); //  method void olduğu için bizim sout yapmamıza gerek yok // Aranan Sayı Array'de yok
                            // Aranan 6 sayısı array'de 1 kere kullanılmıştır.
        // kullanıcıdan bir değer alarak int bir array oluşturmak istiyorum
        int[] kullaniciArrayi= C05_ArrayOlustur.arrayOlustur();

        System.out.println(Arrays.toString(kullaniciArrayi));
    }
}
