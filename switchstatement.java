import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        System.out.println(("What's your name?"));

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        switch(name) {
            case "Margie":
            //code
            System.out.println("Welcome!");
            break;
            case "Caleb":
            //code
            System.out.println("Not allowed.");
            break;
            default: 
            System.out.println("Try again later");
            break;
            //default acts as a catch all
        }
    }
}