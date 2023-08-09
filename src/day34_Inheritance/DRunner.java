package day34_Inheritance;

public class DRunner {
    public static void main(String[] args) {

        Corolla corolla = new Corolla();
        // corolla class'ın daki özellikler
        System.out.println(corolla.uretimYeri); // Corollo class tan aldı Sakarya / Türkiye
        System.out.println(corolla.model); // Corollo class tan aldı Corolla
        System.out.println(corolla.aku); // Corollo class tan aldı İnci akü
        System.out.println(corolla.sanziman); // Corollo class tan aldı Cvt

        // Toyota Class'ındaki özellikler
        System.out.println(corolla.marka); // Toyota
        System.out.println(corolla.lastik); // Tüm Toyota araçlar Pirelli latik kullanır
        System.out.println(corolla.guvenlik); // Tüm Toyota araçlar extra güzenlik içerir
        System.out.println(corolla.fren); // Toyota araçlar ABS fren sistemi kullanır

        // Araba Class'ından aldığı özellikler
        System.out.println(corolla.yakit); // Yakıt türü belirtilmedi
        corolla.yakit = "Benzin";
        System.out.println(corolla.yakit); // Benzin
        System.out.println(corolla.yil); // 1900
        System.out.println(corolla.renk); // Renk belirtilmedi


    }
}
