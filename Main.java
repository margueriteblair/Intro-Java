public class Main {
    public static void main(String[] args) {
        
        ByTwos byTwos = new ByTwos();

        Series ob;

        for (int i = 0; i < 5; i++) {
            ob = byTwos;
            System.out.println(ob.getNext());

            ob = byThrees;
            System.out.println(ob.getNext());
        }
    }
}