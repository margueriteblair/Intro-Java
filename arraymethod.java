import java.util.Arrays;

public class arraymethod {
    public static void main(String[] args) {
        int[] grades = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(grades));

        int[][] grades2 = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        System.out.println(Arrays.deepToString(grades2));
    }
}