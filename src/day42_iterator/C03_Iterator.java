package day42_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(1);

        // index kullanmadan tüm elementleri 2 arttırın

        ListIterator lit = sayilar.listIterator();
        System.out.println(sayilar); // [5, 23, 2, 13, 1]

        while (lit.hasNext()){
            Integer sayi = (Integer) lit.next();
            lit.set(sayi+2);
        }

        System.out.println(sayilar); // [7, 25, 4, 15, 3]
        // Iterator kullanarak listenin elementlerini sondan başa doğru yazdırın

        /*
        Iterator veya ListIterator ile çalışırken
        Iterator'ı en son nerede bıraktık sorusu çok önemlidir.

        bu soru için konuşursak sayıları 2 artırmak için
        biz tek tek ilerleyip Iterator'ı listenin sonuna götürdük
        */

        while (lit.hasPrevious()){
            Integer sayi= (Integer) lit.previous();
            System.out.print(sayi+ " "); // 3 15 4 25 7
        }
    }
}
