package lr3;
import java.util.Scanner;

public class Task1 {
    public static  void main(String[] args) {
        System.out.println("Введите номер дня недели (число от 1 до 7)");
        Scanner id = new Scanner(System.in);
        int day = id.nextInt();
        switch (day) {
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("Введено некорректное значение");
        }
    }

}
