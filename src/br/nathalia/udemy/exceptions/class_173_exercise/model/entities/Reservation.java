package br.nathalia.udemy.exceptions.class_173_exercise.model.entities;

import br.nathalia.udemy.exceptions.class_173_exercise.model.exceptions.CheckOutNotValidException;
import br.nathalia.udemy.exceptions.class_173_exercise.model.exceptions.ReservationDateBeforePresentMomentException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static java.time.LocalDate.now;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) throws CheckOutNotValidException {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        if (checkout.isBefore(checkin)) throw new CheckOutNotValidException();
        this.checkout = checkout;
    }

    public long duration() {
        return checkin.until(checkout, ChronoUnit.DAYS);
    }

    public void updateDates(LocalDate newCheckinDate, LocalDate newCheckoutDate) throws ReservationDateBeforePresentMomentException {
        if (newCheckinDate.isBefore(now()) || newCheckoutDate.isBefore(now())) {
            throw new ReservationDateBeforePresentMomentException();
        }
        this.checkin = newCheckinDate;
        this.checkout = newCheckoutDate;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Reservation: Room " + roomNumber + ", check-in: " + dtf.format(checkin) + ", check-out: " + dtf.format(checkout) + ", " + duration() + " nights";
    }
}
