package day38_abstractClasses;

public class E_Doktor extends D_Personel{
    @Override
    public void standartMaas() {
        System.out.println("Doktorlar için standart maaş 30.000 TL'dir");
    }

    @Override
    public void mesai() {
        System.out.println("Doktorlar haftada 5 gün, 6 saat mesai yaparlar.");
    }

    @Override
    public void yillikIzin() {
        System.out.println("Doktorların yıllık 1 ay izni olur.");
    }

    @Override
    public void ozelSigorta() {
        System.out.println("Doktorlar 1000 TL katkı ile full güvenlik sigortası yaptırabilir.");
    }
}
