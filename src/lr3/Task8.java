package lr3;

public class Task8 {
    public static void main(String[] args) {
        char[] lst = new char[10];
        char A = 65;

        for (int i = 0; i < 10; i++) {
            lst[i] = (A != 65 && A != 69 && A != 73) ? A : ++A;
            A += 1;
            System.out.print(lst[i] + " ");
            }
        }
}

