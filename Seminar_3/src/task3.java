import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ArrayList<String>> books = new ArrayList<>();
        String[] genres = {"Проза", "Поэзия", "Документальная"};
        for (int i = 0; i < genres.length; i++) {
            books.add(new ArrayList<>());
            books.get(i).add(genres[i]);
            for (int j = 0; j < 3; j++) {
                System.out.printf("Введите %d-e название произведения в жанре %s: ", j + 1, genres[i]);
                books.get(i).add(scanner.nextLine());
            }
        }
        System.out.println(books);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.format("%15s\t", books.get(j).get(i));
            }
            System.out.println();
        }
        scanner.close();
    }
}
