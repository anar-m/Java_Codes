package day26_ForEachLoop_constructor;

public class C07_Runner {
    public static void main(String[] args) {

        C04 obj;
        // deklerasyon vardır ama et kemiğe bürünmüş bir obje yoktur

        new C04();
        // objeyi oluşturduk ama sonraki satırlarda kullanamayız
        // çünkü bir objete atayamadık


        System.out.println(new C04().sayi); // 10

        C04 obj2 = new C04();

    }
}
