package lr3;

import java.util.Scanner;

public class Task5While {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел для суммы");
        Scanner id = new Scanner(System.in);
        int count = id.nextInt();
        int amount = 0, sum = 0, i = 4;

        while (amount < count) {
            if  (i % 3 == 1 || i % 5 == 2) {
                sum += i;
                amount +=1;
                System.out.print(i + " ");
            }
            i++;
            }

        System.out.println();
        System.out.printf("Сумма: %d", sum);


    }
}
