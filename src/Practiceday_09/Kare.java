package Practiceday_09;
public class Kare extends Dikdortgen {
    public Kare(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public String toString() {
        return "Kenar Uzunluğu=" + uzunKenar + " Çevre= "+cevreHesaplama(uzunKenar,kisaKenar)+" Alan= "+alanHesapla(uzunKenar,kisaKenar);
    }
}
