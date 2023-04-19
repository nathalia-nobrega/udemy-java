package br.nathalia.udemy.date_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormattingExample {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm");
        DateTimeFormatter dtfInstante = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm").withZone(ZoneId.systemDefault());

        LocalDate localDate = LocalDate.parse("2023-09-24");
        LocalDateTime localDateTime = LocalDateTime.parse("2023-09-24T13:34");
        Instant instant = Instant.now();

        // instant to local date with specific time zone
        LocalDateTime lcd = LocalDateTime.ofInstant(instant, ZoneId.of("Etc/GMT-4"));



        System.out.println(dtf.format(localDate));
        System.out.println(dtf2.format(LocalDate.parse("2023-09-24")));
        System.out.println(dtfInstante.format(instant));
        System.out.println(dtf2.format(lcd));
        System.out.println(lcd.getDayOfWeek());

    }
}
