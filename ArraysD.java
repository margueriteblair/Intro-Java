import java.util.Arrays;

public class ArraysD {
    public static void main(String[] args) {
        int[][] grades = {{1, 3, 5}, {8, 4, 2},{4, 6, 2}};

        System.out.println(grades[1][1]);

        System.out.println(Arrays.deepToString(grades));

        for (int i = 0; i < grades.length; i++) {
            for(int k = 0; k < grades[i].length; k++) {
                System.out.println(grades[i][k]);
            }
        }
    }
}