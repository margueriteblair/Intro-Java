
public class GenericList<T> {
    // T represents the type of objects
    private T[] items = (T[]) new Object[10]; 
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}