import java.util.Scanner;

/**
 * Re-created by jjheffernan on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        String user1 = "Alice"; // user one
        String user2 = "Bob"; // user two

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username here: ");
        String username = scan.nextLine();

        if(username.equals(user1)|username.equals(user2)) {
            System.out.println("Welcome to your code, Zipcoder");

        } else {
            System.out.println("incorrect user, please contact admin\n");
        }

    }
}
