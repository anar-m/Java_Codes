package day35_inheritance;

public class EMuhasebe extends DHastane{
    EMuhasebe(){ // super(); var
        System.out.println("Parametresiz Muhasebe contructor'u çalıştı");
    }
    EMuhasebe(String str){  // super (); koyar
        System.out.println("String Parametreli Muhasebe contructor'u çalıştı");
    }
    EMuhasebe(int a){
        this("Mustafa");
        System.out.println("int Parametreli Muhasebe contructor'u çalıştı");
    }


}
