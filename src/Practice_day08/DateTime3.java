package Practice_day08;

import java.time.Duration;
import java.time.LocalDateTime;

// Belirli bir tarih girip o günden bo güne geçen zamanı
    // gün saat dakika saniye olarak yazdırın
public class DateTime3 {
        public static void main(String[] args) {
            LocalDateTime startDate = LocalDateTime.of(2010,10,17,18,00);
            LocalDateTime currentDate = LocalDateTime.now();

            Duration duration = Duration.between(startDate,currentDate);
            long day = duration.toDays();
            long hour = duration.toHoursPart();
            long minute = duration.toMinutesPart();
            long seconds = duration.toSecondsPart();

            System.out.println("Evliliğimizde bugün: "+day+".gün "+ hour+". saat "+ minute+".dakika "+ seconds+".saniye geride kaldı.");
        }
}
