package day_11StringManipulations;

public class C03_substring {
    public static void main(String[] args) {

        String str = "Java Candir";
        /*
        substring metodu bize verilen bir string in istenen parçasını alma imkanı tanır
        2 türlü kullanımı vardır
        1- başlangıç indeksini verirseniz o indeksten sona kadar olan kısmı verir
        2- başlangıç ve bitiş indexlerini verirseniz
            başlangıç index'inden (dahil) başlar
            bitiş index'sine kadar (hariç) aradaki karakterleri yazdırır.


         */
        System.out.println(str.substring(3)); // a Candir
        System.out.println(str.substring(7)); // ndir
        System.out.println(str.substring(0)); // Java Candir
        System.out.println(str.substring(11)); // hiçlik verir

        System.out.println(str.substring(3,6)); // a C
        System.out.println(str.substring(5,10)); // Candi
        System.out.println(str.substring(1,2)); // a
        System.out.println(str.substring(6,7)); // a

        // bu yazım bize istenen index'teki tek bir elementi verir
        //charAt () e benzer. Artı bir özelliği vardır
        // substring bize string verdiği için manipulations yapmaya devam edebiliriz

        // 6. indexteki harfi büyük harf olarak yazdırın
        System.out.println(str.substring(6,7).toUpperCase());

        System.out.println(str.substring(3,3)); // hiçlik yazdırır

         // System.out.println(str.substring(8,5)); // StringIndexOutOfBoundsException
        // son üç harfi yazdırın
        System.out.println(str.substring(str.length()-3));


        String str1 = "Java";
        String str2 = " ";
        String str3 = "Candır";

        System.out.println(str1 + str2 + str3);
        System.out.println(str1.concat(str2).concat(str3));






    }
}
