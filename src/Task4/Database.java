package Task4;

import java.util.ArrayList;

public class Database {

    public static ArrayList<Room>Rooms=new ArrayList<>();
    public static ArrayList<Reservation>Reservations=new ArrayList<>();

    Database(){
        Rooms.add(new Room("Single",100,10));
        Rooms.add(new Room("Double",200,8));
        Rooms.add(new Room("Suite",500,5));
    }



}
