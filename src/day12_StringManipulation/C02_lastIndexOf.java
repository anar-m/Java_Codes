package day12_StringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        String str = "Javayı ogrenecegiz, baska yolu yok";
        // a harfinin lk kullanım indexsini yazdırı

        System.out.println(str.indexOf("a")); // 1
        // a herfinin son kullanımının indexini yazın
        System.out.println(str.lastIndexOf("a"));
        // J harfininin indexisini yazdırın,
        System.out.println(str.indexOf("J")); //0

        //J harfininin son indexisini yazdırın,
        System.out.println(str.lastIndexOf("J")); //0

        // metne bakmadan e harfinin iki kere veya daha fazla kullanılıp kullanılmadığını yazdırın

        int ilkIndex = str.indexOf("e");
        int sonIndex = str.lastIndexOf("e");

        if (ilkIndex==-1){
            System.out.println("Hiç kullanılmamıştır");
        } else if (ilkIndex==sonIndex) {
            System.out.println("sadece bir kere kullanılmış");

        }else {
            System.out.println("e harfi 2 kere veya daha fazla kullanılmıştır");

        }
        // "Javayı ogrenecegiz, baska yolu yok";
        // o harfininin son indexisini yazdırın,

        System.out.println(str.lastIndexOf("o")); // 32

        // o harfininin son kullanımdan bir önceki kullanımının indexisini yazdırın,
        System.out.println(str.lastIndexOf("o",31)); //27

        // k harfinin son kullanımını yazdırın
        System.out.println(str.lastIndexOf('k')); //33
    }
}
