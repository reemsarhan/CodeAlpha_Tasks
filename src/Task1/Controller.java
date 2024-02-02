package Task1;
import java.util.Scanner;
public class Controller {

   Database DB=new Database();
Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    public void AddStudentGrades(Student student){
        if(student!=null) DB.AddStudentGrades(student);
}

public void GetStudentGrades(String name){

  Student student=DB.GetStudentGrades(name);

  if(student!=null){
      System.out.println("Student "+student.Name+" grades :");
      System.out.println("Total Score : "+student.GetTotalGrades());
      System.out.println("English: "+student.GetEnglishGrade());
      System.out.println("Arabic: "+student.GetArabicGrade());
      System.out.println("Math: "+student.GetMAthGrade());
      System.out.println("Science: "+student.GetScienceGrade());
      System.out.println("SocialStudies: "+student.GetSocialStudiesGrade());
      System.out.println();
  }
  else {
      System.out.println("No Student found with this name");
  }
}

 public void GetAllStudentsGrades(){
    System.out.println("ALL Student Grades:");
    for(Student student :DB.StudentsGrades){
        GetStudentGrades(student.Name);
        System.out.println();
    }

 }

 public void AddStudent(){
    System.out.println("Enter Student name:");
     String name = input2.nextLine();
     System.out.println("Enter English grade:");
     float EnglishGrade = Float.parseFloat(input.nextLine());
     System.out.println("Enter Arabic grade:");
     float ArabicGrade = Float.parseFloat(input.nextLine());
     System.out.println("Enter Math  grade:");
     float MAthGrade = Float.parseFloat(input.nextLine());
     System.out.println("Enter Science grade:");
     float ScienceGrade = Float.parseFloat(input.nextLine());
     System.out.println("Enter  SocialStudies grade:");
     float SocialStudies = Float.parseFloat(input.nextLine());
     Student s=new Student(name,EnglishGrade,MAthGrade,ArabicGrade,ScienceGrade,SocialStudies);
     AddStudentGrades(s);
 }


    public float AverageGrades() {
        float total = 0;
        for (Student student : DB.StudentsGrades) {
            total += student.GetTotalGrades();
        }
        total/=DB.StudentsGrades.size();
        return total;
    }
    public float GetHighestScores() {
        float Max = 0;
        for (Student student : DB.StudentsGrades) {
            Max=Math.max(Max,student.GetTotalGrades());
        }
        return Max;
    }
    public float GetLowestScores() {
        float Min = 1e9F;
        for (Student student : DB.StudentsGrades) {
            Min=Math.min(Min,student.GetTotalGrades());
        }
        return Min;
    }


}
