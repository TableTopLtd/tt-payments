package si.fri.tabletop.payments.api.v1.resources;

import com.kumuluz.ee.logs.cdi.Log;
import si.fri.tabletop.payments.Payment;
import si.fri.tabletop.payments.PaymentsBean;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
@Path("/payments")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Log
public class PaymentsResource {

    @Inject
    private PaymentsBean paymentsBean;

    @GET
    public Response getPayments() {

        List<Payment> payments = paymentsBean.getPayments();
        return Response.ok(payments).build();
    }

    @POST
    public Response addPayment(Payment payment) {
        payment = paymentsBean.addPayment(payment);

        if (payment.getId() != null) {
            return Response.status(Response.Status.CREATED).entity(payment).build();
        } else {
            return Response.status(Response.Status.CONFLICT).entity(payment).build();
        }
    }
}
