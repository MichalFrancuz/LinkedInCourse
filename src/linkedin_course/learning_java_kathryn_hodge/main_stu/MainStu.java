package linkedin_course.learning_java_kathryn_hodge.main_stu;

import linkedin_course.learning_java_kathryn_hodge.student_profile_ex.StudentProfileEx;

public class MainStu {
    public static void main(String[] args) {
        StudentProfileEx student1 = new StudentProfileEx("Jurek", "Ktoś",
                2025, 4.4, "cybersecurity");
        StudentProfileEx student2 = new StudentProfileEx("Marcin", "Taki",
                2027, 2.2, "digital marketing");

        System.out.println(student1.getGPA() + " " + student1.getExpectedYearToGraduate());

        System.out.println(student2.getGPA() + " " + student2.getExpectedYearToGraduate());
    }
}
