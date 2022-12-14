package linkedin_course.learning_java_kathryn_hodge.student_profile_ex;

public class StudentProfileEx {
    String firstName;
    String lastName;

    public int getExpectedYearToGraduate() {
        return expectedYearToGraduate;
    }

    public double getGPA() {
        return GPA;
    }

    private int expectedYearToGraduate;
    private final double GPA;
    String declaredMajor;

    public StudentProfileEx(String firstName, String lastName,
                            int expectedYearToGraduate, double GPA,
                            String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
        if (this.GPA < 3.0) {
            yearOfEnd();
        }
    }

    public void yearOfEnd() {
        this.expectedYearToGraduate = this.expectedYearToGraduate + 1;
    }
}