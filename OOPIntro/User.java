package OOPIntro;

public class User {
    //empty right now
    public String firstName;
    public String lastName;


    public void output(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(firstName + " " + lastName);
        }
    }
}