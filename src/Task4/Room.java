package Task4;

public class Room {

    private String Category;
    private float Balance;

    private Integer AvailableNumberOfRooms;



   public Room(String Category,float Balance,Integer AvailableNumberOfRooms){
        this.Category=Category;
        this.Balance=Balance=Balance;
        this.AvailableNumberOfRooms=AvailableNumberOfRooms;
    }

    public String getCategory() {
        return Category;
    }
    public float getBalance(){
        return Balance;
    }

    public Integer getAvailableNumberOfRooms(){
        return AvailableNumberOfRooms;
    }
    public boolean setAvailableNumberOfRooms(Integer NoOfRooms){
       if(AvailableNumberOfRooms>=NoOfRooms){
          ( this.AvailableNumberOfRooms) -=NoOfRooms;
          return true;
       }
       else{
           return false;
       }
    }

}
