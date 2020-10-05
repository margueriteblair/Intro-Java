import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class arrayList {
    public static void main(String[] args) {
        int[] grades2 = {1, 2, 3, 4, 5};
        List<Integer> grades3 = Arrays.asList(4, 3, 2, 1);
        List<Integer> grades = new LinkedList<Integer>();
        grades.add(1);
        grades.add(2);
        System.out.println(grades);
        //interesting because you don't need to Arrays.toString();
        System.out.println(Arrays.toString(grades3.toArray()));

        for (int i =0; i < grades.size(); i++) {
            grades.set(i, grades.get(i)*2);
            System.out.println((grades.get(i)));
        }

        for (int grade : grades) {
            System.out.println(grade);
        }
    
    }
}