package day16_metodOlusturma_Kullanma;

public class C04_BaskaClasstanMethodKullanimi {
    public static void main(String[] args) {

        C01_methodOlusturma.altString("method",1,3); //et

        System.out.println(C03_MethodOlusturma.isimDuzenle("bugra","CAN")); // Bugra CAN
        String isimDuzenle = C03_MethodOlusturma.isimDuzenle("mehmet","kemal");

        // düzenlenmiş isminuzunluğunu yazdırın
        System.out.println(isimDuzenle.length());
        /*
            void olan methodta sonucu KAYDEDEMEYİZ, sadece yazdırırız.

            bize değer DÖNDÜREN methodta ise sonucu istersek direk yazdırırız istersek te kaydederiz
             */






    }
}
