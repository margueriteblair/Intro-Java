package collections;

import java.util.Iterator;
import java.util.ListIterator;

public class GenericList<T> implements Iterable<T> {

    public T[] items = (T[]) new Object[10];

    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    private class ListIterator implements Iterator<T> {
        private GenericList<T> list;
        private int index;

        public ListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return (index < list.count);
        }

        @Override
        public T next() {
            // TODO Auto-generated method stub
            return list.items[index++];
        }
        
    }
    
}