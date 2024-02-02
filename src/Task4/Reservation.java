package Task4;

public class Reservation {

public Room room;
public Integer duration;
public Integer ReservationID;
private Integer ReservationCounter=1;

public float PaymentMoney;
Reservation(Room room,Integer duration){
    this.room=room;
    this.duration=duration;
    this.ReservationID=ReservationCounter++;
}

public float GetPaymentMoney(){
    PaymentMoney=duration*room.getBalance();
    return PaymentMoney;
}


}
