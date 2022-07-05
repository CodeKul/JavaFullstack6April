package java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateDemo {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

//        System.out.println(System.currentTimeMillis());
//        System.out.println(new Date(System.currentTimeMillis()));

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.plusDays(2));
        System.out.println(localDate.minusDays(3));
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getEra());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.isAfter(LocalDate.of(2022,1,12)));
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);

        ZoneId zoneId = ZoneId.of("Asia/Karachi");

        LocalDate localDate1 = LocalDate.now(zoneId);
        LocalTime localTime = LocalTime.now(zoneId);
        System.out.println(localTime);
    }
}
