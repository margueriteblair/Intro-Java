public class breakProgram {
    public static void main(String[] args) {
        for(int i = 9; i >= 0; i--) {
            for(int k=i; k>=0; k--) {
                if (k==6) {
                    break;
                }
                System.out.println(k + " ");
            }
            System.out.println();
        }
    }
}