import java.util.Scanner;

public class stringcomparison {
    public static void main(String[] args) {
        String password = "let me in";
        System.out.println("Guess the password: ");

        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();

        System.out.println(password.equals(guess));

        //comparison operator ==
        //system out print .equals method
    }
}