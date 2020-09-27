import java.util.Scanner;

public class MySweetProgram2 {
    public static void main(String[] args) { //main is a method
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        String string = new String("This is a string.");
        String easier = "Wow that was easy"; //new way to create strings


        System.out.println(easier + " : ) ");

    }
}

//operator works on operands to make the expression possible
//the plus symbol is also an operator
//java has made a more simple way to make strings

//string literals is just the value
//any time we just put the value as the variable, that is the value
//we can also use expressions to assign variables
//when we combine two literals that makes an expression

