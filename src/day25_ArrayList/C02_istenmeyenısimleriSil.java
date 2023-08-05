package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_istenmeyenısimleriSil {
    public static void main(String[] args) {
        // Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip,
        // kalan kismini list olarak bize donduren bir method olusturun

        String[] arr={"Mehmet","Ramazan","Mustafa"," Ayfer","Ozan","Berk","Nergiz"};
        List<String> isimler = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            isimler.add(arr[i]);
        }
        System.out.println("İsimler listesi "+ isimler);
        System.out.println(istenmeyenleriSil(isimler, "a")); // [Ramazan, Mustafa, Ozan]

        // isimler listesinin kalıcı olarak yeni hali almasını istersek
        isimler = istenmeyenleriSil(isimler,"a"); // [Mehmet,  Ayfer, Berk, Nergiz]


    }
    public static List<String> istenmeyenleriSil(List<String> isimler, String istenmeyenHarf){
       // isim sildiğimizde index kayacaktır. bu da bazı elementlerin kontrol edilmemesine
       // ve sınır indexOutOfBounds hatasına neden olabilir.
       // verilen listeden isim silmek yerine başka bir boş
        // liste OLUŞTURALIM.ve SİLİNECEK elemanları o listeye ekleyip yeni listeyi döndürelim

        List<String> yeniList = new ArrayList<>();
        for (int i = 0; i < isimler.size() ; i++) {
            if (!isimler.get(i).contains(istenmeyenHarf)){
                yeniList.add(isimler.get(i));
            }
        }
        return yeniList;

    }


}
