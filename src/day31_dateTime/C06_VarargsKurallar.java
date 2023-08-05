package day31_dateTime;

public class C06_VarargsKurallar {
    public static void main(String[] args) {
        //kullanıcı kaç tane argument verirse versin
        // ilk element hariç diğer elementleri toplayıp
        // bulunan toplamı ilk element ile çarpıp
        // sonucu yazdıran bir method oluşturun

        islemYap(3,4,5);
        islemYap(2,4,7,8,9,1);



    }

    private static void islemYap(int ilkSayi, int... kalanlar) {

        int toplam =0;
        for (int eachSayi: kalanlar
             ) {
            toplam += eachSayi;
        }
        int sonuc = ilkSayi * toplam;
        System.out.println("istenen işlemin sonucu :" + sonuc); // istenen işlemin sonucu :27 istenen işlemin sonucu :58
    }
}
        /*
        Varargs sınırsız sayıda element alabildiğinden dolayı
        gelen her elementi alacaktır

        bo özelliğinden dolayı, varargs bir method da parametre olarak kullanılacaksa
        SON PARAMETRE olarak yazılmak zorundadır

        bu kuralın doğal sonucu olarak bir method da birden fazla varargs  parametre olamaz

        */