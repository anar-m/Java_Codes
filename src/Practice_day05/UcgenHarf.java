package Practice_day05;

public class UcgenHarf {
    public static void main(String[] args) {
        /*
            A
            A B
            A B C
            A B C D
            A B C D E
            A B C D E F
            şeklini yazdırınız.  65=A'nın ascıı değeri

   */
        int harf =66;
        for (int satir = 0; satir < 10 ; satir++) { // satır sayısını belirledik 0-10 arası
            for (int sutun = 0; sutun <= satir; sutun++) { // satır sayısınca sütün olmasını belirledik
                System.out.print((char)(harf+sutun));
            }
            System.out.println();
        }




    }
}
