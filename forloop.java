public class forloop {
    public static void main(String[] args) {
        boolean additionalLogging = false;
        //syntactically different from the while loop
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 3) {
                if (additionalLogging == true) {
                    System.out.println("We found 3");

                }
            }
        }
    }
}