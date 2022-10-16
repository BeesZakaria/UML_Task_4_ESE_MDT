package Vehicles;

import java.util.Date;

public class MotorVehicle {
    public String getCategory() {
        return Category;
    }

    private final String Category = "";

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    private Date reservationDate;
}
