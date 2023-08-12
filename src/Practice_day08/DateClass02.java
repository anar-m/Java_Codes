package Practice_day08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

// Soru: Verilen bir tarihten belirli gün sayısını ekleyerek gelecekteki bir tarihi hesaplayan bir
// LOcalDateTime tarih ve saat, dakika veya saniye içerir
// LocalDate ise Yıl, ay, Gün içerir
public class DateClass02 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(1980,6,13);
        // Başlangış tarihini belirledik
        LocalDate futureDate = calculateFutureDate(startDate,15760);  // 120 gün sonrasını hesaplayacak
        System.out.println("120 gün sonrası: "+ futureDate);
    }
    static LocalDate calculateFutureDate(LocalDate startDate, long addDay){
        return startDate.plus(addDay, ChronoUnit.DAYS);
    }

}
