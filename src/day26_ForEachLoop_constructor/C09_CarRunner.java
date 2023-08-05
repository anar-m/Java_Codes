package day26_ForEachLoop_constructor;

public class C09_CarRunner {
    public static void main(String[] args) {
        C08_Car car1 = new C08_Car();
        System.out.println(car1.marka);  // marka belirtilmemiş
        System.out.println(car1.model); //  model belirtilmemiş

        System.out.println(car1); // Araba bilgileri ==> marka='Marka belirtilmemiş',
        // model='Model belirtilmemiş', yil=1900, fiyat=0, renk='Renk belirtilmemiş'}
        car1.marka ="Toyota";
        car1.model = "Corolla";
        car1.yil = 2011;
        car1.fiyat = 7000;
        car1.renk = "Kırmızı";

        System.out.println(car1); // Araba bilgileri ==> marka='Toyota', model='Corolla', yil=2011, fiyat=7000, renk='Kırmızı'}

        C08_Car car2 = new C08_Car();
        System.out.println(car2); // Araba bilgileri ==> marka='Marka belirtilmemiş',
        // model='Model belirtilmemiş', yil=1900, fiyat=0, renk='Renk belirtilmemiş'}

        car2.marka = "Honda";
        car2.renk = "Mavi";
        car2.fiyat = 8000;

        System.out.println(car2); // Araba bilgileri ==> marka='Honda', model='Model belirtilmemiş', yil=1900, fiyat=8000, renk='Mavi'}

        C08_Car car3 = new C08_Car();
        System.out.println(car3); // Araba bilgileri ==> marka='Marka belirtilmemiş',
        // model='Model belirtilmemiş', yil=1900, fiyat=0, renk='Renk belirtilmemiş'}



    }



}
