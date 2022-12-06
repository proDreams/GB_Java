import java.time.LocalTime;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int now1 = LocalTime.now().getHour();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = input.nextLine();
        if (now1 >= 5 && now1 <= 11) {
            System.out.printf("Доброе утро, %s", name);
        } else if (now1 >= 12 && now1 <= 17) {
            System.out.printf("Добрый день, %s", name);
        } else if (now1 >= 18 && now1 <= 22) {
            System.out.printf("Добрый вечер, %s", name);
        } else {
            System.out.printf("Доброй ночи, %s", name);
        }
        input.close();
    }
}
