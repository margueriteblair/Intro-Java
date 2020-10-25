package collections;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("B");
        queue.add("a");
        queue.offer("d"); //will return a boolean

        var front = queue.peek();
        System.out.println(front);
    }
}