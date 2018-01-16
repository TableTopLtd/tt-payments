package si.fri.tabletop.reservations;


import java.util.ArrayList;
import java.util.List;

public class ReservationsDatabase {

    private static List<Reservation> reservations = new ArrayList<>();

    public static List<Reservation> getReservations() {
        return reservations;
    }

    public static Reservation getReservation(String reservationId) {
        for (Reservation reservation : reservations) {
            if (reservation.getId().equals(reservationId))
                return reservation;
        }

        return null;
    }

    public static void addReservetion(Reservation reservation) {
        reservations.add(reservation);
    }

    public static void deleteCustomer(String reservationId) {
        for (Reservation reservation : reservations) {
            if (reservation.getId().equals(reservationId)) {
                reservations.remove(reservation);
                break;
            }
        }
    }
}

