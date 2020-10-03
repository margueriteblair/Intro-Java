public class continueProgram {
    public static void main(String[] args) {
        //continue just exits that iteration of the loop
        for (int i = 9; i >= 0; i--) {
            for (int k = i; k >=0; k--) {
                if (k == 5) {
                    continue;
                    //when i = 5, it skips over that portion of the loop
            }
            System.out.println(k + " ");
        }
        System.out.println();
        }
    }
}