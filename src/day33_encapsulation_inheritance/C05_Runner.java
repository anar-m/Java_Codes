package day33_encapsulation_inheritance;

public class C05_Runner {
    public static void main(String[] args) {
        C04_Okul okul = new C04_Okul();
        // okul adı private yapıp encapsüle ettiğimiz variable



        System.out.println(okul.getOkulAdi()); // Yıldız Koleji
        okul.setOkulAdi("Java Koleji");
        System.out.println(okul.getOkulAdi()); // Java Koleji

        // okul adresi public variable

        System.out.println(okul.okulAdresi); // Ankara

        okul.okulAdresi = "Ankara / Çankaya";
        System.out.println(okul.okulAdresi); // "Ankara / Çankaya"
    }
}
