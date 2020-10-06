import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class sortlist {
    public static void main(String[] args) {
        List<Integer> allGrades = Arrays.asList(4, 3, 1, 6, 7);
        Collections.sort(allGrades);
        Collections.reverse(allGrades);
        for (int grade: allGrades) {
            System.out.println(grade);
        }
        
    }
}