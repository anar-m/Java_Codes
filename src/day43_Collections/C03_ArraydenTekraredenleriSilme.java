package day43_Collections;

import java.util.*;

public class C03_ArraydenTekraredenleriSilme {
    public static void main(String[] args) {

        int[] arr = {1,2,3,32,3,3,2,5,6,9,4,5,9,11,12,0,2,0,13};
        // verilen array'deki tekrar eden elementleri silip
        // array'i her elementinsadece 1 kere bulunduğu bir hale dönüştürün

        // boş bir List oluşturup array'deli elementleri tek tek ele aldık
        // ele aldığımız element Lİst'te yoksa List'te ekledik.

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int each:arr
             ) {
            if (!tekrarsizList.contains(each)) {
                tekrarsizList.add(each);
            }
        }
        System.out.println(tekrarsizList); // [1, 2, 3, 32, 5, 6, 9, 4, 11, 12, 0, 13]

        // Aynı işlemi set ile daha kolay yapabiliriz

        Set<Integer> tekrarsizSet = new TreeSet<>();
        for (int each:arr
             ) {
            tekrarsizSet.add(each);
        }
        System.out.println(tekrarsizSet); // [0, 1, 2, 3, 4, 5, 6, 9, 11, 12, 13, 32]

        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 32, 3, 3, 2, 5, 6, 9, 4, 5, 9, 11, 12, 0, 2, 0, 13]
        // tekrarsız elementleri set olarak elde ettik
        // array'i Set'teki elementlerden oluşan hale dçnüştürün

        arr = new int[tekrarsizSet.size()];
        int index = 0;

        for (Integer each:tekrarsizSet
             ) {
            arr[index]= each;
            index++;
        }
        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4, 5, 6, 9, 11, 12, 13, 32]
    }
}
