import java.util.Scanner;

public class comparisonops {
    public static void main(String[] args) {
        System.out.println("How old are you?");

        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Cats or dogs?");
        String animal = scanner.nextLine();

        if(age > 12 && animal.equals("dogs")) {
            System.out.println("Welcome!");
        }
    }

}