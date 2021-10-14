package model;

public class ParkingAttendent extends Account {
    PaymentService paymentService;

    public boolean processVehicleEntry(Vehicle vehicle){
        return false;
    }

    public PaymentInfo processPayment(ParkingTicket parkingTicket, PaymentType paymentType) {
        return null;
    }
}
