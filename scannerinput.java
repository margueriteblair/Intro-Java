import java.math.BigDecimal;
import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        System.out.println(x);

        int y = scanner.nextInt();
        System.out.println(y);
        int a = y + 10;
        System.out.println(a);
        BigDecimal money = scanner.nextBigDecimal();
    }
}