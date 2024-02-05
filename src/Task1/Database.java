package Task1;


import java.util.ArrayList;

/**
 * The Database class manages a collection of student grades.
 */
public class Database {

    /**
     * ArrayList to store the grades of all students.
     */
    public static ArrayList<Student> StudentsGrades=new ArrayList<>();

    /**
     * Adds the grades of a student to the database.
     *
     * @param student The Student object containing grades to be added.
     */
    public void AddStudentGrades(Student student){
        StudentsGrades.add(student);
    }
    /**
     * Retrieves the grades of a student by name.
     *
     * @param name The name of the student whose grades need to be retrieved.
     * @return The Student object containing the grades, or null if the student is not found.
     */
    public Student GetStudentGrades(String name){
        for(Student student:StudentsGrades){
            if(student.Name.equals(name)){
                return student;
            }
        }
        return null;
    }

}
