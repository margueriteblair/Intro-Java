public class nestedloops {
    public static void main(String[] args) {
        for (int i = 9; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.println(j + " ");
            }
            // System.out.println(); //ten iterations of ten iterations!
        }
    }
}