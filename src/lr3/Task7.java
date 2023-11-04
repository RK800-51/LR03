package lr3;

public class Task7 {
    public static void main(String[] args) {
        char[] lst = new char[10];
        char a = 97;
        for (int i = 0; i < lst.length; i++) {
            lst[i] = a;
            a += 2;
            System.out.print(lst[i] + " ");
        }
        System.out.println();
        for (int i = lst.length - 1; i > -1; i--) {
            System.out.print(lst[i] + " ");
        }

    }
}
