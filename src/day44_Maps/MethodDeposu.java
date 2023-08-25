package day44_Maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MethodDeposu {

    public static Map<Integer, String> ogrenciMapOlustur(){
        Map<Integer,String>ogrenciMap = new TreeMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        return ogrenciMap;

    }
    public static void isimSoyisimListesiYazdir(Map<Integer,String> ogrenciMap){

        Collection<String> valueCollection = ogrenciMap.values();
        System.out.println("Sıra No:   İsim:    Soyisim:");
        System.out.println("===========================");
        int siraNo = 1;



        for (String eachValue: valueCollection // "Ali-Can-11-H-MF"
             ) {
            String[] valueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]
            System.out.println(siraNo +" -   "+ valueArr[0] + " " + valueArr[1]);
            siraNo++;
        }

    }

    public static  void sinifSubedekiOgrenciListesiYazdir(Map<Integer, String> ogrenciMap, int sinif, String sube){

        //  1-Tüm value'leri bir collection olarak kaydedelim
        Collection<String> valueCollection = ogrenciMap.values();
        // 2- bir for-each loop ile her bir value'yu ele alalım

        System.out.println(sinif+ ".Sınıf " + sube + " şubesindeki öğrenci listesi");
        System.out.println("================================");
        for (String eachValue: valueCollection
             ) {
            // 3- Value'lar belirli bir ayıraç ile birleştirilen String'lerden oluştuğu için bu
            //        ayıraç kullanılarak split() ile bir Array'a dçnüştürülebilir
            // "Ali-Can-11-H-MF"

            String[] valueArr = eachValue.split("-"); //

            // 4-Artık bir array ve içerisinde value oluşturan bilgiler mevcut.
            //        istenen bilgiyi array'den index ile alabiliriz

            String sinifStr = sinif + "";
            if (valueArr[2].equals(sinifStr) && valueArr[3].equalsIgnoreCase(sube)){
                System.out.println(valueArr[0] + " " + valueArr[1]);
            }
        }
    }

    public static void isimSoyisimIleOgrenciBul(Map<Integer,String > ogrenciMap, String isim, String soyisim){
        Collection<String> valueCollection = ogrenciMap.values();

        for (String eachValue: valueCollection // "Ali-Can-11-H-MF"
        ) {
           String[] valueArr = eachValue.split("-");  // [Ali, Can, 11, H, MF]
            // isim , soyisim , sınıf ve şubelerini yazdırın.
            if (valueArr[0].equalsIgnoreCase(isim) && valueArr[1].equalsIgnoreCase(soyisim)){
                System.out.println(valueArr[0]+" "+ valueArr[1]+" "+ valueArr[2]+" "+valueArr[3]);
            }
        }

    }

    public static void numaraIleOgrenciBilgisiYazdirma(Map<Integer, String> ogrenciMap, Integer ogrenciNo){

        String istenenOgrenciValue = ogrenciMap.get(ogrenciNo); // "Ali-Can-11-H-MF"
    // numarası verilen öğrencinin isim, soyisim, sınıf ve şubesini yazdırın

    String[] istenenOgrenciArr = istenenOgrenciValue.split("-");  // [Ali, Can, 11, H, MF]

    System.out.println("isim: "+ istenenOgrenciArr[0] + " " + ", Soyisim: "+ istenenOgrenciArr[1]+
            ", Sınıf: "+ istenenOgrenciArr[2] + ", Şube: "+ istenenOgrenciArr[3]);




    }
    public static void numaraliOgrenciListesiYazdir(Map<Integer, String> ogrenciMap){
    // tüm key'leri kaydadelim
    Set<Integer> ogrencikeySeti =  ogrenciMap.keySet();

    // bir foreack Loop ile tüm key'leri elden geçirelim

    for (Integer eachKey: ogrencikeySeti
         ) {
        // her bir key
        System.out.print(eachKey + " ");


        // ve o key'in isim ve soyismini yazdıralım
        String valueStr = ogrenciMap.get(eachKey);
        String[] valueArr = valueStr.split("-");

        System.out.println(valueArr[0]+ " " + valueArr[1]);
    }
    }

}

// elimiz de Map var
//101=Ali-Can-11-H-MF,
// 102=Veli-Cem-10-K-TM,
// 103=Ali-Cem-11-K-TM,
// 104=Ayse-Can-10-H-MF,
// 105=Sevgi-Cem-11-M-TM,
// 106=Sevgi-Can-10-K-MF}
/*
    1- bizden istenen bilgi key'de mi value' de mi (Collection'a geçtim)

        [Ali-Can-11-H-MF,
        Veli-Cem-10-K-TM,
        Ali-Cem-11-K-TM,
        Ayse-Can-10-H-MF,
        Sevgi-Cem-11-M-TM,
        Sevgi-Can-10-K-MF]

     2- Value içerisindeki bilgilere rahat ulaşabilmek için
     for each loop ile her bir value alıp split() ile
     array'e çevirelim (Array'e geçtim)

      [Ali, Can, 11, H, MF]

     3- eğer sınıf ve sube parametre olarak verieln ile aynı ise
        isim ve soyisimi yazdır

 */