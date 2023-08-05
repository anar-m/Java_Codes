package day25_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArrayiListeCevirme {
    public static void main(String[] args) {

        Integer[] arr = {1,2,6,5,4,9,1,5,8,7,2,6,2,3,5,4,7,9,9,6,};
        // bir arrayi list olarak kaydedin

        List<Integer> forList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            forList.add(arr[i]);
        }
        System.out.println(forList); // [1, 2, 6, 5, 4, 9, 1, 5, 8, 7, 2, 6, 2, 3, 5, 4, 7, 9, 9, 6]
        /*
        Array classı verilen bir arrayi List'e çeviren hazır bir method sunuyor
        ANCAAAAAK
        bu methodu kullanarak bir arrayi List'e çevirmenin 2 büyük dezavantajı var
        1- add() ve remove() gibi list'in uzunluğunu değiştiren method'leri desteklemez
        2-her ne kadar biz bir List oluşturmuş olsak da
        java arka planda hazir method ile olusturulan list ve kaynak arr'yi ilisiklendirir
         birinde yapilan degisiklik, digerine de islenir
         */
        List<Integer> hazirMethodList = Arrays.asList(arr);
        System.out.println(hazirMethodList); // [1, 2, 6, 5, 4, 9, 1, 5, 8, 7, 2, 6, 2, 3, 5, 4, 7, 9, 9, 6]

        forList.remove(3);
        System.out.println(forList); // [1, 2, 6, 4, 9, 1, 5, 8, 7, 2, 6, 2, 3, 5, 4, 7, 9, 9, 6]

        forList.set(0,10);
        System.out.println(forList); // [10, 2, 6, 4, 9, 1, 5, 8, 7, 2, 6, 2, 3, 5, 4, 7, 9, 9, 6]
        System.out.println(Arrays.toString(arr)); // [1, 2, 6, 5, 4, 9, 1, 5, 8, 7, 2, 6, 2, 3, 5, 4, 7, 9, 9, 6]

        hazirMethodList.set(0,20);
        System.out.println(hazirMethodList); // [20, 2, 6, 5, 4, 9, 1, 5, 8, 7, 2, 6, 2, 3, 5, 4, 7, 9, 9, 6]
        System.out.println(Arrays.toString(arr)); // [20, 2, 6, 5, 4, 9, 1, 5, 8, 7, 2, 6, 2, 3, 5, 4, 7, 9, 9, 6]

    }



}
