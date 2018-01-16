package si.fri.tabletop.payments;


import java.util.ArrayList;
import java.util.List;

public class PaymentsDatabase {

    private static List<Payment> payments = new ArrayList<>();

    public static List<Payment> getPayments() {
        return payments;
    }

    public static Payment getPayment(String paymentId) {
        for (Payment payment : payments) {
            if (payment.getId().equals(paymentId))
                return payment;
        }

        return null;
    }

    public static Payment addPayment(Payment payment) {
        payments.add(payment);

        return payment;
    }

    public static void deletePayment(String paymentId) {
        for (Payment payment : payments) {
            if (payment.getId().equals(paymentId)) {
                payments.remove(payment);
                break;
            }
        }
    }
}

