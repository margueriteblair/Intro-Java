package collections;

public class Customer implements Comparable<Customer> {
    private String name;
    private String email;

    public Customer(String name, email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public int compareTo(Customer other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
        //it's very common to override the toString method
    }
}