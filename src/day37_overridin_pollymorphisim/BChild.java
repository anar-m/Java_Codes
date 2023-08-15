package day37_overridin_pollymorphisim;

public class BChild extends AParent {
    final static int SAYI =10;
    final static int SAYI2=20;
    /*
    public final void finalMethod(){
    // final method overrride edilemeyen method demektir.
        System.out.println("Bu child class'taki bir final method");
    }
     */

    public static void staticMethod(){
        System.out.println("Bu child class'taki bir stativ method");
    }
    private void privateMethod(){
        // parent class'daki private methodlar child class'larda kullnılamaz
        // child class kendisinde oluşturulan bu methodu parent class'ta olmayan bir yeni method kabul eder.
        // CTE vermiyor AMMA overriding okları vermiyor.
        System.out.println("Bu child class'taki bir private method");
    }

    public static void main(String[] args) {
        System.out.println(SAYI);
        // sayi = 20; final variable son değerini almış demektir. dolayısıyla yeni değer atanamaz.
        System.out.println(Integer.MIN_VALUE); // -2147483648
    }
}
