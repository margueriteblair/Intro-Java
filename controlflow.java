import java.util.Scanner;

public class controlflow {
    public static void main(String[] args) {
        String password = "let me in";
        System.out.println("Guess the password: ");

        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();

        System.out.println(password.equals(guess)); //we either get true or false
        //we can bring our app using an if statement

        if (password.equals(guess)) {
            //code to execute
            System.out.println("Your guess was correct!");
        } else {
            System.out.println("Wrong password, try again.");
        }
    }
}