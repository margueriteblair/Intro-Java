import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class nestedforeach {
    public static void main(String[] args) {
        List<List<Integer>> allGrades = new ArrayList<List<Integer>>();
        allGrades.add(Arrays.asList(4, 2, 1, 3, 7, 2));
        allGrades.add(Arrays.asList(4, 3, 4, 4, 9, 2));
        allGrades.add(Arrays.asList(44, 37, 59, 90, 80, 2));

        for (List<Integer> grades : allGrades) {
            for (int grade: grades) {
                System.out.println(grade + " ");
            }
            System.out.println();
        }

    }
}