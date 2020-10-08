package OOPIntro;

public class createclass {
    public static void main(String[] args) {
        User user = new User();
        user.firstName = "Margie";
        user.lastName = "Blair";

        String message = user.output();
        System.out.println(message);
    }
}