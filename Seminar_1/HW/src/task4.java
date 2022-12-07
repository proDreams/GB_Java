//*+Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 1?9 + 2? = 131
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите уравнение: ");
        String expression = input.nextLine().replace(" + ", " ").replace(" = ", " ");
        String[] exp = expression.split(" ");
        String q = exp[0];
        String w = exp[1];
        int e = Integer.parseInt(exp[2]);
        int[] result = parseExp(q, w, e);
        System.out.printf("%d + %d = %d", result[0], result[1], e);
    }

    private static int[] parseExp(String left, String middle, int right) {
        int[] numbers = new int[2];
        for (int i = 0; i < 10; i++) {
            int q = Integer.parseInt(left.replace("?", String.valueOf(i)));
            for (int j = 0; j < 10; j++) {
                int w = Integer.parseInt(middle.replace("?", String.valueOf(j)));
                if (q + w == right) {
                    numbers[0] = q;
                    numbers[1] = w;
                    return numbers;
                }
            }
        }
        return numbers;
    }
}