package Task1;


import java.util.ArrayList;

public class Database {

    public static ArrayList<Student> StudentsGrades=new ArrayList<>();

    public void AddStudentGrades(Student student){
        StudentsGrades.add(student);
    }

    public Student GetStudentGrades(String name){
        for(Student student:StudentsGrades){
            if(student.Name.equals(name)){
                return student;
            }
        }
        return null;
    }

}
