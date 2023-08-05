package day15_NestedForLoop_MethodOlusturma;

public class C01_NestedForLoop {
    public static void main(String[] args) {
        /*
        aşağıdaki tabloyu konsolda yazdırın
        1  2  3  4
        2  4  6  8
        3  6  9  12
        eğer yazdırılacak şekil dikdörtgen biçiminde ise
        iç içe for loop ile
         */
        for (int i = 1; i <=4; i++) {
            System.out.print(i + "  ");
        }
        System.out.println("");
        for (int i = 1; i <= 4; i++) {
            System.out.print(i*2 + "  ");
        }

        System.out.println("");
        for (int i = 1; i <= 4; i++) {
            System.out.print(i*3 + "  ");
        }
        System.out.println("==================");

        for (int j = 1; j <=3 ; j++) {

            for (int i = 1; i <=4 ; i++) {
                System.out.print(i*j + "  ");
            }
            System.out.println("");
        }




    }
}
