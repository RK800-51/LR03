package lr3;

import java.util.Scanner;

public class Task5For {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел для суммы");
        Scanner id = new Scanner(System.in);
        int count = id.nextInt();
        int amount = 0, sum = 0;

        for (int i = 4; ; i++) {
            if  (i % 3 == 1 || i % 5 == 2) {
                sum += i;
                amount +=1;
                System.out.print(i + " ");
            }
            if (amount == count) {
                break;
            }

            }
        System.out.println();
        System.out.printf("Сумма: %d", sum);


            }
}


