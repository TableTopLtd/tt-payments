package si.fri.tabletop.reservations.api.v1.resources;

import com.kumuluz.ee.logs.cdi.Log;
import si.fri.tabletop.reservations.Reservation;
import si.fri.tabletop.reservations.ReservationsBean;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
@Path("/reservations")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Log
public class ReservationsResource {

    @Inject
    private ReservationsBean reservationsBean;

    @GET
    public Response getReservations() {

        List<Reservation> reservations = reservationsBean.getReservations();
        return Response.ok(reservations).build();
    }

}
