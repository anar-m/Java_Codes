package day25_ArrayList;

public class C06_ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {20,30,5,45};
        // array'in tüm elementlerini toplayın
        // array'in tüm elementlerini yazdırın
        // array'in elementlerinden çift sayı olanları yazdırın
        // array'in elementlerinden en büyük olanı bulun

        /*
         array'in tüm elementlerini gözden çecirmem gereken sorularda for loop kullanırız

         for loop 'un en önemli özelliği index sayesinde 0. indesz'ten sonuncu index'e kadar
         sıralı olarak getirmesidir.

         AMA bu sorularda elementi sırasıyla getirmesinin hiç bir önemi yok.
         önemi olan tüm elementleri gözden geçirmesi

         indexin yani sıralı getirmenin önemli olmadığı durumlarda
         for loop yerine for each loop kullanırız
         */

        // array'in tüm elementlerini yazdırın
        for (int each:arr
             ) {
            System.out.print(each+" "); // 20 30 5 45
        }


    }
}
