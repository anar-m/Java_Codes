package day19_scope;

public class C03_baskaClassLevelVariablelaraErisim {
    public static void main(String[] args) {
        System.out.println(C02_ClassLevelVariableler.bls); //false
        System.out.println(C02_ClassLevelVariableler.strs); // Java
        System.out.println(C02_ClassLevelVariableler.sayis);// 0
        System.out.println(C02_ClassLevelVariableler.chrs); // a

        C02_ClassLevelVariableler obj = new C02_ClassLevelVariableler();
        System.out.println(obj.bli); // false
        System.out.println(obj.stri); // null
        System.out.println(obj.sayii); // 23
        System.out.println(obj.chri); // ''

        System.out.println(obj.bls); //false
        System.out.println(obj.strs);

    }
}
