package day_11StringManipulations;

public class C01_charAt {
    public static void main(String[] args) {
        String str="Java Candir";


        // ilk harfi yazdırın
        System.out.println(str.charAt(0));

        // 7. harfi yazdırın

        System.out.println(str.charAt(6));  // a
        // bu metnin uzunluğu 11
        // son harfi yazdırın
        System.out.println(str.charAt(11-1)); // r
        // sondan üçüncü harf
        System.out.println(str.charAt(11-3));  // d
        // eğer sondan başa doğru gelecek şekilde bir char isteniyorsa
        // charAt(Uzunluk-sondanKacinciKarakter)
        // metnin uzunluğundan daha büyük bir sıradaki karakter istenizse
        //20. karakteri yazdırın

        // System.out.println(str.charAt(20)); // StringIndexOutOfBoundsException

        // 4. harfi büyük harf olarak yazdırın
        System.out.println(str.toUpperCase().charAt(3));
        /*
        charAt()'u char data türünde bir sonuş döndürür
        toUpperCase() gibi metodlar String variable'lar ile çalıştığından
        charAt() çalıştıktan soonra String Manipulation YAPILAMAZ
        eğer manipulations ihtiyaci varsa, charAt() kullanilmadan once yapilmalidir
         */

    }
}
