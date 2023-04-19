package br.nathalia.udemy.date_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.LocalDate.now;
import static java.time.LocalDate.parse;
import static java.time.format.DateTimeFormatter.ofPattern;

/**
 * <a href="https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ofPattern-java.lang.String-">DateTimeFormatter Java 8 Docs</a>
 */
public class DatesExample {
    public static void main(String[] args) {
        // local date example
        // without time
        LocalDate dataLocal = now();
        System.out.println(dataLocal);

        // with time
        LocalDateTime dataLocalTime = LocalDateTime.now();
        System.out.println(dataLocalTime);

        // global date example
        Instant globalDate = Instant.now();
        System.out.println(globalDate);

        // text iso to date parse
        LocalDate isoLocal = parse("2006-07-29");
        LocalDateTime isoTime = LocalDateTime.parse("2006-07-29T04:24:30");
        Instant isoInstant = Instant.parse("2006-07-29T04:24:30Z");

        // parse a iso date with time zone to gmt
        Instant parseTimeZone = Instant.parse("2023-04-17T17:53:50-04:00");

        // parse different format date to iso -- using datetimeformatter
        LocalDate differentFormatLocal = LocalDate.parse("17/04/2023", ofPattern("dd/MM/yyyy"));
        LocalDateTime differentFormatLocal2 = LocalDateTime.parse("17/04/2023 18:10", ofPattern("dd/MM/yyyy HH:mm"));
        LocalDate lc = LocalDate.of(2023, 04, 17);
        LocalDateTime lct = LocalDateTime.of(2023, 04, 17, 18, 21);


        System.out.println(isoLocal);
        System.out.println(isoTime);
        System.out.println(isoInstant);
        System.out.println(parseTimeZone);
        System.out.println(differentFormatLocal);
        System.out.println(differentFormatLocal2);
        System.out.println(lc);
        System.out.println(lct);
    }
}
