package day38_abstractClasses;

public abstract class F_Hemsire extends D_Personel{
    /*
    Abstract bir class'ı parent edinen
    abstract child class parent class'daki zorunlu methodları implement etmek zorunda değildir.

    parent'taki absyract methodları implemet etmek zorunda değildir,
    ama isterse implement edebilir.
     */
    public abstract void sertifica();
    public abstract void nobet();

    @Override
    public void standartMaas() {
        System.out.println("Tüm hemşireler için standart maaş 20.000 TL'dir.");
    }
}
