//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//“Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FinalTask {
    public static void main(String[] args) throws FileNotFoundException {
        Notebook notebook = new Notebook();
        notebook.readFile();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int choice = menu(scanner);
            System.out.println();
            switch (choice) {
                case 1 -> notebook.printFile(notebook.notebooks);
                case 2 -> filtration(notebook, scanner);
                case 0 -> {
                    flag = false;
                    System.out.println("Спасибо, приходите ещё!");
                }
            }
        }
    }

    private static int menu(Scanner input) {
        System.out.println("Выберите пункт меню:");
        System.out.print("""
                1. Отобразить доступные ноутбуки
                2. Поиск ноутбука по заданным параметрам
                0. Выход из программы
                : """);
        return input.nextInt();
    }

    private static void filtration(Notebook book, Scanner input) {
        System.out.println("Выберите параметр поиска: ");
        book.printFields();
        System.out.print(": ");
        int choose = input.nextInt() - 1;
        System.out.println();
        ArrayList<String> resultSearch = book.findParameters(choose);
        book.printSet(resultSearch, choose);
        System.out.print(": ");
        String chooseParam = resultSearch.get(input.nextInt() - 1);
        System.out.println();
        ArrayList<String[]> result = book.findFiltered(choose, chooseParam);
        book.printFile(result);
    }
}
