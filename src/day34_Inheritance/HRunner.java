package day34_Inheritance;

public class HRunner {
    public static void main(String[] args) {
        GAvciKuslar avciKusKartal = new GAvciKuslar();
        avciKusKartal.omur();

        // Acı Kuşlar class'ından aldığı özellikler

        avciKusKartal.hareket(); // Uçarlar
        avciKusKartal.beslenme(); // et yerler
        avciKusKartal.pence();  // pencelidir
        avciKusKartal.gaga(); // sivri gagali

        // Kuşlar class'ından aldığı özellikler

        avciKusKartal.kanat(); // kanatlidirlar
        avciKusKartal.solunum(); // akcigerle nefes alirlar
        avciKusKartal.cogalma(); // yumurtayla cogalirlar

        // hayvanlar class'ından aldığı özellikler
        avciKusKartal.omur();  // yasar ve olurler

    }
}
