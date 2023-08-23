package day31_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {
        //kullanıcının verdiği değum tarihine göre
        // kullanıcının yaşını gün ve ay olarak yazdıran
        // bir program hazırlayın

        LocalDate dogumgunu = LocalDate.of(2006,4,29);
        LocalDate bugun = LocalDate.now();

        System.out.println(Period.between(dogumgunu,bugun)); // P 43Y 1M 22D
        System.out.println(Period.between(dogumgunu,bugun).getYears()); // 43


    }
}
