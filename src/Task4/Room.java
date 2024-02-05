package Task4;


/**
 * The Room class represents a room with specific category, balance, and availability information.
 */
public class Room {

    private String Category;
    private float Balance;

    private Integer AvailableNumberOfRooms;


    /**
     * Constructor to create a new room with the specified category, balance, and availability.
     *
     * @param Category               The category of the room.
     * @param Balance                The cost associated with the room.
     * @param AvailableNumberOfRooms The initial number of available rooms.
     */
   public Room(String Category,float Balance,Integer AvailableNumberOfRooms){
        this.Category=Category;
        this.Balance=Balance=Balance;
        this.AvailableNumberOfRooms=AvailableNumberOfRooms;
    }

    /**
     * Retrieves the category of the room.
     *
     * @return The category of the room.
     */
    public String getCategory() {
        return Category;
    }

    /**
     * Retrieves the cost associated with the room.
     *
     * @return The cost of the room.
     */
    public float getBalance() {
        return Balance;
    }

    /**
     * Retrieves the number of available rooms of this category.
     *
     * @return The number of available rooms.
     */
    public Integer getAvailableNumberOfRooms() {
        return AvailableNumberOfRooms;
    }

    /**
     * Sets the number of available rooms of this category after a reservation.
     *
     * @param NoOfRooms The number of rooms to be reserved.
     * @return True if the reservation is successful and rooms are available, false otherwise.
     */
    public boolean setAvailableNumberOfRooms(Integer NoOfRooms) {
        if (AvailableNumberOfRooms >= NoOfRooms) {
            this.AvailableNumberOfRooms -= NoOfRooms;
            return true;
        } else {
            return false;
        }
    }
}