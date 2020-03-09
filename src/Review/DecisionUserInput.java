package Review;
import java.util.Scanner;
public class DecisionUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Does it breathe air? : Y,N");
        String breatheAir = scanner.nextLine();
        System.out.println("Does animal lay eggs?: Y,N");
        String layEggs = scanner.nextLine();

        if (breatheAir.equalsIgnoreCase("Y")) {
            if (layEggs.equalsIgnoreCase("Y")) {
                System.out.println("Bird");

            } else {
                System.out.println("Mammal");

            }
        }
        else{
            System.out.println("Fish");

    }
    }
}
