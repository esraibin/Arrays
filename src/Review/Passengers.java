package Review;
import java.util.Scanner;
public class Passengers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your destination : Europe, Africa, Asia, America");
        String destination = scanner.nextLine();

        if(destination.equalsIgnoreCase("Europe")){
            System.out.println("Gate A");
        }
        else if (destination.equalsIgnoreCase("Africa")){
            System.out.println("Gate B");
        }
        else if (destination.equalsIgnoreCase("Asia")){
            System.out.println("Gate C");
        }
        else if (destination.equalsIgnoreCase("America")){
            System.out.println("Gate D");
        }
        else{
            System.out.println("Invalid entry");
        }
    }
}
