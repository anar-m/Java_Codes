package day22_arrays_multiDimensionalArray;

public class C01_Arrays {
    public static void main(String[] args) {

        String[] isimler ={"Ayşe","Yusuf","Buğra","Abdullah", "Nergiz","Mustafa", "Gülay"};
        // verilen bir array'deki uzunluğu tek sayı olan isimleri
        // yan yana aralarında bir boşluk bırakarak

       int sayac =0;
       int kelimeUzunlugu=0;


        for (int i = 0; i < isimler.length; i++) {
            kelimeUzunlugu = isimler[i].length();
            if (kelimeUzunlugu % 2 !=0){ //  if (kelimeUzunlugu % 2 ==1) de yazılabilir
                System.out.print(isimler[i] + " ");
                sayac ++;
            }
        }
        System.out.println("\nToplam "+ sayac + " adet isim yazdırıldı.");
    }
}
