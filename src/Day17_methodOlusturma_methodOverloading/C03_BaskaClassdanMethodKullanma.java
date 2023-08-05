package Day17_methodOlusturma_methodOverloading;

import day16_metodOlusturma_Kullanma.C01_methodOlusturma;
import day16_metodOlusturma_Kullanma.C03_MethodOlusturma;

public class C03_BaskaClassdanMethodKullanma {
    public static void main(String[] args) {

        C01_methodOlusturma.altString("Metin budur",7,8); //b
         System.out.println(C03_MethodOlusturma.isimDuzenle("ömer","GÖK")); //Ömer Gök
        System.out.println(C01_AsalSayiBulma.asalSayiMi(59));
         System.out.println(C02_TamBolenlerSayisiniBulma.tamBolenlerSayisi(12)); //6

    }
}
