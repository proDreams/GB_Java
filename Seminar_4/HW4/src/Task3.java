//* В калькулятор добавьте возможность отменить последнюю операцию.

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Object> calc = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        calc.add(scanner.nextInt());
        System.out.print("Введите второе число: ");
        calc.add(scanner.nextInt());
        calc.add("");
        while (true) {
            System.out.print("Введите оператор */+- : ");
            calc.set(2, scanner.next());
            calculate(calc);
            if (calc.get(3) == "Ошибка!") {
                break;
            }
            System.out.print("\nИзменить оператор? Д/Н: ");
            String choice = scanner.next().toUpperCase();
            if (choice.equals("Н") || choice.equals("N")) {
                break;
            }
        }
    }

    private static void calculate(ArrayList<Object> arr) {
        int first = (int) arr.get(0);
        int second = (int) arr.get(1);
        switch ((String) arr.get(2)) {
            case "+" -> {
                int temp = first + second;
                arr.add(temp);
                System.out.printf("%d + %d = %d", first, second, temp);
            }
            case "-" -> {
                int temp = first - second;
                arr.add(temp);
                System.out.printf("%d - %d = %d", first, second, temp);
            }
            case "*" -> {
                int temp = first * second;
                arr.add(temp);
                System.out.printf("%d * %d = %d", first, second, temp);
            }
            case "/" -> {
                int temp = first / second;
                arr.add(temp);
                System.out.printf("%d / %d = %d", first, second, temp);
            }
            default -> {
                arr.add("Ошибка!");
                System.out.print("Ошибка!");
            }
        }
    }
}
