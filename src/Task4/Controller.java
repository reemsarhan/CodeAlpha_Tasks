package Task4;

public class Controller {
    public Database DB=new Database();

    public Reservation MakeReservation(String Category,int noOfRooms,int Duartion){

        for(Room room:DB.Rooms){
            if(room.getCategory().equals(Category)&&room.getAvailableNumberOfRooms()>=noOfRooms){
                Reservation reservation=new Reservation(room,Duartion);
                DB.Reservations.add(reservation);
                return reservation;
            }
        }
        return null;
    }

    public Reservation ViewBookingDetails(Integer ReservationID){
        for(Reservation reservation:DB.Reservations){
            if(reservation.ReservationID.equals(ReservationID)){
                return reservation;
            }
        }
        return null;
    }

}
