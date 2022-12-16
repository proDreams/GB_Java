//Реализовать консольное приложение, которое:
//Принимает от пользователя строку вида
//text~num
//Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.


import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> outputs = new LinkedList<>();
        while (true) {
            System.out.print("""
                    Для добавления элемента введите <текст>~<индекс>
                    Для вывода элемента введите print~<индекс>
                    Для удаления элемента введите delete~<индекс>
                    Для выхода введите exit~0\n\n""");
            String inputs = addInput(scan);
            String[] temp = inputs.split("~");
            int index = Integer.parseInt(temp[1]);
            if (temp[0].equals("print")) {
                if (index < outputs.size()) {
                    System.out.println(outputs.get(index));
                } else {
                    System.out.println("Элемент не найден");
                }
            } else if (temp[0].equals("delete")) {
                if (index < outputs.size()) {
                    System.out.printf("Элемент %s удалён\n", outputs.get(index));
                    outputs.remove(index);
                    System.out.println(outputs);
                } else {
                    System.out.println("Элемент не найден");
                }
            } else if (temp[0].equals("exit")) {
                break;
            } else {
                parseInput(outputs, temp[0], index);
                System.out.println(outputs);
            }
        }
    }

    private static String addInput(Scanner scanner) {
        System.out.print("Введите значение: ");
        return scanner.nextLine();
    }

    private static void parseInput(List<String> output, String text, int ind) {
        if (ind > output.size()) {
            output.add(text);
        } else {
            output.add(ind, text);
        }
    }
}
