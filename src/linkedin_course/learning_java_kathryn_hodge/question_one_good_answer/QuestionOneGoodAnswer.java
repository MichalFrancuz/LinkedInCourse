package linkedin_course.learning_java_kathryn_hodge.question_one_good_answer;

import java.util.Scanner;

public class QuestionOneGoodAnswer {

    public static void main(String[] args) {
        String question = "What is it?";
        String choiceOne = "pilot";
        String choiceTwo = "smartphone";
        String choiceThree = "coffee";

        System.out.println(question);
        System.out.println(choiceOne + " or " + choiceTwo + " or " + choiceThree);

        // Write a print statement asking
        // Write a print statement giving the answer choices

        Scanner s = new Scanner(System.in);
        String userInput = s.next();
        // Have the user input an answer
        // Retrieve the user's input

        if (choiceTwo.equals(userInput.toLowerCase())) System.out.println("Congratulations! Answer is correct.");
        else System.out.println("We are sorry. Answer is incorrect. The correct answer is: " + choiceTwo);
        // If the user's input matches the correctAnswer...
        // then the user is correct, and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect, and we want to print out a message saying
        // that the user is incorrect as well as what the correct choice was.

    }

}