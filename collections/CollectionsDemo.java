package collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        Collections.addAll(collection, "d", "e", "f");
        //... means you can pass a variable number of args
        System.out.println(collection.size());
    }
}