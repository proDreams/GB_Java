//Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.


import java.util.Scanner;
import java.util.Stack;

public class task2 {
    public static void main(String[] args) {
        Stack<String> texts = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Для добавления элемента в список введите <текст> и нажмите 'ENTER';\n" +
                    ANSI_BLUE + "Для вывода списка и выхода из программы введите print;\n" +
                    ANSI_RED + "Для удаления последнего введённого элемента введите revert;\n\n" + ANSI_RESET);
            System.out.print(ANSI_GREEN + "Введите строку: " + ANSI_RESET);
            String text = scanner.nextLine();
            if (text.contains("print")) {
                System.out.println(texts);
                flag = false;
            } else if (text.contains("revert")) {
                System.out.printf("Элемент %s удалён\n", texts.get(0));
                texts.remove(0);
                System.out.println(texts);
            } else {
                texts.add(0, text);
                System.out.println(texts);
            }
        }
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

}