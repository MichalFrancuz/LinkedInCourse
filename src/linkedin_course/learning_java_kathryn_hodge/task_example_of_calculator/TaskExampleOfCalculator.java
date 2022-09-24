package linkedin_course.learning_java_kathryn_hodge.task_example_of_calculator;

public class TaskExampleOfCalculator {

    public static double calculateTotalMealPrice(double listedMealPrice,
                                                 double tipRate,
                                                 double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        return listedMealPrice + tip + tax;
    }

    public static void main(String[] args) {
        int howMuchPeople = 5;
        double cal = calculateTotalMealPrice(20, .11, .08);
        System.out.println("Total price of meat $" + cal);
        double individualPrice = cal / howMuchPeople;
        System.out.println("Price on one person $" + individualPrice);
    }
}