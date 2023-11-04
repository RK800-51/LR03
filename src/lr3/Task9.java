package lr3;

import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int[] lst = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int value = rand.nextInt(10);
            lst[i] = value;
            System.out.print(lst[i] + " ");
        }
        System.out.println();
        int min = lst[0];
        for (int i = 1; i < 10; i++) {
            if (lst[i] <= min) {
                min = lst[i];
            }
        }
        System.out.print("Минимум: " + min + " ");
        System.out.print("Индексы минимума: ");
        for (int i = 0; i < 10; i++) {
            if (lst[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}
