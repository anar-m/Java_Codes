package day36_InheritanceDataTypeKullanimi;

public class KChildClass extends JParentClass {
    public void method1(){
        System.out.println("Child class method1");
    }

    @Override
    public void method2() {
        super.method2();
    }

    /*
    @Override rotasyonu overridden metghod ile overriding
    methodu birbirine bağlar
    eğer overridden method silinirse
    CTE verir

    Kullanmak zorunda değiliz
    ama iki method'u bağımlı yapmak istiyorsak kullanılabilir

    everriding method varken
    overridden method çalışmaz

    eğer her iki methodu birden çalıştırmak istersek
    child class'daki overriding method'a
     super.method2(); ekleyebiliriz.
     */
}
