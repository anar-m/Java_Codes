package day13_stringManipulation_forLoop;

public class C01_replace {
    public static void main(String[] args) {
        String str="Javayı analıyorum ama yazamıyorum";
        // var olan bir stringin istediğimiz bölümünü değiştirebiliriz
        System.out.println(str.replace('j','T')); // Javayı analıyorum ama yazamıyorum
        System.out.println(str.replace('a','*')); // J*v*yı *n*lıyorum *m* y*z*mıyorum
        System.out.println(str.replace("ama yazamıyorum", "ve yazabiliyorum")); //Javayı analıyorum ve yazabiliyorum
        System.out.println(str.replace("Java", "AA"));
        //AAyı analıyorum ama yazamıyorum Java string olduğundan uzzunluğu farketmez bunun yeride string olan AA yı koyar
    }
}
