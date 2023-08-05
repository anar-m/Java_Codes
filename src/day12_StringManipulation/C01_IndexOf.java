package day12_StringManipulation;

public class C01_IndexOf {
    public static void main(String[] args) {

        String str= "Ali topu at, topu at ali";

        // ilk topu kelimesinin indexi kaçtır

        System.out.println(str.indexOf("top")); //4

        // 2. top metim parçasının index isin yazdırın
        System.out.println(str.indexOf("top",5));

        System.out.println(str.indexOf("top",str.indexOf("top")+1)); // 4
        // at kelimesinin 2 kere kullanılıp kullanılmadığını metne bakmadan bulun

        int ilkIndex= str.indexOf("at");  // ya -1 olur veya sıfırdan büyük bir sayı olur (doğal sayı)
        if (ilkIndex== -1) { // hiç kullanılmamıştır
            System.out.println("2 kere kullanılmamıştır");
        }else{
            // en az bir kere kullanılmıştır
            int ikinciIndex= str.indexOf("at",ilkIndex+1);
            // ikinci index -1 olabilir kullanılmamışsa veya
            // 2. defa kullanılmışsa doğal sayı olur
            if (ikinciIndex== -1){// sadece bir defa kullanılmış ikinci kullanım yok
                System.out.println("2 kere kullanılmamıştır");
            }else {
                System.out.println("2 veya daha fazla kullanımı var");
            }
        }




    }
}
