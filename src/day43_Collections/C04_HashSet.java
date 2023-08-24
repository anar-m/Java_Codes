package day43_Collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class C04_HashSet {
    /*
    Soru : Bir HashSet ve TreeSet olusturun.
    Bir loop ile bu set’lere element ekleyip sureleri karsilastirin.
     */
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();

        TreeSet<Integer> treeSet = new TreeSet<>();

        Random rnd = new Random();

        int hasBas = LocalTime.now().getNano();

        for (int i = 1; i <=100; i++) {
            hashSet.add(rnd.nextInt(100000));
            }
        int hasBit = LocalTime.now().getNano();
        System.out.println("Hash set süresi : " + (hasBit-hasBas));

        int treeBas = LocalTime.now().getNano();
        for (int i = 1; i <=100 ; i++) {
            treeSet.add(rnd.nextInt(100000));
        }
        int treeBit = LocalTime.now().getNano();
        System.out.println("Tree set süresi: " +(treeBit-treeBas));

        System.out.println(treeSet);
    }
}
