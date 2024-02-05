package Task1;

/**
 * The Student class represents a student and their grades in various subjects.
 */
public class Student {

    public String Name;
    private float EnglishGrade;
    private float MAthGrade;
    private float ArabicGrade;
    private float ScienceGrade;
    private float SocialStudiesGrade;

    private float TotalGrades;
    /**
     * Constructor to initialize a Student object with grades.
     *
     * @param Name             The name of the student.
     * @param EnglishGrade     The English grade of the student.
     * @param MAthGrade        The Math grade of the student.
     * @param ArabicGrade      The Arabic grade of the student.
     * @param ScienceGrade     The Science grade of the student.
     * @param SocialStudiesGrade The Social Studies grade of the student.
     */
    public Student(String Name,float EnglishGrade,float MAthGrade,float ArabicGrade,float ScienceGrade,float SocialStudiesGrade) {
        this.Name = Name;
        this.EnglishGrade = EnglishGrade;
        this.MAthGrade = MAthGrade;
        this.ArabicGrade = ArabicGrade;
        this.ScienceGrade = ScienceGrade;
        this.SocialStudiesGrade = SocialStudiesGrade;
    }


    /**
     * Retrieves the Math grade of the student.
     *
     * @return The Math grade of the student.
     */
    public float GetMAthGrade() {
        return MAthGrade;
    }

    /**
     * Retrieves the Arabic grade of the student.
     *
     * @return The Arabic grade of the student.
     */
    public float GetArabicGrade() {
        return ArabicGrade;
    }

    /**
     * Retrieves the English grade of the student.
     *
     * @return The English grade of the student.
     */
    public float GetEnglishGrade() {
        return EnglishGrade;
    }

    /**
     * Retrieves the Science grade of the student.
     *
     * @return The Science grade of the student.
     */
    public float GetScienceGrade() {
        return ScienceGrade;
    }

    /**
     * Retrieves the Social Studies grade of the student.
     *
     * @return The Social Studies grade of the student.
     */
    public float GetSocialStudiesGrade() {
        return SocialStudiesGrade;
    }

    /**
     * Calculates and retrieves the total grades of the student.
     *
     * @return The total grades of the student.
     */
    public float GetTotalGrades() {
        this.TotalGrades = (this.EnglishGrade + this.MAthGrade + this.ArabicGrade + this.ScienceGrade + this.SocialStudiesGrade);
        return TotalGrades;
    }


}
