package Task4;

import java.util.Scanner;


/**
 * The HotelReservationApp class serves as an application for interacting with room reservations.
 */
public class HotelReservationApp {
    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    Controller controller=new Controller();

    
    /**
     * Main method to initiate the HotelReservationApp and guide users through reservation actions.
     */
    public void HotelReservationApp(){
        System.out.println("Welcome to HotelReservationApp ");
        while (true){
            System.out.println("Enter your choice:");
            System.out.println("1)Make room reservation");
            System.out.println("2)View Booking details");
            System.out.println("3)Exit");

            String Choice=input.nextLine();
            switch (Choice){
                case "1":
                    System.out.println("Enter the room category that you want to reserve");
                    String category=input.nextLine();
                    System.out.println("Enter number of rooms  that you want to reserve");
                    Integer noofrooms= Integer.valueOf(input2.nextLine());
                    System.out.println("Enter the duration that you want to reserve");
                    Integer duration= Integer.valueOf(input2.nextLine());
                    if(controller.MakeReservation(category,noofrooms,duration)!=null){
                        Reservation reservation=controller.MakeReservation(category,noofrooms,duration);
                        System.out.println("Your ReservationId is "+ reservation.ReservationID);
                        System.out.println("Reservation done Successfully");
                    }
                    else{
                        System.out.println("Something went wrong during reservation");
                    }
                    break;
                case "2":
                    System.out.println("Enter Reservation ID ");
                    Integer ReservationID=input2.nextInt();

                    if(controller.ViewBookingDetails(ReservationID)!=null){
                        Reservation reservation=controller.ViewBookingDetails(ReservationID);
                        System.out.println("Reservation for ID "+ ReservationID);
                        System.out.println("Room Category: "+reservation.room.getCategory());
                        System.out.println("Reservation duration "+reservation.duration+" days.");
                        System.out.println("Reservation cost "+reservation.GetPaymentMoney()+"$");
                    }
                    else{
                       System.out.println("There is no Reservation with this ID.");
                    }
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Please enter correct choice");
                    break;
            }
        }
    }

}
