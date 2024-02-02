package Task1;

public class Student {

    public String Name;
    private float EnglishGrade;
    private float MAthGrade;
    private float ArabicGrade;
    private float ScienceGrade;
    private float SocialStudiesGrade;

    private float TotalGrades;

    public Student(String Name,float EnglishGrade,float MAthGrade,float ArabicGrade,float ScienceGrade,float SocialStudiesGrade) {
        this.Name = Name;
        this.EnglishGrade = EnglishGrade;
        this.MAthGrade = MAthGrade;
        this.ArabicGrade = ArabicGrade;
        this.ScienceGrade = ScienceGrade;
        this.SocialStudiesGrade = SocialStudiesGrade;
    }

    public float GetMAthGrade(){
        return MAthGrade;
    }

    public float GetArabicGrade(){
        return ArabicGrade;
    }

    public float GetEnglishGrade(){
        return EnglishGrade;
    }

    public float GetScienceGrade(){
        return ScienceGrade;
    }

    public float GetSocialStudiesGrade(){
        return SocialStudiesGrade;
    }
    public float GetTotalGrades(){
        this.TotalGrades= (this.EnglishGrade+this.MAthGrade+this.ArabicGrade+this.ScienceGrade+this.SocialStudiesGrade);
        return  TotalGrades;
    }

}
