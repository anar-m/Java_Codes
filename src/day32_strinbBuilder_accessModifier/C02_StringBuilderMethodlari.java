package day32_strinbBuilder_accessModifier;

public class C02_StringBuilderMethodlari {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java daha da güzelleşiyor");


        System.out.println(sb1);  // terse çevirir. royişellezüg ad ahad avaJ

        System.out.println(sb1.reverse()); // royişellezüg ad ahad avaJ
        System.out.println(sb1.reverse());

        sb1.deleteCharAt(sb1.length()-1);
        System.out.println(sb1); // Java daha da güzelleşiyo

        sb1.delete(9,12);
        System.out.println(sb1); // Java daha güzelleşiyo

        sb1.insert(sb1.length(),"r.");
        System.out.println(sb1); // Java daha guzellesiyor.
        String str= "Java da bundan memnun";
        sb1.insert(9,str,4,7);
        System.out.println(sb1); // Java daha da guzellesiyor.
    }
}
