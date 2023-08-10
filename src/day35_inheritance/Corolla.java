package day35_inheritance;

public class Corolla extends BToyota {

    Corolla(){ // görünür olarak contructor call yok
                // o zaman görünmeyen süper(); contructor call vardır.
        System.out.println("Corolla'da parametresiz contructor çalıştı");
    }
    Corolla(String str){
        // görünmeyen super(); var
        // Java'nın koyduğu ve görünür olmayan
        // constructor call HER ZAMAN parametresiz olan
        // super();
        // kodu yazan kişiler isterlerse ilk  satıra
        // başka constructor call yazabilirler
        // eğer ilk saıtrda görünür bir constructor call varsa
        // java default olarak koyduğu super(); ' u siler.
    }


    String uretimYeri = "Sakarya / Türkiye";
    String model = "Corolla";
    String aku = "İnci akü";
    String sanziman = "Cvt";

    public static void main(String[] args) {
        Corolla corolla = new Corolla();
        Corolla corolla1 = new Corolla("Kırmızı");






        // bir objenin bir class'da olusturulan ozelliklere ulasmasi
        // ve o class'da atanan ilk degerlere sahip olmasi icin
        // o class'larin constructor'lari calismak ZORUNDADIR

        // extends keyword kullanilan bir class'da
        // olusturulan HER CONSTRUCTOR'in ilk satirinda
        // biz gorsek de gormesek de
        // CONSTRUCTOR CALL vardir.
        // Eger ilk satirda gorunur bir constructor call yoksa
        // Java'nin koydugu gorunmeyen super(); vardir.

    }

}
