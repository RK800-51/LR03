package lr3;
// Фибоначчи с for

import java.util.Scanner;

public class Task3For {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел последовательности Фибоначчи (не менее 2)");
        Scanner id = new Scanner(System.in);
        int count = id.nextInt();
        if (count < 2) {
            System.out.println("Число меньше допустимого");
        }
        else {
            int fib1 = 1, fib2 = 1;
            int fib3;
            System.out.print(fib1 + " " + fib2 + " ");
            for (int i = 2; i < count; i++){
                fib3 = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib3;
                System.out.print(fib2 + " ");
            }
        }
    }
}
