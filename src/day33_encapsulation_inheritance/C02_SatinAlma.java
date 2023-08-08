package day33_encapsulation_inheritance;

public class C02_SatinAlma {
    public static void main(String[] args) {
       /*
        // eğer Pazarlama'daki class üyeleri default access modifier'a sahip olursa
            hen değer atayabilirim hem de sonuçları değiştirebilirim

            eğer private yaparsam o zaman da hiç bir şekilde erişilemez.

        C01_Pazarlama pazarlama = new C01_Pazarlama();
        pazarlama.satis = 200;
        System.out.println(pazarlama.satis);  // 200
        pazarlama.toplamSatis = 500;
        System.out.println(pazarlama.toplamSatis);  // 500

        eğer bir class üyesine başka class'ların erişimini
        okuma (read / değeri görme) ve yazma ( write/ değer atama) şeklinde derecelerndirmek istersek
        access modifier ile yapamayız

        */
        /*
        eğer bir class üyesine erişimi read ve write olarak ayıtmak istersek
        ilk yapılacak şey;
        access modifirer
         */
        C01_Pazarlama pazarlama = new C01_Pazarlama();

        pazarlama.setSatis(100);
        pazarlama.setSatis(200);
        pazarlama.setSatis(400);

        System.out.println(pazarlama.getToplamSatis()); // 700
    }

}
