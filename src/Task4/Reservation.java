package Task4;

/**
 * The Reservation class represents a reservation for a room for a specific duration.
 */
public class Reservation {

public Room room;
public Integer duration;
public Integer ReservationID;
private Integer ReservationCounter=1;

public float PaymentMoney;
    /**
     * Constructor to create a new reservation with the specified room and duration.
     *
     * @param room     The room to be reserved.
     * @param duration The duration of the reservation in days.
     */
Reservation(Room room,Integer duration){
    this.room=room;
    this.duration=duration;
    this.ReservationID=ReservationCounter++;
}
    /**
     * Calculates and retrieves the payment amount for the reservation.
     *
     * @return The payment amount for the reservation.
     */

public float GetPaymentMoney(){
    PaymentMoney=duration*room.getBalance();
    return PaymentMoney;
}


}
