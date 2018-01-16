package si.fri.tabletop.reservations;

public class Reservation {

    private String id;
    private String placeId;
    private String customerId;
    private Long reservationTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Long getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(Long reservationTime) {
        this.reservationTime = reservationTime;
    }
}
