package lr3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите длину массива");
        Scanner id = new Scanner(System.in);
        int len = id.nextInt();
        int[] nums = new int[len];
        int digit = 2;

        for (int i = 0; i < len; i++) {
            nums[i] = digit;
            digit += 5;
        }

    }
}
