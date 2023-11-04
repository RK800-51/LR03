package lr3;
// Фибоначчи с while

import java.util.Scanner;

public class Task3While {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел последовательности Фибоначчи (не менее 2)");
        Scanner id = new Scanner(System.in);
        int count = id.nextInt();
        if (count < 2) {
            System.out.println("Число меньше допустимого");
        }
        else {
            int i = 2;
            int fib1 = 1, fib2 = 1;
            int fib3;
            System.out.print(fib1 + " " + fib2 + " ");
            while (i < count) {
                fib3 = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib3;
                System.out.print(fib2 + " ");
                i++;
            }
        }

    }
}
