package day33_encapsulation_inheritance;

public class C04_Okul {

    private String okulAdi="Yıldız Koleji";
    private int ogrebciSayisi =234;
    public String okulAdresi= "Ankara";

    /*
    Bazı developer'lar
    erişim yetkisini sınırlamak için değil
    yapılan işe vurgu olması için
    getter ve setter kullanabilirler.

    bu uygulamanın tek artısı yapılan
    işleme vurgu yapmasıdır.
     */

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }

    public void setOgrebciSayisi(int ogrebciSayisi) {
        this.ogrebciSayisi = ogrebciSayisi;
    }

    public String getOkulAdi() {
        return okulAdi;
    }

    public int getOgrebciSayisi() {
        return ogrebciSayisi;
    }
}
