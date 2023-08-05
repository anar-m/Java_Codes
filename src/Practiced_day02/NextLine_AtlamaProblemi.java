package Practiced_day02;

import java.util.Scanner;

public class NextLine_AtlamaProblemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Adınızı Soyadınız: ");
        String name = scanner.nextLine();
        System.out.print("Yaşınız: ");
        int age = scanner.nextInt();
        // scanner.nextInt() ile değer aldıktan sonra scanner.nextLine(); ile değer istenirse sorun çıkıyor
        //atlama problemi oluşuyor. sorunu çözmek içim alttaki satır eklenir.
        // busatrı sonu arabellekte kalan karakteri kullanalım
        // satırsonu arabellekte kalan karakteri kullanalım. Alttaki satırı yoruma alarak çalıştırın sorunu görün
        scanner.nextLine();
        System.out.print("Mesleğiniz nedir?: ");
        String job = scanner.nextLine();
        System.out.printf("Güzel bir meslek: "+ job);
        scanner.close();
    }
}
