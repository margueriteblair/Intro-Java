import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class arrayList {
    public static void main(String[] args) {
        List<Integer> grades = new LinkedList<Integer>();
        grades.add(1);
        grades.add(2);
        System.out.println(grades);
        //interesting because you don't need to Arrays.toString();
    }
}