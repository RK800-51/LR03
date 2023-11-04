package lr3;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int[] lst = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int value = rand.nextInt(10);
            lst[i] = value;
            System.out.print(lst[i] + " ");
        }
        System.out.println();
        int tmp;
        for (int i = 0; i < 9; i++) {
            for (int j = i+1; j < 10; j++) {
                if (lst[j] > lst[i]) {
                    tmp = lst[i];
                    lst[i] = lst[j];
                    lst[j] = tmp;
                }
            }
        }
        System.out.println("Отсортированный по убыванию массив: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(lst[i] + " ");
        }
    }
}
