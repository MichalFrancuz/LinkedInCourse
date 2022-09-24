package linkedin_course.learning_java_kathryn_hodge.while_loop;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off of repeat?");
            String userInput = input.next();
            if (userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");
    }
}