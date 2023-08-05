package day15_NestedForLoop_MethodOlusturma;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        int satir = 5;
        int sutun = 7;

            // dikdörtgen içinde satır ve sütün numaralarını yazdırın
        for (int i = 1; i <=satir; i++) {  // satır
            for (int j = 1; j <=sutun ; j++) { // sütün
                System.out.print(i+ "," + j+  "    ");
            }
            System.out.println("");
        }

        // üçgen için satır ve sütün numaralarını yazdıralım

        for (int i = 1; i <=satir ; i++) {  // satırlara göre yapılır
            for (int j = 1; j <=i ; j++) {
                System.out.print(i + "," + j + "    ");
            }
            System.out.println("");
        }


    }
}
