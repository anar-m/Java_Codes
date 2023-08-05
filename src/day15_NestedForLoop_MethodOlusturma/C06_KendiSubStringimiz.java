package day15_NestedForLoop_MethodOlusturma;

public class C06_KendiSubStringimiz {
    public static void main(String[] args) {
        String str = "Java Candır";
        int baslangic = 3;
        int bitis = 7;
        /*
         verielen başlangıç bitiş değerlerini dikkate alarak
         1-bitiş degeri başlangıç değerinden küçükse hata mesajı
         2-başlangıç  veya bitiş değeri index değerleri ile uyuşmuyorsa hata mesajı
         3-değerler uygunsa başlangıç

         */

        if (baslangic > bitis){
            System.out.println("başlangıç değeri bitiş değerinden büyük olamaz");
        } else if (baslangic<0 || bitis<0 || baslangic>= str.length() || bitis>= str.length()) {

        }else {
            for (int i = baslangic; i <=bitis ; i++) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println(str.substring(baslangic,bitis));
        str.substring(5);
        /*
        bu method bize 5. indexten sonuna kadar "Candır" döndürür.
        ancak
        yazdırmazsak veya bir variable ye atamazsak
        bu metodun döndürdüğü sonuç anlamsız olur.
         */
        String strIstenenStrBolum = str.substring(5); // kaydeder ama yazdırmaz
        System.out.println(str.substring(5)); // yazırır ama kaydetmez
    }
}
