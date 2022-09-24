package linkedin_course.learning_java_kathryn_hodge.salary_calculator;

public class SalaryCalculator {

    public static double salaryCalculator(double workHoursPerWeek,
                                          double amountMoney, double vacationsDay) {
        if (workHoursPerWeek < 0) {
            return -1;
        }
        if (amountMoney < 0) {
            return -1;
        }
        double unpaidTime = vacationsDay * 8 * amountMoney;
        return (52.14 * workHoursPerWeek * amountMoney) - unpaidTime;

    }

    public static void main(String[] args) {
        double sal = salaryCalculator(25, 35, 0);
        System.out.println(sal + "$");
    }
}