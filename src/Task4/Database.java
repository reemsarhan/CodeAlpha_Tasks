package Task4;

import java.util.ArrayList;

/**
 * The Database class manages a collection of rooms and reservations.
 */
public class Database {


    /**
     * ArrayList to store room information.
     */
    public static ArrayList<Room>Rooms=new ArrayList<>();

    /**
     * ArrayList to store reservation information.
     */
    public static ArrayList<Reservation>Reservations=new ArrayList<>();

    /**
     * Constructor to initialize the Database with some sample room information.
     */
    Database(){
        Rooms.add(new Room("single",100,10));
        Rooms.add(new Room("double",200,8));
        Rooms.add(new Room("suite",500,5));
    }



}
