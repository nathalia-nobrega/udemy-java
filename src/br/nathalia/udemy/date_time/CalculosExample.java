package br.nathalia.udemy.date_time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosExample {
    public static void main(String[] args) {
        LocalDate lcd = LocalDate.parse("2012-04-09");
        LocalDate lcd2 = LocalDate.parse("2011-04-09");
        LocalDateTime lcdt = LocalDateTime.parse("2023-04-09T14:32:16");
        Instant instant = Instant.now();

        Instant pastWeek = instant.minus(7, ChronoUnit.DAYS);
        Instant nextWeek = instant.plus(7, ChronoUnit.DAYS);

        Duration d = Duration.between(lcd2.atStartOfDay(), lcd.atStartOfDay());

        System.out.println(pastWeek);
        System.out.println(nextWeek);
        System.out.println(d.toDays());
    }
}
