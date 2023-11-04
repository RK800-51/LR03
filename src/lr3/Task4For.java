package lr3;
// задание 4 с for
import java.util.Scanner;

public class Task4For {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner id1 = new Scanner(System.in);
        int num1 = id1.nextInt();
        System.out.println("Введите второе число");
        Scanner id2 = new Scanner(System.in);
        int num2 = id2.nextInt();

        int minimum = Math.min(num1, num2);
        int maximum = Math.max(num1, num2);

        for (; minimum <= maximum; minimum++) {
            System.out.print(minimum + " ");
        }
    }

}
