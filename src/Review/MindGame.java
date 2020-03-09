package Review;
import java.util.Scanner;
public class MindGame {
    public static void main(String[] args) {
        String input = "i";
        Scanner scanner = new Scanner(System.in);

        while (!input.equalsIgnoreCase("You won"));
        System.out.println("Let's talk a little");
            System.out.println(" you said "+input);
        if(input.equalsIgnoreCase("Hello")){
            System.out.println("I know I will win");
        }
    }
}
