package day21_arrays;

public class C07_EnUzunEnKısaKelimeYazdir {
    public static void main(String[] args) {
        /*
        Soru 6- Verilen String bir array’deki
         en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
         */
        String[] isimler = {"Resul", "Ömer", "Mustafa", "Meryem", "Süleyman", "Ertuğrul","Ozan"};
        // = konulduğunda ilk isim gider son isim yazılır, konulmazsa ilk olan kalı sonrakiler yazılmaz.
        enUzunEnKisaYazdir(isimler);

    }
    public static void enUzunEnKisaYazdir(String[] isimler){
        String enKisaKelime = isimler[0]; // sadece başlangıç değeri olması için atandı.
        String enUzunKelime = isimler[0]; // sadece başlangıç değeri olması için atandı.

        for (int i = 0; i < isimler.length; i++) { // = konulduğunda ilk isim gider son isim yazılır,
                                                    // konulmazsa ilk olan kalı sonrakiler yazılmaz.
            if (isimler[i].length() > enUzunKelime.length()){
                enUzunKelime = isimler[i];
            }
            if (isimler[i].length() < enKisaKelime.length()){
                enKisaKelime = isimler[i];
            }


        }
        System.out.println("En uzun isim "+ enUzunKelime);
        System.out.println("En kısa kelime " + enKisaKelime);

    }

}
