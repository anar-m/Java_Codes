package day34_Inheritance;

    public class EHayvanlar {

        // bir class oluşturulurken
        // ilerde child class'lar olabilir diye düşünüyorsanız
        // sadece child class'ların ulaşmasını istediğiniz method'ları
        // protected access modifier  kullanmalısınız

    protected void hareket(){
        System.out.println("hareket ederler");
    }
    protected void solunum(){
        System.out.println("nefes alirlar");
    }
    protected void beslenme(){
        System.out.println("beslenirler");
    }
    protected void cogalma(){
        System.out.println("cogalirlar");
    }
    protected void omur(){
        System.out.println("yasar ve olurler");
    }
}
