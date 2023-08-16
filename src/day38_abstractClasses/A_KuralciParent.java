package day38_abstractClasses;

public abstract class A_KuralciParent {

    public void method1(){
        System.out.println("parent method 1");
    }
    public void method2(){
        System.out.println("parent method 2");
    }
    public abstract void method3();
    public abstract void method4();
    public abstract void method5();
    public void method6(){
        System.out.println("parent method 2");
    }

    /*
    Eğer parent class'ı child class'lae için bir çatı class yapıyorsak ve
    parent class'a extend yapan tüm child class'ların bazı methodları
    kendisine uyarlamaya MECBUR etmek istiyorsak ABSRACTION kullanırız

    1- Bir class'ın bu özellikleri sağlaması için abstract olması lazım
        -Abstract class-Kısmi abstraction sağlar
            bazı methodları child'ların kendisine uyarlamasını mecbur eder
        -Interface-Full absraction sağlar
            tüm methodları child'ların kendisine uyarlamasını mecbur eder
    2- bir class'ı abstract class yapmak isterseniz
    deklerasyona abstract yazmalısınız
    3-child class'larin mecburen uyarlamasini istedigimiz method'lari abstract method yapiyoruz
           mecburen uyarlanmasini istemedigimiz, karari child class'a biraktigimiz method'lari
           bugune kadar yaptigimiz sekilde birakiyoruz
     */
}
