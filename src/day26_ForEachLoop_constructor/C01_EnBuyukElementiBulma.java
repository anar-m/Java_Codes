package day26_ForEachLoop_constructor;

public class C01_EnBuyukElementiBulma {
    public static void main(String[] args) {
        // array'in en büyük elementi bulun

        int[] arr = {3,6,9,1,3,7,12,34,23,-87,32,-43};

        int enBuyukElement = arr[0];

        for (int each: arr
             ) {

            if (each> enBuyukElement){
                enBuyukElement = each;
            }
        }

        System.out.println("Array'deki en büyük element : " + enBuyukElement);
    }

}
