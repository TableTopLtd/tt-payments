package si.fri.tabletop.payments;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class PaymentsBean {

    public static List<Payment> getPayments(){
        return PaymentsDatabase.getPayments();
    }
    public static Payment addPayment(Payment payment) { return PaymentsDatabase.addPayment(payment); }
}
