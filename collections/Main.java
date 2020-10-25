package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("B", "e2"));
        customers.add(new Customer("C", "e3"));
        customers.add(new Customer("BA", "d4"));
        Collections.sort(customers);

    }
}