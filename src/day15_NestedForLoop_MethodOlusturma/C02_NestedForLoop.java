package day15_NestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C02_NestedForLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan iki rakam alın. ilk rakam satır
        ikinci rakam sutun olmak üzere aşağıdaki şekli çizdirin
        *  *  *  *  *
        *  *  *  *  *
        *  *  *  *  *
        *  *  *  *  *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("oluşturulacak şeklin satır sayısını giriniz");
        int satir = scanner.nextInt();

        System.out.println("oluşturulacak şeklin satır sayısını giriniz");
        int sutun = scanner.nextInt();
        for (int i = 1; i <=satir ; i++) {     // satırları kontrol eder
            for (int j = 1; j <=sutun ; j++) { //sutunları kontrol eder
                System.out.print("*  ");
            }
            System.out.println("");
        }



    }
}
