import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        String password = "Let me in";
        System.out.println("What is your password: ");

        Scanner scanner = new Scanner(System.in);

        String guess = scanner.nextLine();

        System.out.println(password.equals(guess));

        if(password.equals(guess)) {
            System.out.println("Your guess was correct!");
            return;
        }
        System.out.println("This won't run if returned");
}
}