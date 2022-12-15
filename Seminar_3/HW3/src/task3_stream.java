//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class task3_stream {
    public static void main(String[] args) {
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(randomNum.nextInt(0, 10));
        }
        System.out.printf("Array: %s\n", arr);
        System.out.printf("Minimum: %s\nMaximum: %s\nMean: %s",
                Collections.min(arr),
                Collections.max(arr),
                arr.stream()
                        .mapToDouble(a -> a)
                        .sum() / size);
    }
}
