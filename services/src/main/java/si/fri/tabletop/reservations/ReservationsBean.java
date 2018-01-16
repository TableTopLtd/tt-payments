package si.fri.tabletop.reservations;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ReservationsBean {

    public static List<Reservation> getReservations(){
        return ReservationsDatabase.getReservations();
    }
}
