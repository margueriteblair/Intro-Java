public class User {
    public String firstName;
    public String lastName;
    public String output() {
        return firstName + " " + lastName;
    }
    public String getFirstName() {
        return firstName.toUpperCase();
    }
}