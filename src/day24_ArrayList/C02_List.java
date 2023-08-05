package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {
        // bir List oluşturma
        // <> içerisine data türü yazılmalıdır.
        // data türü PRİMİTİVE data türü OLAMAZ

        // List<String> isimler = new List(); abstract olduğu için  bu şekilde yazılmaz
        ArrayList<String> isimler = new ArrayList<>();  // []
        // ikinci yazım biçimi kullanılmaz

        // HER LİST OLUŞTURULDUĞUNDA BOŞ OLARAK OLUŞTURURLUR.
        // sonra elementler tek tek eklenir.

        System.out.println(isimler);

        isimler.add("burhan");
        isimler.add("şeref");
        isimler.add("mustafa");
        System.out.println(isimler); // [burhan, şeref, mustafa]
        // elementler ekleme sırasına göre dizilir.

        // eğer en sona değil de istediğimiz bir index'e element eklemek istersek

        isimler.add(2,"nergiz");
        System.out.println(isimler); // [burhan, şeref, nergiz, mustafa]
                                    // nergiz 2. index olacak şekilde ekler diğerleri bir sıra kayar
        isimler.add(1,"ömer");
        System.out.println(isimler); // [burhan, ömer, şeref, nergiz, mustafa]

        isimler.addAll(2,isimler);
        System.out.println(isimler); // [burhan, ömer, burhan, ömer, şeref, nergiz, mustafa, şeref, nergiz, mustafa]

        System.out.println(isimler.add("eyüp"));
        System.out.println(isimler);


    }
}
