package day13_stringManipulation_forLoop;

public class C06_forLoop {
    public static void main(String[] args) {
       // kullanıcının verdiği input değirinden başlayıp ardışık 10 tam sayı yazdırın
        int input = 8;
        for (int i = input; i < input +10 ; i++) {
            System.out.print(i + " ");

        }
        System.out.println("");
        // kullanıcının verdiği sayıdan başlayın
        // 100' e kadar(100 dahil) 5 er 5 er artırarak yazdırın

        for (int i = input; i <=100 ; i+=5) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // 100 den başlayıp 1 e kadar geri geri gidin
        // 7 nin katı olan sayıları yazdırın

        for (int i = 100; i >= 1 ; i--) {
           if (i % 7== 0){
               System.out.print(i + " ");
           }

        }



    }
}