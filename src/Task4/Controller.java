package Task4;

/**
 * The Controller class handles the logic for making and viewing room reservations.
 */
public class Controller {
    /**
     * Database instance for managing room and reservation information.
     */
    public Database DB=new Database();
    /**
     * Makes a room reservation based on the specified category, number of rooms, and duration.
     *
     * @param Category    The category of rooms to be reserved.
     * @param noOfRooms   The number of rooms to be reserved.
     * @param Duration    The duration of the reservation in days.
     * @return The Reservation object if the reservation is successful, otherwise null.
     */
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

    /**
     * Retrieves booking details for a specific reservation ID.
     *
     * @param ReservationID The ID of the reservation for which booking details are requested.
     * @return The Reservation object if found, otherwise null.
     */
    public Reservation ViewBookingDetails(Integer ReservationID){
        for(Reservation reservation:DB.Reservations){
            if(reservation.ReservationID.equals(ReservationID)){
                return reservation;
            }
        }
        return null;
    }

}
