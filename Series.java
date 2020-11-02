public interface Series {
    
    int getNext();

    default void printStuff() {
        System.out.println("Live from NY, it's Saturday night!");
    }

    private void printMoreStuff() {
        System.out.println("Print more stuff");
    }
}