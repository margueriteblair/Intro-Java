import java.util.Scanner;

public class whileloops {
    
    public static void main(String[] args) {

    System.out.println(("Guess the password:"));
    String password = "Hello";
    Scanner scanner = new Scanner(System.in);
    String guess = scanner.nextLine();

    while(!guess.equals(password)) {
        System.out.println("Guess the password:");
        guess = scanner.nextLine();
    }
    
    System.out.println("Congrats, you're in!");

    }
}