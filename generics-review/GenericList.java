
public class GenericList<T extends Comparable & Cloneable> {
    //T extends Number means that T will only be able to support
    //children of the Number class, in wrapper form of course
    //this assumes we'll make some methods that are only applicable for numbers
    // T represents the type of objects
    //comparable interface
    private T[] items = (T[]) new Object[10]; 
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}