package Task1;
import java.util.Scanner;

/**
 * The StudentGradeTracker class serves as the entry point for interacting with the StudentGradeTracker system.
 */
public class StudentGradeTracker {
    /**
     * Controller instance for managing student grades.
     */
    Controller controller=new Controller();
    Scanner input = new Scanner(System.in);
    /**
     * Main method to initiate the StudentGradeTracker system.
     */
    public void StudentGradeTracker(){
        System.out.println("Welcome to StudentGradeTracker System");
        while (true) {
            System.out.println("Choose the option that you want");
            System.out.println("1)Add Student Grades");
            System.out.println("2)Get Student Grades");
            System.out.println("3)View All Students Grades");
            System.out.println("4)Get Average Students Score");
            System.out.println("5)Get min Students Score");
            System.out.println("6)Get max Students Score");
            System.out.println("7)Exit");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Your Choice");
            String Choice = input.nextLine();
            switch (Choice) {
                case "1":
                    controller.AddStudent();
                    break;
                case "2":
                    System.out.print("Enter Student name:");
                    String name = input.nextLine();
                    System.out.println();
                    controller.GetStudentGrades(name);
                    break;
                case "3":
                    controller.GetAllStudentsGrades();
                    break;
                case "4":
                    System.out.println("Average Students Score: "+controller.AverageGrades());
                    break;
                case "5":
                    System.out.println("Lowest Students Score: "+ controller.GetLowestScores());

                    break;
                case "6":
                    System.out.println("Highest Students Score: "+ controller.GetHighestScores());
                    break;
                case "7":
                    return;
                default:
                    System.out.println("Please enter correct choice");
                    break;
            }
        }
    }
}
