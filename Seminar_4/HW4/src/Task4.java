// ** Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.
// http://primat.org/news/obratnaja_polskaja_zapis/2016-04-09-1181
// Вычислить запись если это возможно.
// (Объяснение подобной задачи есть в лекции)

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String[] infix = input.nextLine().split("");
        ArrayList<String> postfix = infixToPostfix(infix);
        System.out.printf("Выражение в постфиксной записи: %s\n", postfix);
        int result = calculatePostfix(postfix);
        System.out.printf("Результат вычисления выражения: %d", result);
    }

    private static ArrayList<String> infixToPostfix(String[] inf) {
        ArrayList<String> result = new ArrayList<>();
        String temp = "";
        String op = "";
        for (int i = 0; i < inf.length; i++) {
            try {
                int num = Integer.parseInt(inf[i]);
                temp += inf[i];
                if (i == inf.length - 1) {
                    result.add(temp);
                    result.add(op);
                }
            } catch (NumberFormatException e) {
                result.add(temp);
                temp = "";
                if (op.isEmpty()) {
                    op += inf[i];
                } else {
                    result.add(op);
                    op = "" + inf[i];
                }
            }
        }
        return result;
    }

    private static int calculatePostfix(ArrayList<String> pos) {
        int result = 0;
        int i = 0;
        while (pos.size() > 0) {
            if (!checkInt(pos.get(i))) {
                if (i == 2) {
                    result = calculate(pos.get(i - 2), pos.get(i - 1), pos.get(i));
                    pos.remove(i);
                    pos.remove(i - 1);
                    pos.remove(i - 2);
                    i = 0;
                } else {
                    result = calculate(String.valueOf(result), pos.get(i - 1), pos.get(i));
                    pos.remove(i);
                    pos.remove(i - 1);
                    i = 0;
                }
            } else {
                i++;
            }
        }
        return result;
    }

    private static boolean checkInt(String str) {
        try {
            int num = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static Integer calculate(String num1, String num2, String op) {
        Integer result = 0;
        int first = Integer.parseInt(num1);
        int second = Integer.parseInt(num2);
        switch (op) {
            case "+" -> {
                result = first + second;
            }
            case "-" -> {
                result = first - second;
            }
            case "*" -> {
                result = first * second;
            }
            case "/" -> {
                result = first / second;
            }
            default -> {
                System.out.print("Ошибка!");
            }
        }
        return result;
    }
}

