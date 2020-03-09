package Review;
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        String userName="user";
        String password = "password";

        Scanner scanner = new Scanner(System.in);
        System.out.println("User name");
        String user = scanner.next();
        System.out.println("Password");
        String pass = scanner.next();

        if(user.equals(userName) && password.equals(pass)){

            System.out.println("Welcome to your page");
        }
        else
            System.out.println("Invalid entry");
    }
}
