package collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    //represents an ordered collection
    //collection doesn't care about order
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add(0, "!"); //can edit the different index

    // Collections.addAll(list, "d," "e", "f");
    list.remove(0); //remove by index of the list
    //collections alone do not support indexing
    list.indexOf("a");
}