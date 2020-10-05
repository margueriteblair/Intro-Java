import java.util.Arrays;
import java.util.Scanner;

public class arraymethod {
    public static void main(String[] args) {
        int[] grades = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(grades));

        int[][] grades2 = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        System.out.println(Arrays.deepToString(grades2));

        int[] grades3 = new int[10];
        for (int i = 0; i < 10; i++) {
            grades3[i] = i;
        }
        System.out.println(Arrays.toString(grades3));

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] grades4 = new int[size];

        for (int i = 0; i < size; i++) {
            int x = input.nextInt();
            grades4[i] = x;
        }
        System.out.println(Arrays.toString(grades4));
    }
}