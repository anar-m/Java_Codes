package day35_inheritance;

public class BToyota extends Araba {
    BToyota(){
        System.out.println("BToyota'da parametresiz contructor çalıştı");
    }

    // parent class'daki bazı özellikleri update ettik.
    String marka = "Toyota";
    String uretimYeri = "Toyota araçlar Japonya ve Türkiye'de üretilir";

    // parent class'ta olmayan yeni özellikler ekleyebiliriz.

    String lastik = "Tüm Toyota araçlar Pirelli latik kullanır";
    String guvenlik = "Tüm Toyota araçlar extra güzenlik içerir";
    String fren = "Toyota araçlar ABS fren sistemi kullanır";


}
