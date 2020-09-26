import java.util.Scanner;

public class MySweetProgram {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //type scanner name scanner and then you set it equal to a constructor of the class
        System.out.println("Hello " + name);
    }

}

//import helps us make our code more concise
//no java.util.Scanner
//static, you don't need to make an instance of something
//scanner object isn't static