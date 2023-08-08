package day33_encapsulation_inheritance;

public class C01_Pazarlama {
    /*
    Satış değeri girecekler
    satış değeri girebilsin ama başkalaırnın girdiği satışların göremesinler

    toplam satış değeri görmesi gerekenler görsün ama
    toplam satış değeri gören kişiiler tarafından değiştirilmesin
     */
    private int toplamSatis; // read only-sadece okunabilir
    private int satis; // write only-sadece yazılabilir
    /*
    yetki ayırımı yapacağınız class'larda
    istediğimiz işlemi bizim adımıza yapacak
    public method'lar oluşturacağız

    getter method'ları başka class'lar için
    private variable'lara ulaşır
    de değerini o class'lara döndürür
     */

    public int getToplamSatis() {

        return toplamSatis;
    }

    public void setSatis(int satis) {
        this.satis = satis;
        toplamSatisaEkle();
    }

    private void toplamSatisaEkle(){
        toplamSatis += satis;
    }
}
