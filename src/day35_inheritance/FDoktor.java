package day35_inheritance;

public class FDoktor extends EMuhasebe{
    FDoktor(){
        super(3);
        System.out.println("Parametresiz Doktor constructor'u çalıştı");
    }
    FDoktor(String str){  // super(); var
        System.out.println("String Parametreli Doktor constructor'u çalıştı");
    }
    FDoktor(int sayi){
        this();
        System.out.println("int Parametreli Doktor constructor'u çalıştı");
    }
    public static void main(String[] args) {
        FDoktor doktor1 = new FDoktor("Java");
        System.out.println("");
        FDoktor doktor2 = new FDoktor();
        System.out.println("");
        FDoktor doktor3 = new FDoktor(5);

    }
}
