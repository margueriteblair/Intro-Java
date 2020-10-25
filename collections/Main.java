package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("B"));
        customers.add(new Customer("C"));
        customers.add(new Customer("BA"));
        Collections.sort(customers);

    }
}