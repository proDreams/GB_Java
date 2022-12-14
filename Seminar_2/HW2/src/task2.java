//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task2 {
    public static void main(String[] args) throws IOException {
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        int[] arr = new int[arraySize];
        createArray(arr, randomNum, arraySize);
        System.out.println(Arrays.toString(arr));
        strangeSort(arr, arraySize);
        System.out.println(Arrays.toString(arr));
    }

    private static void createArray(int[] array, ThreadLocalRandom rand, int size) {
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(0, 10);
        }
    }

    private static void strangeSort(int[] array, int size) throws IOException {
        FileHandler file = new FileHandler("Seminar_2/HW2/src/task2_log.xml", true);
        Logger logger = Logger.getLogger(task2.class.getName());
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                logger.addHandler(file);
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
                logger.log(Level.INFO, Arrays.toString(array));
            }
        }
    }
}
